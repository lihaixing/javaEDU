package java入门第一季;

public class javaMethod {
	// 定义了一个方法名为 print 的方法，实现输出信息功能
	public void print() {
		System.out.println("Hello World");
	}

	// 无参数无返回值
	public void show() {
		System.out.println("wellcome to imooc.");
	}

	// 无参数带返回值
	public int calcSum() {
		int a = 5;
		int b = 12;
		int sum = a + b;
		return sum;
	}

	// 带参数无返回值
	public void alert(String str, int age) {
		System.out.println(str + "的年龄为：" + age);
	}

	// 带参数有返回值
	public double calcAvg(double score1, double score2) {
		double avg = (score1 + score2) / 2;
		return avg;
	}

	public static void main(String[] args) {
		// 在 main 方法中调用 print 方法
		javaMethod test = new javaMethod();

		test.print();

		test.show();

		System.out.println(test.calcSum());
		// 也可以赋值
		int sum = test.calcSum();
		System.out.println(sum + 5);

		test.alert("李海兴", 29);

		System.out.println(test.calcAvg(78, 87));
	}
}
