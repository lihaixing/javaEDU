package java入门第二季;

public class MethodInnerClass {
	int a = 1;

	void Hello() {
		int a = 2;
		class InnerClass {
			int a = 3;

			void print() {
				System.out.println(a);
				System.out.println(new MethodInnerClass().a);
			}
		}
		InnerClass ic = new InnerClass();
		ic.print();
	}

	public static void main(String[] args) {
		MethodInnerClass method = new MethodInnerClass();
		method.Hello();
	}

}
