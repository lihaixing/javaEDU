package javaSocketӦ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		pw.write("�û�����admin2;���룺1234");
		pw.flush();
		socket.shutdownOutput();
		// ��ȡ����������ȡ����������Ӧ��Ϣ
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while ((info = br.readLine()) != null) {
			System.out.println("���ǿͻ��ˣ������˵��" + info);
		}
		socket.shutdownInput();// �ر�������
		is.close();
		br.close();
		pw.close();
		os.close();
		socket.close();

	}
}
