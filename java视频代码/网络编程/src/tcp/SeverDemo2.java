package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2019-07-26
 */

//TCP面向连接，必须先开服务端
public class SeverDemo2 {
    public static void main(String[] args) throws IOException {

        /*
         * 建立tcp服务端的思路：
         * 1.创建服务端socket服务，通过ServerSocket对象
         * 2.服务端必须对外提供一个端口，否则客户端无法连接
         * 3.获取连接过来的客户端对象
         * 4.通过客户端对象获取socket流读取客户端发来的数据
         *      并打印在控制台上
         * 5.关闭资源，关客户端，关服务端
         */

        //1.创建服务端对象
        ServerSocket ss = new ServerSocket(10002);

        //2.获取连接过来的客户端对象
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        //3.通过socket对象获取输入流，要读取客户端发来的数据
        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        String text = new String(buf, 0, len);
        System.out.println(ip + text);


        //使用客户端socket对象的输出流给客户端返回数据
        OutputStream out = s.getOutputStream();
        out.write("收到".getBytes());


        s.close();
        ss.close();
    }
}
