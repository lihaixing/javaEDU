package java入门第三季;

public class MathClass {
	public static void main(String[] args) {
		double a = 12.81;
		int b = (int) a;// 强制类型转换，去掉小数
		System.out.println(b);
		long c = Math.round(a);// 四舍五入
		System.out.println(c);
		double d = Math.floor(a);// 返回小于参数的最大整数
		System.out.println(d);
		double e = Math.ceil(a);// 返回大于参数的最小整数
		System.out.println(e);
		double x = Math.random();// 返回[0,1)的随机数
		System.out.println(x);
		int y = (int) (Math.random() * 99);// 返回[0,99)的随机数
		System.out.println(y);
	}
}
