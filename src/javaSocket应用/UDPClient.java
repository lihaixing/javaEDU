package javaSocketӦ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws IOException {
		// ����������ĵ�ַ���˿ںš�����
		InetAddress address = InetAddress.getByName("localhost");
		int port = 8800;
		byte[] data = "�û�����admin;���룺123".getBytes();
		// �������ݱ����������͵�������Ϣ
		DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
		// ����DatagramSocket����
		DatagramSocket socket = new DatagramSocket();
		// ��������˷������ݱ�
		socket.send(packet);

		// �������ݱ�
		byte[] data2 = new byte[1024];
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
		socket.receive(packet2);
		String reply = new String(data2, 0, packet.getLength());
		System.out.println("���ǿͻ��ˣ�������˵��" + reply);
	}

}
