package java���ŵڶ���;

public class constructionMethod {
	String a = "lihaixing";

	// ���еķ���
	void Method1() {
		System.out.println(a);
	}

	// �޲εĹ��췽���� ��ʵ������ʱ��ִ��
	public constructionMethod() {
		System.out.println("�޲εĹ��췽��ִ����");
	}

	// �вεĹ��췽�����������޲εĹ��췽������
	public constructionMethod(String name, int age) {
		System.out.print("�ҵ����ֽУ�" + name);
		System.out.println(";�ҵ�����Ϊ��" + age + "��");
	}

	// �вεĹ��췽������
	public constructionMethod(String name) {
		System.out.print("�ҵ����ֽУ�" + name);
		if (name.length() < 6) {
			a = name;
		}
		// ע�⣬a����ֵֻӰ�������ô˷����Ķ���
		System.out.println(";a����ֵΪ��" + a);
	}
}
