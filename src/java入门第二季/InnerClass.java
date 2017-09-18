package java入门第二季;

public class InnerClass {
	int a = 5;
	int b = 1;

	public class Inner {
		int a = 6;
		public Inner() {
			System.out.println("内部构造方法执行了");
			System.out.println("内部a为" + a);
			// 注意访问外部的方法
			System.out.println("外部a为" + InnerClass.this.a);
		}
		public void show() {
			int b = 2;
			System.out.println("welcome to innerClass!");
			System.out.println("内部b为" + b);
			// 注意访问外部的方法
			System.out.println("外部b为" + InnerClass.this.b);
		}
	}

	public static void main(String[] args) {
		// 创建外部类对象
		InnerClass hello = new InnerClass();
		// 创建内部类对象
		Inner ic = hello.new Inner();
		ic.show();
	}
}
