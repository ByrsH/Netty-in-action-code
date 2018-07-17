package nia.chapter10;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 19:05 2018/7/17
 * @Modified By:
 */
public class IntegerToStringDecoder extends MessageToMessageDecoder<Integer> {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, Integer msg, List<Object> out) throws Exception {
        out.add(String.valueOf(msg));
    }
}
