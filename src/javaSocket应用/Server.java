package javaSocketӦ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// ����һ����������Socket��ServerSocket��,ָ���󶨵Ķ˿ڣ�������
		ServerSocket serverSocket = new ServerSocket(8888);// >1023
		// ����accept()�����������ȴ��ͻ��˵�����
		System.out.println("***�����������������ȴ��ͻ���������***");
		Socket socket = serverSocket.accept();
		// ��ȡ����������ȡ�ͻ�����Ϣ
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);// ת�����ַ���
		BufferedReader br = new BufferedReader(isr);// Ϊ��������ӻ���
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("���Ƿ��������ͻ���˵��" + info);
		}
		socket.shutdownInput();// �ر�������
		// �ر�������Դ
		br.close();
		isr.close();
		is.close();
		socket.close();
		serverSocket.close();

	}

}
