package java���ŵڶ���;

//�̳�
public class Dog extends Animal {
	public int age = 5;
	public Dog() {
		// ����ʵ�������Զ����ø��๹�췽�������๹�췽��������super��������ʵ���������Եģ�����Ҫд
		super();
		System.out.println("������ִ����");

	}
	// �Լ̳еķ��������⣬�ع�
	public void eat() {
		System.out.println("�����гԶ�����������");
	}

	public void superParent() {

		// ͨ��super���ʸ���ķ��� �����ԣ�ע��super���ܷ��ھ�̬������ʹ��
		super.eat();
		System.out.println(super.age);

	}

	public static void main(String[] args) {
		// ͨ�����췽�����жϳ�ʼ��˳�� �ȸ���������
		Dog dog = new Dog();

		// �������ٹ��췽��
		System.out.println(dog.age);

		System.out.println(dog.name);
		dog.name = "dog";
		System.out.println(dog.name);

		dog.eat();
		dog.superParent();

	}
}
