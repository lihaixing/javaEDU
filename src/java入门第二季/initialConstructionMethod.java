package java���ŵڶ���;

public class initialConstructionMethod {

	public static void main(String[] args) {
		// ���������ͬʱ��ִ�����޲ι��췽�� (�����췽�����й��췽��ʱ��ϵͳ�����Զ�����޲ι��췽�����˴�Ҳ���ܴ�������)
		constructionMethod method = new constructionMethod();
		// ���������ͬʱ��ִ�����вι��췽�� ��ֵ��Ҫ�ظ�
		constructionMethod method2 = new constructionMethod("���", 29);
		constructionMethod method3 = new constructionMethod("���");

		System.out.println();// ����

		System.out.println(method.a);
		System.out.println(method2.a);
		System.out.println(method3.a);

		System.out.println();// ����

		method.Method1();
		method2.Method1();
		method3.Method1();
	}

}
