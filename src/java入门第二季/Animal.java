package java入门第二季;

public class Animal { // 如果前面加了final，将不能被继承
	public int age = 10;
	public String name;

	public Animal() { // 如果前面加了final，将不能被子类覆盖
		age = 20;
		System.out.println("动物父类执行了");
	}

	// 如果定义了有参构造方法，而没定义无参构造放法，系统不会自动创建无参构造方法
	// 那子类由于无法调用到父类无参构造方法，就会出错
	public Animal(int age) {
		this.age = age;
		System.out.println("动物父类有参数执行了");
	}

	public void eat() {
		System.out.println("动物具有吃东西的能力！");
	}
}
