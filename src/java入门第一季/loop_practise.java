package java���ŵ�һ��;

import java.util.Scanner;

public class loop_practise {
	public static void main(String[] args) {
		// �ж�һ������С��10λ����λ��
		int num = 999;
		int count = 0;
		do {
			num = num / 10;
			count++;
		} while (num > 0);

		System.out.println("����һ��" + count + "λ����!");

		// ͨ��java�е�scanner����ȡ����ֵ
		// 1.����java.util.Scanner
		// 2.����Scanner����
		// 3.���ܲ������û������ֵ
		// int score=input.nextInt();
		// double score=input.nextdouble();
		// String score=input.next();

		Scanner input = new Scanner(System.in);

		/* System.out.print()�����Ϣ�󲻻ỻ�� */
		System.out.print("���û�����ɼ���");
		int score = input.nextInt();
		System.out.println("������ĳɼ��ǣ�" + score);

		Scanner input2 = new Scanner(System.in);
		int score2, sum3 = 0;
		double avg;
		for (int i = 1; i <= 2; i++) {
			sum3 = 0;
			System.out.println("***�������" + i + "���༶�ĳɼ�***");
			for (int j = 1; j <= 4; j++) {
				System.out.println("�������" + i + "���༶�ĵ�" + j + "��ͬѧ�ĳɼ�");
				score2 = input2.nextInt();
				sum3 += score2;
			}
			avg = sum3 / 4;
			System.out.println("��" + i + "���༶��ƽ���ɼ�Ϊ" + avg);
		}

	}
}

