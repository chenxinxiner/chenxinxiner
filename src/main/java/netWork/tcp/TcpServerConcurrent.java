package netWork.tcp;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TCP服务端可以处理多个请求
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/29 21:33
 * @description：TCP服务端可以处理多个请求
 * @modified By：
 * @version: $
 */
public class TcpServerConcurrent {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8002);
            final ExecutorService executorService = Executors.newCachedThreadPool();
            while (true) {
                final Socket s = ss.accept();
                System.out.println("来了一个client");
                executorService.submit(new Worker(s));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
