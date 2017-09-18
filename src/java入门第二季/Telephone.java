package java入门第二季;

//一类是类名  本来一类应该为手机
public class Telephone {
	// 属性 成员变量（定义在类中） 成员变量有初始值0
	float screen;
	float cpu = 2.8f;
	// 方法
	void call() {
		System.out.println("手机可以打电话");
	}

	void setMessage() {
		// call(); //可直接使用
		System.out.println("手机可以发短信");
	}

	void getPhoneInfo() {
		// 局部变量与成员变量重名时，优先使用局部变量（就近原则）
		float cpu = 2.7f;

		System.out.println("手机屏幕大小为：" + screen);
		System.out.println("手机cpu大小为：" + cpu);
	}

	// 创建对象
	// Telephone phone2 = new Telephone();
}
