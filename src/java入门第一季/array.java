package java���ŵ�һ��;

public class array {
	public static void main(String[] args) {
		// �������� ����������Ԫ��
		int[] scores = { 10, 34 };
		System.out.println(scores[1]);

		// ��������
		int[] arr1;
		double arr2[];
		String[] names;

		// ����ռ� 5������ĳ���
		arr1 = new int[5];
		arr2 = new double[5];
		names = new String[5];

		// �����ϲ�
		int arr3[] = new int[4];

		// ��ֵ
		arr1[0] = 89;
		arr1[1] = 79;

		// ֱ�Ӵ�������
		int[] arr4 = { 77, 89, 88 };
		int arr5[] = new int[] { 88, 98, 33 };

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr5[1]);

		// ѭ������
		String[] hobbys = { "sports", "game", "movie" };
		System.out.println("ѭ�����������Ԫ�ص�ֵ��");
		for (int i = 0; i < hobbys.length; i++) {
			System.out.println(hobbys[i]);
		}

		// ����һ���������飬������ֵ
		int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };

		int max = nums[0]; // �ٶ����ֵΪ�����еĵ�һ��Ԫ��
		int min = nums[0]; // �ٶ���СֵΪ�����еĵ�һ��Ԫ��
		double sum = 0;// �ۼ�ֵ
		double avg = 0;// ƽ��ֵ

		for (int i = 0; i < nums.length; i++) { // ѭ�����������е�Ԫ��
			// �����ǰֵ����max�����滻max��ֵ
			if (nums[i] < min) {
				min = nums[i];
			}
			// �����ǰֵС��min�����滻min��ֵ
			if (nums[i] > max) {
				max = nums[i];
			}
			// �ۼ����
			sum += nums[i];
		}
		// ��ƽ��ֵ
		avg = sum / nums.length;

		System.out.println("�����е����ֵ��" + max);
		System.out.println("�����е���Сֵ��" + min);
		System.out.println("�����е�ƽ��ֵ��" + avg);
	}
}
