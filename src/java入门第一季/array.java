package java入门第一季;

public class array {
	public static void main(String[] args) {
		// 定义数组 访问数组中元素
		int[] scores = { 10, 34 };
		System.out.println(scores[1]);

		// 定义数据
		int[] arr1;
		double arr2[];
		String[] names;

		// 分配空间 5是数组的长度
		arr1 = new int[5];
		arr2 = new double[5];
		names = new String[5];

		// 两步合并
		int arr3[] = new int[4];

		// 赋值
		arr1[0] = 89;
		arr1[1] = 79;

		// 直接创建数组
		int[] arr4 = { 77, 89, 88 };
		int arr5[] = new int[] { 88, 98, 33 };

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr5[1]);

		// 循环数组
		String[] hobbys = { "sports", "game", "movie" };
		System.out.println("循环输出数组中元素的值：");
		for (int i = 0; i < hobbys.length; i++) {
			System.out.println(hobbys[i]);
		}

		// 定义一个整型数组，并赋初值
		int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };

		int max = nums[0]; // 假定最大值为数组中的第一个元素
		int min = nums[0]; // 假定最小值为数组中的第一个元素
		double sum = 0;// 累加值
		double avg = 0;// 平均值

		for (int i = 0; i < nums.length; i++) { // 循环遍历数组中的元素
			// 如果当前值大于max，则替换max的值
			if (nums[i] < min) {
				min = nums[i];
			}
			// 如果当前值小于min，则替换min的值
			if (nums[i] > max) {
				max = nums[i];
			}
			// 累加求和
			sum += nums[i];
		}
		// 求平均值
		avg = sum / nums.length;

		System.out.println("数组中的最大值：" + max);
		System.out.println("数组中的最小值：" + min);
		System.out.println("数组中的平均值：" + avg);
	}
}
