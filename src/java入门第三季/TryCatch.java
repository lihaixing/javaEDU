package java���ŵ�����;

public class TryCatch {
	public void throwException() {
		// ���쳣�ͱ����д���
		// throw new Exception("����һ���쳣");
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
			// ��ӡ��������Ϣ
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
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
			// ��ӡ��������Ϣ
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣�ˣ�����");
			return result = 999;
		} finally {
			System.out.println("����finally������������");
			System.out.println("����result���ҵ�ֵ�ǣ�" + result);
		}
	}

}
