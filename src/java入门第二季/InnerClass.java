package java���ŵڶ���;

public class InnerClass {
	int a = 5;
	int b = 1;

	public class Inner {
		int a = 6;
		public Inner() {
			System.out.println("�ڲ����췽��ִ����");
			System.out.println("�ڲ�aΪ" + a);
			// ע������ⲿ�ķ���
			System.out.println("�ⲿaΪ" + InnerClass.this.a);
		}
		public void show() {
			int b = 2;
			System.out.println("welcome to innerClass!");
			System.out.println("�ڲ�bΪ" + b);
			// ע������ⲿ�ķ���
			System.out.println("�ⲿbΪ" + InnerClass.this.b);
		}
	}

	public static void main(String[] args) {
		// �����ⲿ�����
		InnerClass hello = new InnerClass();
		// �����ڲ������
		Inner ic = hello.new Inner();
		ic.show();
	}
}
