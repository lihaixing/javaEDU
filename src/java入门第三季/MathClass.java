package java���ŵ�����;

public class MathClass {
	public static void main(String[] args) {
		double a = 12.81;
		int b = (int) a;// ǿ������ת����ȥ��С��
		System.out.println(b);
		long c = Math.round(a);// ��������
		System.out.println(c);
		double d = Math.floor(a);// ����С�ڲ������������
		System.out.println(d);
		double e = Math.ceil(a);// ���ش��ڲ�������С����
		System.out.println(e);
		double x = Math.random();// ����[0,1)�������
		System.out.println(x);
		int y = (int) (Math.random() * 99);// ����[0,99)�������
		System.out.println(y);
	}
}
