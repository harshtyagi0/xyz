package training_Lecture_16;

import java.io.File;

class abc{
	private static abc single = null;
	private abc() {
		
	}
	static abc obj() {
		if(single==null)
			single = new abc();
		return single;
	}
}
class printer  {
	static volatile int m = 0, n=0;
	private int a=0;
	static void method_one() {
		m++;
		n++;
	}
	static void method_two() {
		System.out.println("m = "+m+" n = "+n);
	}
	
	void printing(String s) {
		a++;
		System.out.println(s + " is printing");
		System.out.println(a);
	}
}

class myThread extends Thread {
	private printer p;

	myThread(printer p) {
		this.p = p;
	}

	public void run() {
		synchronized (p) {
			for (int i = 0; i < 4; i++) {
				p.printing(Thread.currentThread().getName());
			}
		}
	}
}

public class Test {

	public static void main(String[] args) {
//		printer p = new printer();
//		
//		myThread T1 = new myThread(p);
//		myThread T2 = new myThread(p);
//		
//		T1.setName("First Employee");
//		T2.setName("Second Employee");
//
//		T1.start();
//		T2.start();
		
		abc a  = abc.obj();
		abc b  = abc.obj();
		abc c  = abc.obj();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		File f;

	}

}
