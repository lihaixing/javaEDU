package java���ŵڶ���;

public class InitializationBlock {
	int num1;
	int num2;
	static int num3;

	// ���췽��
	public InitializationBlock() {
		num1 = 91;
		System.out.println("ͨ�����췽��Ϊ����num1��ֵ");
	}

	// ��ʼ����
	{
		num2 = 74;
		System.out.println("ͨ����ʼ����Ϊ����num2��ֵ");
	}

	// ��̬��ʼ���� �������ʱ��ִ���ˣ�����Ҫʵ������ִ��
	static {
		num3 = 83;
		System.out.println("ͨ����̬��ʼ����Ϊ����num3��ֵ");
	}

	public static void main(String[] args) {
		/*
		 * ��������ʱ��̬��ʼ�������ȱ�ִ�У�Ȼ��ִ����ͨ��ʼ���飬����ִ�й��췽����
		 * 
		 * ���ھ�̬��ʼ����ֻ�������ʱִ��һ�Σ����Ե��ٴδ������� hello2 ʱ��δִ�о�̬��ʼ����
		 */

		InitializationBlock block = new InitializationBlock();

		System.out.println(block.num1);
		System.out.println(block.num2);
		System.out.println(num3);

		// ʵ����ʼ������ִ�о�̬��ʼ����
		InitializationBlock block2 = new InitializationBlock();

	}

}
