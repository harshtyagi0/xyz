package training_Lecture_14;

interface rat {
	void eatfood();
}

class abc implements rat {

	@Override
	public void eatfood() {
		def d  = new def();
		d.eatfood();
		// TODO Auto-generated method stub

	}

	public static abc alfa() {
		// TODO Auto-generated method stub
		return null;
	}
}
class def implements rat {

	@Override
	public void eatfood() {
		// TODO Auto-generated method stub

	}
}

public class Standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a = abc.alfa();
//		System.out.println(a);
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
