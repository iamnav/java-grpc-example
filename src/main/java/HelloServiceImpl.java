import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.ssl.SslClientHelloHandler;
import io.netty.util.concurrent.Future;

class HelloServiceImpl extends SslClientHelloHandler {

    @Override
    protected Future lookup(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        return null;
    }

    @Override
    protected void onLookupComplete(ChannelHandlerContext channelHandlerContext, Future future) throws Exception {

    }
}