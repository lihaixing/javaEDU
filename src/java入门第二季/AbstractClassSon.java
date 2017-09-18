package java入门第二季;

public class AbstractClassSon extends AbstractClassParent implements IPlayGame {

	@Override
	public void call() {
		// TODO 自动生成的方法存根
		System.out.println("通过键盘打电话");

	}

	@Override
	public void sentMessage() {
		// TODO 自动生成的方法存根
		System.out.println("通过键盘发信息");
	}

	@Override
	public void playGame() {
		// TODO 自动生成的方法存根
		System.out.println("手机具有玩游戏的功能");

	}

	public static void main(String[] args) {
		// 通过构造方法可判断初始化顺序： 先父类再子类
		AbstractClassParent abstr = new AbstractClassSon();
		abstr.call();
		abstr.sentMessage();

		// 接口方法使用
		IPlayGame phone1 = new AbstractClassSon();
		IPlayGame psp1 = new PspClass();
		phone1.playGame();
		psp1.playGame();

		// 匿名内部类实现接口的方法
		IPlayGame phone2 = new IPlayGame() {
			@Override
			public void playGame() {
				// TODO 自动生成的方法存根
				System.out.println("匿名类1：手机2有玩游戏的功能");
			}

		};
		phone2.playGame();

		// 匿名内部类实现接口的方法2
		new IPlayGame() {
			@Override
			public void playGame() {
				// TODO 自动生成的方法存根
				System.out.println("匿名类2：手机2有玩游戏的功能");
			}

		}.playGame();
	}



}
