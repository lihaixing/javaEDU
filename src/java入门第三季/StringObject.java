package java入门第三季;

public class StringObject {
	String s1 = "Imooc";
	String s4;
	String s2 = new String();// 建立了一个空字符串
	String s3 = new String("hello world");

	public static void main(String[] args) {
		StringObject so = new StringObject();

		System.out.println(so.s1);
		System.out.println(so.s2);
		System.out.println(so.s3);
		System.out.println(so.s4);

		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);// false
		System.out.println(s3 == s1);// false
	}
}
