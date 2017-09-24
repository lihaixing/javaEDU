package javaSocketӦ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//�������ˣ�����UDP���û���¼
public class UDPServer {
	public static void main(String[] args) throws IOException {
		// ������������DatagramSocket,ָ���˿�
		DatagramSocket socket = new DatagramSocket(8800);
		// �������ݱ������ڽ��ܿͻ��˷��͵�����
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		// ���ܿͻ��˷��͵����ݣ����������ݱ��У���������֮ǰ��������һֱ�ڵ�
		socket.receive(packet);
		// ��ȡ����
		String info = new String(data, 0, packet.getLength());
		System.out.println("���Ƿ��������ͻ���˵��" + info);
		// ����������Ӧ�ͻ���
		// ����ͻ��˵�ַ���˿ںš�����
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		System.out.println(port);
		byte[] data2 = "��ӭ����".getBytes();
		// �������ݱ���������Ӧ��������Ϣ
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
		// ��Ӧ�ͻ���
		socket.send(packet2);
		// �ر���Դ
		socket.close();
	}
}
