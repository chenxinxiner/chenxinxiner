package netWork.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp服务器端
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/29 21:11
 * @description：tcp服务器端
 * @modified By：
 * @version: $
 */
public class TcpServer {
    public static void main(String[] args) {
        try {
            //创建一个绑定到8001端口的TCP服务器
            ServerSocket ss = new ServerSocket(8001);
            //开启监听
            Socket s = ss.accept();

            System.out.println("Welcome to Java world");
            //有人连上来，打开输入流
            InputStream ins = s.getInputStream();
            //打开输出流
            OutputStream ops = s.getOutputStream();

            ops.write("Hello ,Client!".getBytes());

            BufferedReader br = new BufferedReader(new InputStreamReader(ins));

            System.out.println("Client said: " + br.readLine());

            ins.close();
            ops.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
