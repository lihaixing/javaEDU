package java入门第三季;

public class ThrowException {
	public void divide(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("除数不能为0!");
		} else {
			System.out.println("两数相除结果为：" + x / y);
		}
	}

	// 调用可能抛出异常的方法，必须用try catch语句，或者放到另外一个异常方法中
	public void tryCatch() {
		try {
			divide(5, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void capulate() throws Exception {
		divide(5, 0);
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		te.tryCatch();

		try {
			te.capulate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
