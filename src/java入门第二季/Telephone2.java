package java���ŵڶ���;

public class Telephone2 {

	public static void main(String[] args) {
		// �ֲ����������ڷ�����
		int a = 5;

		Telephone phone1 = new Telephone();
		phone1.call();
		phone1.getPhoneInfo();// ��Ĭ��ֵ

		// ��phone1�����е����Ը�ֵ
		phone1.screen = 5.8f;
		phone1.cpu = 2.9f;
		phone1.getPhoneInfo();// 2.7 2.7>2.9>2.8
	}

}
