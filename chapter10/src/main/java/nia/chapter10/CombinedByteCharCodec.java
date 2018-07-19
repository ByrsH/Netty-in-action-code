package nia.chapter10;

import io.netty.channel.CombinedChannelDuplexHandler;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 20:39 2018/7/17
 * @Modified By:
 */
public class CombinedByteCharCodec extends CombinedChannelDuplexHandler<ByteToCharDecoder, CharToByteEncoder> {
    public CombinedByteCharCodec() {
        super(new ByteToCharDecoder(), new CharToByteEncoder());
    }
}
