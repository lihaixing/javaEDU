package javaSocketӦ��;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// ����һ����������Socket��ServerSocket��,ָ���󶨵Ķ˿ڣ�������
		ServerSocket serverSocket = new ServerSocket(8888);// >1023
		// ����accept()�����������ȴ��ͻ��˵�����
		System.out.println("***�����������������ȴ��ͻ���������***");
		// ��¼�ͻ������ӵ�����
		int count = 0;
		Socket socket = null;
		// ѭ�������ȴ��ͻ��˵�����
		while (true) {
			socket = serverSocket.accept();
			// ����һ���µ��߳�
			ServerThread serverThread = new ServerThread(socket);
			// �����߳�
			serverThread.start();
			count++;
			System.out.println(count + "���ͻ��������У�");

			InetAddress address = socket.getInetAddress();
			System.out.println("�ͻ�IP:" + address.getHostAddress());
		}
	}

}
