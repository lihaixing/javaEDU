package java�еĽ���;

import java.util.Arrays;

public class RaixMain {
	// longת���ֽ�����
	public static byte[] long2Bytes(long id) {
		byte[] arr = new byte[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = (byte) ((long) (id >> i * 8) & 0xff);
		}

		return arr;
	}

	// �ֽ�����ת��long
	public static long bytes2Long(byte[] arr) {
		long result=0;
		for(int i=0;i<arr.length;i++){
			long rs0 = (long) ((arr[i] & 0xff) << i * 8);
			result += rs0;
		}
		return result;
	}

	// Intת���ֽ�����
	public static byte[] int2Bytes(int id) {
		byte[] arr = new byte[4];
		arr[0] = (byte) ((int) (id >> 0 * 8) & 0xff);
		arr[1] = (byte) ((int) (id >> 1 * 8) & 0xff);
		arr[2] = (byte) ((int) (id >> 2 * 8) & 0xff);
		arr[3] = (byte) ((int) (id >> 3 * 8) & 0xff);
		return arr;
	}

	// �ֽ�����ת��Int
	public static int bytes2Int(byte[] arr) {
		int rs0 = (int) ((arr[0] & 0xff) << 0 * 8);
		int rs1 = (int) ((arr[1] & 0xff) << 1 * 8);
		int rs2 = (int) ((arr[2] & 0xff) << 2 * 8);
		int rs3 = (int) ((arr[3] & 0xff) << 3 * 8);
		return rs0 + rs1 + rs2 + rs3;
	}

	public static void main(String[] args) {
		RaixMain rm = new RaixMain();
		// ʮ����ת��������
		System.out.println(Integer.toBinaryString(1112));// ת���ɶ�����
		System.out.println(Integer.toHexString(112));// ת���ɰ˽���
		System.out.println(Integer.toOctalString(112));// ת����ʮ������
		// ��������ת��ʮ����
		System.out.println(Integer.parseInt("111001", 2));
		System.out.println(Integer.parseInt("27", 8));
		System.out.println(Integer.parseInt("A8", 16));
		// ��������ת��ʮ����
		System.out.println(Integer.valueOf("111001", 2));
		System.out.println(Integer.valueOf("27", 8));
		System.out.println(Integer.valueOf("A8", 16));

		Integer a = 8143;
		System.out.println(a.byteValue());
		// �ַ���ת�ֽ�����
		String b = "haixing";
		System.out.println(Arrays.toString(b.getBytes()));
		// �ֽ�����ת�ַ���
		byte[] c = { 104, 97, 105, 120, 105, 110, 103 };
		System.out.println(new String(c));

		System.out.println(Arrays.toString(rm.int2Bytes(8143)));
		byte[] d = { -49, 31, 0, 0 };
		System.out.println(rm.bytes2Int(d));
		
		System.out.println(Arrays.toString(rm.long2Bytes(8143)));
		byte[] e = { -49, 31, 0, 0, 0, 0, 0, 0 };
		System.out.println(rm.bytes2Long(e));

	}

}
