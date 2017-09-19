package javaSocket应用;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// 创建一个服务器端Socket（ServerSocket）,指定绑定的端口，并监听
		ServerSocket serverSocket = new ServerSocket(8888);// >1023
		// 调用accept()方法监听，等待客户端的链接
		System.out.println("***服务器即将启动，等待客户的链接中***");
		Socket socket = serverSocket.accept();
		// 获取输入流，读取客户端信息
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);// 转化成字符流
		BufferedReader br = new BufferedReader(isr);// 为输入流添加缓冲
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("我是服务器，客户端说：" + info);
		}
		socket.shutdownInput();// 关闭输入流
		// 关闭其他资源
		br.close();
		isr.close();
		is.close();
		socket.close();
		serverSocket.close();

	}

}
