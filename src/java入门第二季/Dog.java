package java入门第二季;

//继承
public class Dog extends Animal {
	public int age = 5;
	public Dog() {
		// 子类实例化会自动调用父类构造方法和子类构造方法，这里super方法调用实际是隐藏性的，不需要写
		super();
		System.out.println("狗子类执行了");

	}
	// 对继承的方法不满意，重构
	public void eat() {
		System.out.println("狗具有吃东西的能力！");
	}

	public void superParent() {

		// 通过super访问父类的方法 和属性，注意super不能放在静态方法中使用
		super.eat();
		System.out.println(super.age);

	}

	public static void main(String[] args) {
		// 通过构造方法可判断初始化顺序： 先父类再子类
		Dog dog = new Dog();

		// 先属性再构造方法
		System.out.println(dog.age);

		System.out.println(dog.name);
		dog.name = "dog";
		System.out.println(dog.name);

		dog.eat();
		dog.superParent();

	}
}
