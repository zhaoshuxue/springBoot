import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.Timer;
import org.junit.jupiter.api.Test;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class Test1 {


    @Test
    public void test1(){
//        Timer timer = new Timer();

//        timer.newTimeout(this, 1, TimeUnit.SECONDS);


    }


    @Test
    public void t() {
        EventLoopGroup group = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();

        bootstrap.group(group)
                .channel(NioSocketChannel.class)
        ;
    }


    @Test
    public void nio() {
        Buffer buffer = ByteBuffer.allocate(1024);
    }
}
