package java���ŵ�һ��;

public class conditional {
	public static void main(String[] args) {
		// if���
		int one = 20;
		if (one % 2 == 0) {
			System.out.println("one��ż��");
		}

		// if else���
		int age1 = 25;
		if (age1 >= 18) {
			System.out.println("����");
		} else {
			System.out.println("δ����");
		}

		// ����if else���
		int age2 = 25;
		if (age2 > 60) {
			System.out.println("����");
		} else if (age2 > 40) {
			System.out.println("����");
		} else if (age2 > 18) {
			System.out.println("����");
		} else {
			System.out.println("ͯ��");
		}

		// Ƕ��if���
		int score = 94;
		String sex = "Ů";
		if (score > 80) {
			if (sex.equals("��")) {
				System.out.println("�������������");
			} else {
				System.out.println("����Ů�������");
			}
		} else {
			System.out.println("û�н������");
		}

		// switch��� ע��'��'������"��"
		char today = '��';

		switch (today) {
		case 'һ':
		case '��':
		case '��':
			System.out.println("�԰���");
			break;
		case '��':
		case '��':
		case '��':
			System.out.println("������");
			break;
		default:
			System.out.println("����ϯ�ײ�");
		}
	}
}
