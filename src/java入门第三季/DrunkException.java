package java���ŵ�����;

//�Զ����쳣
public class DrunkException extends Exception {
	public DrunkException() {

	}

	public DrunkException(String message) {
		super();
	}

	public void drinkbig() throws DrunkException {
		throw new DrunkException("�������ȴ���");
	}

	public static void main(String[] args) {
		DrunkException de=new DrunkException();
		try{
			de.drinkbig();
		} catch (DrunkException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
