package javaSocket应用;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// 创建一个服务器端Socket（ServerSocket）,指定绑定的端口，并监听
		ServerSocket serverSocket = new ServerSocket(8888);// >1023
		// 调用accept()方法监听，等待客户端的链接
		System.out.println("***服务器即将启动，等待客户的链接中***");
		// 记录客户端连接的数量
		int count = 0;
		Socket socket = null;
		// 循环监听等待客户端的连接
		while (true) {
			socket = serverSocket.accept();
			// 创建一个新的线程
			ServerThread serverThread = new ServerThread(socket);
			// 启动线程
			serverThread.start();
			count++;
			System.out.println(count + "个客户端在运行！");

			InetAddress address = socket.getInetAddress();
			System.out.println("客户IP:" + address.getHostAddress());
		}
	}

}
