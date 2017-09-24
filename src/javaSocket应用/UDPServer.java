package javaSocket应用;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//服务器端，基于UDP的用户登录
public class UDPServer {
	public static void main(String[] args) throws IOException {
		// 创建服务器端DatagramSocket,指定端口
		DatagramSocket socket = new DatagramSocket(8800);
		// 创建数据报，用于接受客户端发送的数据
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		// 接受客户端发送的数据，保存在数据报中，接收数据之前，阻塞，一直在等
		socket.receive(packet);
		// 读取数据
		String info = new String(data, 0, packet.getLength());
		System.out.println("我是服务器，客户端说：" + info);
		// 服务器端响应客户端
		// 定义客户端地址、端口号、数据
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		System.out.println(port);
		byte[] data2 = "欢迎您！".getBytes();
		// 创建数据报，包含响应的数据信息
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		// 响应客户端
		socket.send(packet2);
		// 关闭资源
		socket.close();
	}
}
