package java���ŵ�һ��;

public class javaMethod {
	// ������һ��������Ϊ print �ķ�����ʵ�������Ϣ����
	public void print() {
		System.out.println("Hello World");
	}

	// �޲����޷���ֵ
	public void show() {
		System.out.println("wellcome to imooc.");
	}

	// �޲���������ֵ
	public int calcSum() {
		int a = 5;
		int b = 12;
		int sum = a + b;
		return sum;
	}

	// �������޷���ֵ
	public void alert(String str, int age) {
		System.out.println(str + "������Ϊ��" + age);
	}

	// �������з���ֵ
	public double calcAvg(double score1, double score2) {
		double avg = (score1 + score2) / 2;
		return avg;
	}

	public static void main(String[] args) {
		// �� main �����е��� print ����
		javaMethod test = new javaMethod();

		test.print();

		test.show();

		System.out.println(test.calcSum());
		// Ҳ���Ը�ֵ
		int sum = test.calcSum();
		System.out.println(sum + 5);

		test.alert("���", 29);

		System.out.println(test.calcAvg(78, 87));
	}
}
