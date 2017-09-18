package java���ŵڶ���;

public class StaticInnerClass {
	int a = 4;
	static int b = 5;
	static int c = 5;

	public class InnerClass {
		int b = 7;

		public InnerClass() {
			// System.out.println(StaticInnerClass.this.b);
			System.out.println(StaticInnerClass.b);
			System.out.println(b);
			// ����ע��ĵط�
			System.out.println(a);
			System.out.println(c);
		}
	}

	public static class InnerClass2 {
		int b = 8;

		public InnerClass2() {
			// ע�����ﲻ��Ҫthis
			System.out.println(StaticInnerClass.b);
			System.out.println(b);
			// ����ע��ĵط�
			System.out.println(new StaticInnerClass().a);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(b);
		StaticInnerClass.b = 6;
		System.out.println(b);

		System.out.println("**********");

		StaticInnerClass staticValue = new StaticInnerClass();
		StaticInnerClass staticValue2 = new StaticInnerClass();

		staticValue.a = 5;
		System.out.println(staticValue.a);
		System.out.println(staticValue2.a);

		System.out.println("**********");

		staticValue.b = 6;// ��̬�����ǹ���ģ�����һ���ı䣬��һ��Ҳ��ı�
		System.out.println(staticValue.b);
		System.out.println(staticValue2.b);

		System.out.println("**********");
		// �ڲ������
		InnerClass staticInner = staticValue.new InnerClass();
		System.out.println("�ָ���");
		// ע�⣬����ֱ�ӷ��ʾ�̬�ڲ���
		InnerClass2 staticInner2 = new InnerClass2();


	}

}
