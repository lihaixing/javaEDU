package javaSocket应用;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlClass {
	public static void main(String[] args) throws IOException {
		URL imooc = new URL("http://www.imooc.com");
		URL url = new URL(imooc, "/index.html?username=tom#test");
		System.out.println("协议信息：" + url.getProtocol());
		System.out.println("主机：" + url.getHost());
		// 如果未指定端口号，则使用默认的端口号，此时getPort方法返回-1
		System.out.println("端口：" + url.getPort());
		System.out.println("文件路径：" + url.getPath());
		System.out.println("文件名：" + url.getFile());
		System.out.println("相对路径：" + url.getRef());
		System.out.println("查询字符串：" + url.getQuery());

		// 读取网页上的内容
		URL baidu = new URL("http://www.baidu.com");
		// 获取资源输入流
		InputStream in = baidu.openStream();
		// 转换成字符输入流
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		// 为字符输入流添加缓冲,一次读一行
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while (data != null) {
			System.out.println(data);
			data = br.readLine();
		}
	}
}
