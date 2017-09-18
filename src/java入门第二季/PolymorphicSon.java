package java入门第二季;

public class PolymorphicSon extends PolymorphicParent {
	int a = 5;
	public void eat() {
		System.out.println("狗具有吃肉的能力");
	}

	public void watchDoor() {
		System.out.println("狗具有看门的能力");
	}

	public static void main(String[] args) {

		PolymorphicParent obj1 = new PolymorphicParent();
		// 父类的引用指向子类对象 ，但子类的引用不能指向父类 （引用多态）
		PolymorphicParent obj2 = new PolymorphicSon();

		// 方法多态
		obj1.eat();
		obj2.eat();
		// 若子类没有，会继承父类
		obj2.Sleep();
		// 由于是父类的引用，而父类中没有这个方法，所以不能这样用
		// obj2.watchDoor();

		PolymorphicSon dog1 = new PolymorphicSon();
		PolymorphicParent animal1 = dog1;// 自动类型提升，向上类型转换
		System.out.println(dog1 == animal1);
		dog1.a = 6;
		System.out.println(dog1 == animal1);

		// PolymorphicSon obj5=obj4; //存在风险，编译器报错，需要强制转换
		PolymorphicSon dog2 = (PolymorphicSon) animal1;// 强制向下转换
		// 假若再转换，就会出问题
		// CatSon cat1=(CatSon)animal1;//会出问题

		// 返回true,说明可以转换
		System.out.println(animal1 instanceof PolymorphicSon);
		System.out.println(dog2 instanceof PolymorphicParent);

	}

}
