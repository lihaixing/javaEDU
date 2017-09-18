package java入门第三季;

public class TryCatch {
	public void throwException() {
		// 有异常就必须有处理
		// throw new Exception("这是一个异常");
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TryCatch tc = new TryCatch();
		int result = tc.test2();
	}

	public int test() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			return result;
		} catch (Exception e) {
			// 打印出错误信息
			e.printStackTrace();
			System.out.println("循环抛出异常了！！！");
			return -1;
		}
	}

	public int test2() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider--;
				result = result + 100 / divider;
			}
			return result;
		} catch (Exception e) {
			// 打印出错误信息
			e.printStackTrace();
			System.out.println("循环抛出异常了！！！");
			return result = 999;
		} finally {
			System.out.println("我是finally，哈哈！！！");
			System.out.println("我是result，我的值是：" + result);
		}
	}

}
