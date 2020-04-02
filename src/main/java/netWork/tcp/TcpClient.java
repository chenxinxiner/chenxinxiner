package netWork.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TCP客户端
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/29 21:17
 * @description：TCP客户端
 * @modified By：
 * @version: $
 */
public class TcpClient {

    public static void main(String[] args) throws Exception {
        //需要服务器端先开启
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8002);
        //同一个通道，服务端的输出流就是客户端的输入流，服务端的输入流就是客户端的输出流
        InputStream inputStream = socket.getInputStream();
        BufferedReader brNet = new BufferedReader(new InputStreamReader(inputStream));

        //开启通道的输出流
        OutputStream ops = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ops);
        final BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String strWord = brKey.readLine();
            if ("quit".equalsIgnoreCase(strWord)) {
                break;
            } else {
                System.out.println("I want to send " + strWord);
                dos.writeBytes(strWord + System.getProperty("line.separator"));
                System.out.println("Server said " + brNet.readLine());
            }

        }

        dos.close();
        ops.close();
        brNet.close();
        inputStream.close();
        socket.close();


    }
}
