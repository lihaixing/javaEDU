package java入门第二季;

public class InitializationBlock {
	int num1;
	int num2;
	static int num3;

	// 构造方法
	public InitializationBlock() {
		num1 = 91;
		System.out.println("通过构造方法为变量num1赋值");
	}

	// 初始化块
	{
		num2 = 74;
		System.out.println("通过初始化块为变量num2赋值");
	}

	// 静态初始化块 在类加载时就执行了，不需要实例化后执行
	static {
		num3 = 83;
		System.out.println("通过静态初始化块为变量num3赋值");
	}

	public static void main(String[] args) {
		/*
		 * 程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。
		 * 
		 * 由于静态初始化块只在类加载时执行一次，所以当再次创建对象 hello2 时并未执行静态初始化块
		 */

		InitializationBlock block = new InitializationBlock();

		System.out.println(block.num1);
		System.out.println(block.num2);
		System.out.println(num3);

		// 实例初始化不会执行静态初始化块
		InitializationBlock block2 = new InitializationBlock();

	}

}
