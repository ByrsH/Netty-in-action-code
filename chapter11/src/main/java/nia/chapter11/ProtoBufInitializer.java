package nia.chapter11;

import io.netty.channel.*;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import com.google.protobuf.MessageLite;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 17:50 2018/7/19
 * @Modified By:
 */
public class ProtoBufInitializer extends ChannelInitializer<Channel> {

    private final MessageLite lite;
    public ProtoBufInitializer(MessageLite lite) {
        this.lite = lite;
    }

    @Override
    protected void initChannel(Channel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        pipeline.addLast(new ProtobufVarint32FrameDecoder());
        pipeline.addLast(new ProtobufEncoder());
        pipeline.addLast(new ProtobufDecoder(lite));
        pipeline.addLast(new MarShallingInitializer.ObjectHandler());
    }

    public static final class ObjectHandler extends SimpleChannelInboundHandler<Object> {
        @Override
        public void channelRead0(ChannelHandlerContext ctx, Object msg)
                throws Exception {
            // Do something with the object
        }
    }
}
