package java���ŵ�����;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String str = " ѧϰ jaVa ��̱�";
		// �ַ�������
		System.out.println("�ַ������ȣ�" + str.length());
		// ���ҡ��ࡱ��λ�� (��һ���ֵ�λ��),�Ҳ����ͻ᷵��-1
		System.out.println("'��'��λ�ã�" + str.indexOf("��"));
		// ���ҡ��ࡱ��λ�� (���һ�γ��ֵ�λ��),�Ҳ����ͻ᷵��-1
		System.out.println("'��'��λ�ã�" + str.lastIndexOf("��"));
		// ���ո���ַ������һ������
		String strArr[] = str.split(" ");
		System.out.println("���ո��ֳ����飺" + Arrays.toString(strArr));
		// ��ȡ����[3,7)���ַ���
		System.out.println("[3,7)���ַ�����" + str.substring(3, 7));
		System.out.println("[3,+)���ַ�����" + str.substring(3));
		// ȥ��ǰ��ո�
		String strNoNull = str.trim();
		System.out.println("�޿ո���ַ�����" + strNoNull);
		// �ַ�����Сд
		System.out.println("��д�ĵ��ַ�����" + str.toUpperCase());
		System.out.println("Сд�ĵ��ַ�����" + str.toLowerCase());
		// ��ȡ�ַ���ָ��λ�õ��ַ�
		System.out.println("indexΪ1���ַ���" + str.charAt(1));
		System.out.println(str.equals(str));

		byte[] byteStr = str.getBytes();
		for (int i = 0; i < byteStr.length; i++) {
			System.out.println(byteStr[i]);
		}

		// Java�ļ���
		String fileName = "HelloWorld.java";
		int index = fileName.lastIndexOf(".");
		// ��ȡ�ļ��ĺ�׺
		String prefix = fileName.substring(index + 1);
		// �жϱ������"."�ţ��Ҳ��ܳ�������λ��ͬʱ��׺��Ϊ"java"
		System.out.println(prefix.equals("java"));// ע�����ﲻҪ�á�==��
		if (index > 0 && prefix == "java") {
			System.out.println("Java�ļ�����ȷ");
		} else {
			System.out.println("Java�ļ�����Ч");
		}

		// a���ֵĴ���
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

		// ���ִ���
		int num = 0;

		// ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
		for (int i = 0; i < s.length(); i++) {
			// ��ȡÿ���ַ����ж��Ƿ����ַ�a
			if ((s.charAt(i)) == 'a') {
				// �ۼ�ͳ�ƴ���
				num++;
			}
		}
		System.out.println("�ַ�a���ֵĴ�����" + num);



	}

}
