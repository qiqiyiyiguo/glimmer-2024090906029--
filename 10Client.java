import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.io.Writer;

public class client {
    public static void main(String[] args) throws IOException {


        //建立一个与服务器的链接
        SocketAddress serverAddr = new InetSocketAddress("127.0.0.1", 5000);
        SocketChannel socketChannel = SocketChannel.open(serverAddr);


//从这个链接创建并获取一个Reader
        Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);//reader是底层字节流和高层字符流的桥梁
//创建或获取一个BufferReader并读取
        BufferedReader bufferedReader = new BufferedReader(reader);//将BufferReader串联到reader
        String message = bufferedReader.readLine();

        System.out.println("服务器：" + message);

        //建立一个与服务器的链接

        //从这个链接创建并获取一个Writer
        Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);
        //创建一个PrintWriter并打印一些内容
        PrintWriter printWriter = new PrintWriter(writer);
        writer.write("message to send");
        writer. write("another message");
        writer.flush();
        writer.close();
    }
}