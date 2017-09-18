package java入门第二季;

public class initialConstructionMethod {

	public static void main(String[] args) {
		// 创建对象的同时，执行了无参构造方法 (当构造方法中有构造方法时，系统不会自动添加无参构造方法，此处也不能创建对象)
		constructionMethod method = new constructionMethod();
		// 创建对象的同时，执行了有参构造方法 赋值不要重复
		constructionMethod method2 = new constructionMethod("李海兴", 29);
		constructionMethod method3 = new constructionMethod("李海兴");

		System.out.println();// 隔行

		System.out.println(method.a);
		System.out.println(method2.a);
		System.out.println(method3.a);

		System.out.println();// 隔行

		method.Method1();
		method2.Method1();
		method3.Method1();
	}

}
