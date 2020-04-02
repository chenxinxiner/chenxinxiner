package netWork.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * upd发送
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/29 20:13
 * @description：upd发送
 * @modified By：
 * @version: $
 */
public class UdpSend {

    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String str = "hello world";

        final DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("127.0.0.1"), 3000);
        System.out.println("UdpSend：我要发信息");
        ds.send(datagramPacket);
        System.out.println("UdpSend:我发送消息结束");

        Thread.sleep(1000);

        byte[] buf = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(buf, 1024);
        System.out.println("UdpSend:我等待接收信息");
        ds.receive(dp2);
        System.out.println("UdpSend:我接收到消息");

        String strRecv = new String(dp2.getData(), 0, dp2.getLength()) +
                " from " + dp2.getAddress().getHostAddress() + ":" + dp2.getPort();

        System.out.println(strRecv);

        ds.close();

    }
}
