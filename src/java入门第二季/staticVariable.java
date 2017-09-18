package java入门第二季;

public class staticVariable {
	// 静态变量：可以通过类名访问，也可通过对象访问
	static String name="lihaixing";
	String name2 = "seastarLI";

	void print2() {
		staticVariable svar = new staticVariable();

		// 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
		// 通过对象来访问非静态变量
		System.out.println("普通方法中访问静态变量：三种");
		System.out.println(name);
		System.out.println(staticVariable.name);
		System.out.println(svar.name);

		System.out.println("普通方法中访问成员变量：两种");
		System.out.println(name2);
		System.out.println(svar.name2);
	}

	// 静态方法
	public static void print() {
		staticVariable svar = new staticVariable();
		System.out.println("静态方法中访问静态变量：三种方法");
		System.out.println(svar.name);
		System.out.println(name);
		System.out.println(staticVariable.name);

		// 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
		// 通过对象来访问非静态变量
		System.out.println("静态方法中访问成员变量：一种方法");
		System.out.println(svar.name2);
	}

	public static void main(String[] args) {
		staticVariable svar = new staticVariable();

		// 访问静态方法有两种方式：直接类名访问，也可对象访问
		staticVariable.print();
		// svar.print();
		// 在静态方法中访问静态方法，还可以直接调用
		// print();

		// 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法。
		svar.print2();
	}

}
