package java���ŵ�һ��;

public class loop {
	public static void main(String[] args) {
		// whileѭ�h
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		// do whileѭ�h
		int num = 0;
		int sum = 0;
		do {
			sum += num;
			num += 2;
		} while (num <= 50);
		System.out.println(sum);

		// forѭ��
		int sum2 = 0;
		for (int k = 1; k <= 100; k++) {
			if (k % 3 == 0) {
				continue;
			}
			sum2 += k;
		}
		System.out.println(sum2);

		// break��ֹѭ��
		int sum3 = 0;
		for (int l = 1; l <= 10; l++) {
			sum3 = sum3 + l;
			if (sum3 > 20) {
				System.out.println("��ǰ���ۼ�ֵΪ:" + sum3);
				break;
			}
		}

		// continueֹͣ����ѭ����������һ��ѭ��
		int sum4 = 0;

		for (int m = 1; m <= 10; m++) {
			if (m % 2 != 0) {
				continue;
			}
			sum4 = sum4 + m;
		}
		System.out.print("1��10֮�������ż���ĺ�Ϊ��" + sum4);

		// ѭ��Ƕ��
		System.out.println("��ӡֱ��������");
		for (int n = 1; n <= 3; n++) {
			for (int o = 1; o <= n; o++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
