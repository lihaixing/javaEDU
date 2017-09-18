package �ļ��������;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(Integer.toBinaryString(0xff));

		String s = "Ľ��ABC";
		/*
		 * gbk��������ռ2���ֽڣ�Ӣ��ռһ���ֽ�
		 */
		byte[] bytes1 = s.getBytes("gbk");
		// byte[] bytes1 = s.getBytes();//ת�����ֽ������õ�����ĿĬ�ϵı���gbk;
		for (byte b : bytes1) {
			// ���ֽ�ת����16���� �����룩
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		/*
		 * utf��������ռ3���ֽڣ�Ӣ��ռһ���ֽ�
		 */
		byte[] bytes2 = s.getBytes("utf-8");
		for (byte b : bytes2) {
			// ���ֽ�ת����16���� �����룩
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		/*
		 * java��˫�ֽڱ��� utf-16be,���ĺ�Ӣ�Ķ���ռ2���ֽ�
		 */
		byte[] bytes3 = s.getBytes("utf-16be");
		for (byte b : bytes3) {
			// ���ֽ�ת����16���� �����룩
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		/*
		 * ���ֽ�������ĳ�ֱ���ʱ�����ֽ�ת���ַ���Ҳ��Ҫ�����ֱ��뷽ʽ��������������
		 */
		String str1 = new String(bytes2);
		System.out.println(str1);
		String str2 = new String(bytes2, "utf-8");
		System.out.println(str2);

		/*
		 * �ı��ļ� �����ֽ����� ���������������ֽ�����
		 * 
		 * ������������Ļ�����ֱ�Ӵ����ı��ļ�����ô���ļ�ֻʶ��ansi����
		 * 
		 * ��ͨ��������һ���ɺϣ����÷�����utf-8�ı���������Դ�������utf-8���룬�ļ�ʶ����
		 */

	}
}
