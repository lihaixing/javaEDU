package javaSocketӦ��;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressClass {
	public static void main(String[] args) throws UnknownHostException {
		// ��ȡ������InetAddressʵ��
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���������" + address.getHostName());
		System.out.println("IP��ַ��" + address.getHostAddress());
		// ��ȡ�ֽ�������ʽ��ip��ַ
		byte[] bytes = address.getAddress();
		System.out.println("�ֽ�������ʽ��IP:" + Arrays.toString(bytes));
		System.out.println(address);

		// ��ȡ��������
		InetAddress address2 = InetAddress.getByName("lenovo-PC");
		InetAddress address3 = InetAddress.getByName("192.168.1.100");
		System.out.println(address2);
		System.out.println(address3);
	}
}
