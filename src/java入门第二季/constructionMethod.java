package java入门第二季;

public class constructionMethod {
	String a = "lihaixing";

	// 类中的方法
	void Method1() {
		System.out.println(a);
	}

	// 无参的构造方法： 在实例化的时候执行
	public constructionMethod() {
		System.out.println("无参的构造方法执行了");
	}

	// 有参的构造方法：可以与无参的构造方法并存
	public constructionMethod(String name, int age) {
		System.out.print("我的名字叫：" + name);
		System.out.println(";我的年龄为：" + age + "岁");
	}

	// 有参的构造方法重载
	public constructionMethod(String name) {
		System.out.print("我的名字叫：" + name);
		if (name.length() < 6) {
			a = name;
		}
		// 注意，a的新值只影响了运用此方法的对象
		System.out.println(";a的新值为：" + a);
	}
}
