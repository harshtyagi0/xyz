package custom_exception;

class Main extends Exception {
	public Main(String s) {
		super(s);
	}
}

class abc extends Throwable {
	public abc(String s) {
		super(s);
	}
}

public class CustomException {

	static void letsCheck(int check) throws abc {
		if (check < 10) {
			throw new abc("Eh tu ja re ");
		} else {
			System.out.println("Paisa Laya...");
		}
	}

	public static void main(String[] args) {
		int a = 10;
//		while (true) {
//			if (a != 10) {
//				throw new abc("Panga ho gaya");
//			}else {
//				System.out.println("Chalne de be");
//			}
//			a--;
//		}

		try {
			letsCheck(15);
			letsCheck(5);
		} catch (abc ex) {
			System.out.println("Pakda gaya ye to");
			System.out.println("Exception occured: " + ex);
		}
	}

}
