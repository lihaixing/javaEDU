package java入门第二季;

//使用其他包里的类，则需要导入
import java入门第一季.HelloWorld;

public class encapsulationVisit {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		encapsulation phone = new encapsulation();

		// System.out.println(phone.screen); //不能访问私有

		System.out.println(phone.getScreen());
		phone.setScreen(5.5f);
		System.out.println(phone.getScreen());

		System.out.println(phone.getCpu());
		phone.setCpu(2.5f);
		System.out.println(phone.getCpu());
		System.out.println(phone.getScreen());

		// 访问其他包中的类
		HelloWorld hello = new HelloWorld();
		System.out.print(hello.pagage);
	}

}
