package java���ŵ�����;

public class StringBuilderObj {

	public static void main(String[] args) {

		// StringBuilder
		StringBuilder hoby = new StringBuilder("good");
		System.out.println(hoby);
		System.out.println(hoby + "boy");

		hoby.append("girl");
		System.out.println(hoby);

		hoby.insert(1, "�ٺ�");
		System.out.println(hoby);

		String str = hoby.toString();
		System.out.println(str);
	}

}
