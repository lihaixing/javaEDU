package javaSocketӦ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlClass {
	public static void main(String[] args) throws IOException {
		URL imooc = new URL("http://www.imooc.com");
		URL url = new URL(imooc, "/index.html?username=tom#test");
		System.out.println("Э����Ϣ��" + url.getProtocol());
		System.out.println("������" + url.getHost());
		// ���δָ���˿ںţ���ʹ��Ĭ�ϵĶ˿ںţ���ʱgetPort��������-1
		System.out.println("�˿ڣ�" + url.getPort());
		System.out.println("�ļ�·����" + url.getPath());
		System.out.println("�ļ�����" + url.getFile());
		System.out.println("���·����" + url.getRef());
		System.out.println("��ѯ�ַ�����" + url.getQuery());

		// ��ȡ��ҳ�ϵ�����
		URL baidu = new URL("http://www.baidu.com");
		// ��ȡ��Դ������
		InputStream in = baidu.openStream();
		// ת�����ַ�������
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		// Ϊ�ַ���������ӻ���,һ�ζ�һ��
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while (data != null) {
			System.out.println(data);
			data = br.readLine();
		}
	}
}
