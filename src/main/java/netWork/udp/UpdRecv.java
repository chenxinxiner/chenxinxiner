package netWork.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP协议接收方
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/29 20:05
 * @description：UDP协议接收方
 * @modified By：
 * @version: $
 */
public class UpdRecv {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);

        System.out.println("UdpRecv:我在等待消息");
        ds.receive(dp);
        System.out.println("UdpRecv:我接收到消息");

        String strRecv = new String(dp.getData(), 0, dp.getLength()) +
                " from " + dp.getAddress().getHostAddress() + ":" + dp.getPort();

        System.out.println(strRecv);

        Thread.sleep(1000);
        System.out.println("UdpRecv:我要发送消息");
        String str = "hello world 222";
        final DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("127.0.0.1"), dp.getPort());
        ds.send(datagramPacket);
        System.out.println("UdpRecv:我发送消息结束");
        ds.close();

    }
}
