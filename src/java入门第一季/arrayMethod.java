package java���ŵ�һ��;

//���������࣬ʹ�����鷽�����뵼��˰�
import java.util.Arrays;

public class arrayMethod {
	public static void main(String[] args) {

		double nums[] = { 15.5, 14, 18, 13 };

		// ���� ��С����
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		// ת�����ַ��� Ҳ����java script�е�����
		System.out.println(Arrays.toString(nums));
		// �����÷�
		Arrays.toString(nums);
		System.out.println(nums);

		// forEach
		String names[] = { "haixing", "haili", "seastar" };
		for (String name : names) {
			System.out.println(name);
		}
	}
}
