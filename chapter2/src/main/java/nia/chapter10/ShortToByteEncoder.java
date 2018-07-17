package nia.chapter10;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 19:37 2018/7/17
 * @Modified By:
 */
public class ShortToByteEncoder extends MessageToByteEncoder<Short> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Short msg, ByteBuf out) throws Exception {
        out.writeShort(msg);
    }
}
