package java���ŵڶ���;

public class Animal { // ���ǰ�����final�������ܱ��̳�
	public int age = 10;
	public String name;

	public Animal() { // ���ǰ�����final�������ܱ����า��
		age = 20;
		System.out.println("���︸��ִ����");
	}

	// ����������вι��췽������û�����޲ι���ŷ���ϵͳ�����Զ������޲ι��췽��
	// �����������޷����õ������޲ι��췽�����ͻ����
	public Animal(int age) {
		this.age = age;
		System.out.println("���︸���в���ִ����");
	}

	public void eat() {
		System.out.println("������гԶ�����������");
	}
}
