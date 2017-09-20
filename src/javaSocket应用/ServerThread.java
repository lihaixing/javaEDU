/**
 * 
 */
package javaSocket应用;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 服务器线程处理类
 *
 */
public class ServerThread extends Thread {
	// 与本线程相关的socket
	Socket socket = null;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			// 获取输入流，读取客户端信息
			is = socket.getInputStream();
			 isr = new InputStreamReader(is);// 转化成字符流
			 br = new BufferedReader(isr);// 为输入流添加缓冲
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("我是服务器，客户端说：" + info);
			}
			socket.shutdownInput();// 关闭输入流
			// 获取输出流，响应客户端的请求
			 os = socket.getOutputStream();
			 pw = new PrintWriter(os);
			pw.write("欢迎您！");
			pw.flush();


		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			// 关闭其他资源
			try {
				if (pw != null) {
					pw.close();
				}
				if (os != null) {
					os.close();
				}
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (is != null) {
					is.close();
				}
				socket.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
