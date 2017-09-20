package javaSocket应用;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		pw.write("用户名：admin2;密码：1234");
		pw.flush();
		socket.shutdownOutput();
		// 获取输入流，读取服务器的响应信息
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("我是客户端，服务端说：" + info);
		}
		socket.shutdownInput();// 关闭输入流
		is.close();
		br.close();
		pw.close();
		os.close();
		socket.close();

	}
}
