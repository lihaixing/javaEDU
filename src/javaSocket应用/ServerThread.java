/**
 * 
 */
package javaSocketӦ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * �������̴߳�����
 *
 */
public class ServerThread extends Thread {
	// �뱾�߳���ص�socket
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
			// ��ȡ����������ȡ�ͻ�����Ϣ
			is = socket.getInputStream();
			 isr = new InputStreamReader(is);// ת�����ַ���
			 br = new BufferedReader(isr);// Ϊ��������ӻ���
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("���Ƿ��������ͻ���˵��" + info);
			}
			socket.shutdownInput();// �ر�������
			// ��ȡ���������Ӧ�ͻ��˵�����
			 os = socket.getOutputStream();
			 pw = new PrintWriter(os);
			pw.write("��ӭ����");
			pw.flush();


		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			// �ر�������Դ
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
