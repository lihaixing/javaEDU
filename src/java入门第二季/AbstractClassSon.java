package java���ŵڶ���;

public class AbstractClassSon extends AbstractClassParent implements IPlayGame {

	@Override
	public void call() {
		// TODO �Զ����ɵķ������
		System.out.println("ͨ�����̴�绰");

	}

	@Override
	public void sentMessage() {
		// TODO �Զ����ɵķ������
		System.out.println("ͨ�����̷���Ϣ");
	}

	@Override
	public void playGame() {
		// TODO �Զ����ɵķ������
		System.out.println("�ֻ���������Ϸ�Ĺ���");

	}

	public static void main(String[] args) {
		// ͨ�����췽�����жϳ�ʼ��˳�� �ȸ���������
		AbstractClassParent abstr = new AbstractClassSon();
		abstr.call();
		abstr.sentMessage();

		// �ӿڷ���ʹ��
		IPlayGame phone1 = new AbstractClassSon();
		IPlayGame psp1 = new PspClass();
		phone1.playGame();
		psp1.playGame();

		// �����ڲ���ʵ�ֽӿڵķ���
		IPlayGame phone2 = new IPlayGame() {
			@Override
			public void playGame() {
				// TODO �Զ����ɵķ������
				System.out.println("������1���ֻ�2������Ϸ�Ĺ���");
			}

		};
		phone2.playGame();

		// �����ڲ���ʵ�ֽӿڵķ���2
		new IPlayGame() {
			@Override
			public void playGame() {
				// TODO �Զ����ɵķ������
				System.out.println("������2���ֻ�2������Ϸ�Ĺ���");
			}

		}.playGame();
	}



}
