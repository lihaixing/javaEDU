package java���ŵڶ���;

public class PolymorphicSon extends PolymorphicParent {
	int a = 5;
	public void eat() {
		System.out.println("�����г��������");
	}

	public void watchDoor() {
		System.out.println("�����п��ŵ�����");
	}

	public static void main(String[] args) {

		PolymorphicParent obj1 = new PolymorphicParent();
		// ���������ָ��������� ������������ò���ָ���� �����ö�̬��
		PolymorphicParent obj2 = new PolymorphicSon();

		// ������̬
		obj1.eat();
		obj2.eat();
		// ������û�У���̳и���
		obj2.Sleep();
		// �����Ǹ�������ã���������û��������������Բ���������
		// obj2.watchDoor();

		PolymorphicSon dog1 = new PolymorphicSon();
		PolymorphicParent animal1 = dog1;// �Զ�������������������ת��
		System.out.println(dog1 == animal1);
		dog1.a = 6;
		System.out.println(dog1 == animal1);

		// PolymorphicSon obj5=obj4; //���ڷ��գ�������������Ҫǿ��ת��
		PolymorphicSon dog2 = (PolymorphicSon) animal1;// ǿ������ת��
		// ������ת�����ͻ������
		// CatSon cat1=(CatSon)animal1;//�������

		// ����true,˵������ת��
		System.out.println(animal1 instanceof PolymorphicSon);
		System.out.println(dog2 instanceof PolymorphicParent);

	}

}
