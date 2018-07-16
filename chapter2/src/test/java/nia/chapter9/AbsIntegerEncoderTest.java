package nia.chapter9;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 16:37 2018/7/16
 * @Modified By:
 */
public class AbsIntegerEncoderTest {

    @Test
    public void encode() {
        ByteBuf buf = Unpooled.buffer();
        for (int i = 1; i < 10; i++) {
            buf.writeInt(i * -1);
        }

        EmbeddedChannel channel = new EmbeddedChannel(new AbsIntegerEncoder());
        assertTrue(channel.writeOutbound(buf));
        assertTrue(channel.finish());

        for (int i = 1; i < 10; i++) {
            assertEquals(i, channel.readOutbound());
        }
        assertNull(channel.readOutbound());
    }
}