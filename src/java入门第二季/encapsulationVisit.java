package java���ŵڶ���;

//ʹ������������࣬����Ҫ����
import java���ŵ�һ��.HelloWorld;

public class encapsulationVisit {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		encapsulation phone = new encapsulation();

		// System.out.println(phone.screen); //���ܷ���˽��

		System.out.println(phone.getScreen());
		phone.setScreen(5.5f);
		System.out.println(phone.getScreen());

		System.out.println(phone.getCpu());
		phone.setCpu(2.5f);
		System.out.println(phone.getCpu());
		System.out.println(phone.getScreen());

		// �����������е���
		HelloWorld hello = new HelloWorld();
		System.out.print(hello.pagage);
	}

}
