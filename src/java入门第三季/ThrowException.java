package java���ŵ�����;

public class ThrowException {
	public void divide(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("��������Ϊ0!");
		} else {
			System.out.println("����������Ϊ��" + x / y);
		}
	}

	// ���ÿ����׳��쳣�ķ�����������try catch��䣬���߷ŵ�����һ���쳣������
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
