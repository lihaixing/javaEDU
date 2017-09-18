package java入门第二季;

public class Telephone2 {

	public static void main(String[] args) {
		// 局部变量定义在方法中
		int a = 5;

		Telephone phone1 = new Telephone();
		phone1.call();
		phone1.getPhoneInfo();// 有默认值

		// 给phone1对象中的属性赋值
		phone1.screen = 5.8f;
		phone1.cpu = 2.9f;
		phone1.getPhoneInfo();// 2.7 2.7>2.9>2.8
	}

}
