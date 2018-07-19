package nia.chapter10;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 20:38 2018/7/17
 * @Modified By:
 */
public class CharToByteEncoder extends MessageToByteEncoder<Character> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Character msg, ByteBuf out) throws Exception {
        out.writeChar(msg);
    }
}
