package javaSocket应用;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket,指定服务器地址和端口
		Socket socket = new Socket("127.0.0.1", 8888);
		// 获取输出流，向服务器端发送信息
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);// 输出流包装为打印流
		pw.write("用户名：admin;密码：123");
		pw.flush();
		socket.shutdownOutput();
		pw.close();
		os.close();
		socket.close();

	}
}
