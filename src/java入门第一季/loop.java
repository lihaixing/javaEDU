package java入门第一季;

public class loop {
	public static void main(String[] args) {
		// while循環
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		// do while循環
		int num = 0;
		int sum = 0;
		do {
			sum += num;
			num += 2;
		} while (num <= 50);
		System.out.println(sum);

		// for循环
		int sum2 = 0;
		for (int k = 1; k <= 100; k++) {
			if (k % 3 == 0) {
				continue;
			}
			sum2 += k;
		}
		System.out.println(sum2);

		// break终止循环
		int sum3 = 0;
		for (int l = 1; l <= 10; l++) {
			sum3 = sum3 + l;
			if (sum3 > 20) {
				System.out.println("当前的累加值为:" + sum3);
				break;
			}
		}

		// continue停止本次循环，进入下一次循环
		int sum4 = 0;

		for (int m = 1; m <= 10; m++) {
			if (m % 2 != 0) {
				continue;
			}
			sum4 = sum4 + m;
		}
		System.out.print("1到10之间的所有偶数的和为：" + sum4);

		// 循环嵌套
		System.out.println("打印直角三角形");
		for (int n = 1; n <= 3; n++) {
			for (int o = 1; o <= n; o++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
