package core_java;

import java.util.ArrayList;

interface xyz {
	void show();

	 default void ata() {
		System.out.println("inside ata");
	}
}

class abc implements xyz {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("inside abc");
		Error e = new Error();

	}
}

public class Test_enum {
	public static void main(String[] args) {

		/*Mobile m = Mobile.Asus;
		m.price = 10;
		System.out.println(Mobile.Asus.getPrice());
		
		switch (m) {
			case Apple: 
				System.out.println("Apple");
				break;
			case Samsung:
				System.out.println("Samsung");
				break;
			case Asus: 
				System.out.println("Asus");
				break;
			case HTC:
				System.out.println("HTC");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + m);
		}
		
		abc a = new abc();
		a.show();
		a.ata();*/
//		xyz.ata();
		
		
		
	}

}
