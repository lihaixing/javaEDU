package java入门第一季;

import java.util.Scanner;

public class loop_practise {
	public static void main(String[] args) {
		// 判断一个数（小于10位）的位数
		int num = 999;
		int count = 0;
		do {
			num = num / 10;
			count++;
		} while (num > 0);

		System.out.println("它是一个" + count + "位的数!");

		// 通过java中的scanner包获取输入值
		// 1.导入java.util.Scanner
		// 2.创建Scanner对象
		// 3.接受并保存用户输入的值
		// int score=input.nextInt();
		// double score=input.nextdouble();
		// String score=input.next();

		Scanner input = new Scanner(System.in);

		/* System.out.print()输出信息后不会换行 */
		System.out.print("请用户输入成绩：");
		int score = input.nextInt();
		System.out.println("您输入的成绩是：" + score);

		Scanner input2 = new Scanner(System.in);
		int score2, sum3 = 0;
		double avg;
		for (int i = 1; i <= 2; i++) {
			sum3 = 0;
			System.out.println("***请输入第" + i + "个班级的成绩***");
			for (int j = 1; j <= 4; j++) {
				System.out.println("请输入第" + i + "个班级的第" + j + "个同学的成绩");
				score2 = input2.nextInt();
				sum3 += score2;
			}
			avg = sum3 / 4;
			System.out.println("第" + i + "个班级的平均成绩为" + avg);
		}

	}
}

