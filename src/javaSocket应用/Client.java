package javaSocketӦ��;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		// �����ͻ���Socket,ָ����������ַ�Ͷ˿�
		Socket socket = new Socket("127.0.0.1", 8888);
		// ��ȡ���������������˷�����Ϣ
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);// �������װΪ��ӡ��
		pw.write("�û�����admin;���룺123");
		pw.flush();
		socket.shutdownOutput();
		pw.close();
		os.close();
		socket.close();

	}
}
