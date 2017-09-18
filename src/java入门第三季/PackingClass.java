package java入门第三季;

public class PackingClass {
	public static void main(String[] args) {
		int a = 5;
		Integer a1 = new Integer(a);// 手动装箱
		Integer a5 = a;// 自动装箱
		int a6 = a1.intValue();// 手动拆箱
		int a7 = a1;// 自动拆箱
		byte a2 = a1.byteValue();
		double a3 = a1.doubleValue();
		float a4 = a1.floatValue();
		// 转换成字符串
		String a8 = Integer.toString(a);
		String a9 = String.valueOf(a);
		String a10 = a + "";
		System.out.println(a1 + "," + a2 + "," + a3 + "," + a4);
		System.out.println(a8 + "," + a9);

		byte b = 35;
		Byte b1 = new Byte(b);
		int b2 = b1.intValue();
		String b3 = b1.toString();
		System.out.println(b2 + "," + b3);

		float c = 5.5f;
		Float c1 = new Float(c);

		double d = 5.7;
		Double d1 = new Double(d);


		char e = '男';
		Character e1 = new Character(e);

		boolean f = true;
		Boolean F = new Boolean(f);

		String g = "55";
		int g1 = Integer.parseInt(g);
		int g2 = Integer.valueOf(g);
		double g3 = Double.parseDouble(g);
		System.out.println(g1 + "," + g2 + "," + g3);

	}
}
