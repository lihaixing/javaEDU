package java入门第一季;

//导入数组类，使用数组方法必须导入此包
import java.util.Arrays;

public class arrayMethod {
	public static void main(String[] args) {

		double nums[] = { 15.5, 14, 18, 13 };

		// 排序 从小到大
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		// 转换成字符串 也就是java script中的数组
		System.out.println(Arrays.toString(nums));
		// 错误用法
		Arrays.toString(nums);
		System.out.println(nums);

		// forEach
		String names[] = { "haixing", "haili", "seastar" };
		for (String name : names) {
			System.out.println(name);
		}
	}
}
