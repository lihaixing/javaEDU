package javaSocket应用;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressClass {
	public static void main(String[] args) throws UnknownHostException {
		// 获取本机的InetAddress实例
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名：" + address.getHostName());
		System.out.println("IP地址：" + address.getHostAddress());
		// 获取字节数组形式的ip地址
		byte[] bytes = address.getAddress();
		System.out.println("字节数据形式的IP:" + Arrays.toString(bytes));
		System.out.println(address);

		// 获取其它机器
		InetAddress address2 = InetAddress.getByName("lenovo-PC");
		InetAddress address3 = InetAddress.getByName("192.168.1.100");
		System.out.println(address2);
		System.out.println(address3);
	}
}
