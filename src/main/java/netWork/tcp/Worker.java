package netWork.tcp;

import java.io.*;
import java.net.Socket;

/**
 * 每个socket的工作
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/29 21:38
 * @description：每个socket的工作
 * @modified By：
 * @version: $
 */
public class Worker implements Runnable {

    private Socket socket;

    public Worker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("服务人员已启动");
            //同一个通道，服务端的输出流就是客户端的输入流，服务端的输入流就是客户端的输出流
            InputStream ips = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(ips));

            //开启通道的输出流
            OutputStream ops = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(ops);

            while (true) {
                String s = br.readLine();
                System.out.println("client said :" + s + ":" + s.length());
                if ("quit".equalsIgnoreCase(s)) {
                    break;
                }
                String strEcho = s + " 666";
                System.out.println("server said:" + strEcho + " :" + strEcho.length());
                dos.writeBytes(s + "--->" + strEcho + System.getProperty("line.separator"));
            }
            br.close();
            dos.close();
            ops.close();
            ips.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
