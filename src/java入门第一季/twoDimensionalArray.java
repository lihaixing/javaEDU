package java���ŵ�һ��;

public class twoDimensionalArray {
	public static void main(String[] args) {
		// ������ά����
		int[][] arr1;
		// ����ռ� 2������ 3������
		arr1 = new int[2][3];
		// ��ֵ
		arr1[1][1] = 5; // ������ֵ

		// ��������ʱ��ֵ
		int[][] arr2 = { { 1, 5, 6 }, { 5, 6, 9 } };
		int arr3[][] = { { 1, 5, 6 }, { 5, 6, 9 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			// ʵ�ֻ���
			System.out.println();
		}

		// ע���÷� int[]��ʾinfo��һ��int���� ����int��ʾinfo2��һ��int
		for (int[] info : arr3) {
			for (int info2 : info) {
				System.out.print(info2);
			}
			// ʵ�ֻ���
			System.out.println();
		}

		// ������Ķ�ά����
		int arr4[][] = { { 1, 5, 6 }, { 5, 6, 9, 10 } };
		System.out.println(arr4[1][3]);

		// Ҳ�����ȷ���ռ䣬�ٸ�ֵ
		int arr5[][] = new int[3][];
		arr5[0] = new int[4];
		arr5[0][0] = 7;
		// �����÷�
		// arr5[1]={6,8,9};
	}
}
