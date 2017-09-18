package java入门第一季;

public class twoDimensionalArray {
	public static void main(String[] args) {
		// 声明二维数组
		int[][] arr1;
		// 分配空间 2是行数 3是列数
		arr1 = new int[2][3];
		// 赋值
		arr1[1][1] = 5; // 单独赋值

		// 声明数组时赋值
		int[][] arr2 = { { 1, 5, 6 }, { 5, 6, 9 } };
		int arr3[][] = { { 1, 5, 6 }, { 5, 6, 9 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			// 实现换行
			System.out.println();
		}

		// 注意用法 int[]表示info是一个int数组 ，而int表示info2是一个int
		for (int[] info : arr3) {
			for (int info2 : info) {
				System.out.print(info2);
			}
			// 实现换行
			System.out.println();
		}

		// 不规则的二维数组
		int arr4[][] = { { 1, 5, 6 }, { 5, 6, 9, 10 } };
		System.out.println(arr4[1][3]);

		// 也可以先分配空间，再赋值
		int arr5[][] = new int[3][];
		arr5[0] = new int[4];
		arr5[0][0] = 7;
		// 错误用法
		// arr5[1]={6,8,9};
	}
}
