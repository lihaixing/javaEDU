package java入门第一季;

//公有 类，HelloWorld必须是文件名
public class HelloWorld {
	public String pagage = "如何访问不同包里的值";// 必须加public才能被其他包使用

	public HelloWorld() {
		System.out.println("I Love Imooc!" + pagage);
	}

	//	main是程序的总入口
	public static void main(String[] args){
		String pro="hello world";
//		输出功能
		System.out.println("I Love Imooc!"+pro);
		pro="good world";
		System.out.println("I Love Imooc!"+pro);
	}
}
