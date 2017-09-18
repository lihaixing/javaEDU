package java入门第二季;

public class StaticInnerClass {
	int a = 4;
	static int b = 5;
	static int c = 5;

	public class InnerClass {
		int b = 7;

		public InnerClass() {
			// System.out.println(StaticInnerClass.this.b);
			System.out.println(StaticInnerClass.b);
			System.out.println(b);
			// 另外注意的地方
			System.out.println(a);
			System.out.println(c);
		}
	}

	public static class InnerClass2 {
		int b = 8;

		public InnerClass2() {
			// 注意这里不需要this
			System.out.println(StaticInnerClass.b);
			System.out.println(b);
			// 另外注意的地方
			System.out.println(new StaticInnerClass().a);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(b);
		StaticInnerClass.b = 6;
		System.out.println(b);

		System.out.println("**********");

		StaticInnerClass staticValue = new StaticInnerClass();
		StaticInnerClass staticValue2 = new StaticInnerClass();

		staticValue.a = 5;
		System.out.println(staticValue.a);
		System.out.println(staticValue2.a);

		System.out.println("**********");

		staticValue.b = 6;// 静态变量是共享的，所以一个改变，另一个也会改变
		System.out.println(staticValue.b);
		System.out.println(staticValue2.b);

		System.out.println("**********");
		// 内部类访问
		InnerClass staticInner = staticValue.new InnerClass();
		System.out.println("分割线");
		// 注意，这里直接访问静态内部类
		InnerClass2 staticInner2 = new InnerClass2();


	}

}
