package java���ŵڶ���;

//һ��������  ����һ��Ӧ��Ϊ�ֻ�
public class Telephone {
	// ���� ��Ա���������������У� ��Ա�����г�ʼֵ0
	float screen;
	float cpu = 2.8f;
	// ����
	void call() {
		System.out.println("�ֻ����Դ�绰");
	}

	void setMessage() {
		// call(); //��ֱ��ʹ��
		System.out.println("�ֻ����Է�����");
	}

	void getPhoneInfo() {
		// �ֲ��������Ա��������ʱ������ʹ�þֲ��������ͽ�ԭ��
		float cpu = 2.7f;

		System.out.println("�ֻ���Ļ��СΪ��" + screen);
		System.out.println("�ֻ�cpu��СΪ��" + cpu);
	}

	// ��������
	// Telephone phone2 = new Telephone();
}
