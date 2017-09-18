package java入门第二季;

final public class Final {
	final int a;// 属性前加了final， a值将不能被修改，系统也不会自动赋值，除非在构造函数中赋值

	public Final() {
		a = 5;
	}

	public void method() {
		final int b = 7;// 加了final， 就变成了常量，不能被修改
	}
}
