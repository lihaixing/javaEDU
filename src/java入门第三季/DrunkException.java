package java入门第三季;

//自定义异常
public class DrunkException extends Exception {
	public DrunkException() {

	}

	public DrunkException(String message) {
		super();
	}

	public void drinkbig() throws DrunkException {
		throw new DrunkException("哈哈，喝大了");
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
