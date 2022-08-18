package training_Lecture_15;

class abc extends Thread {
	public void run() {
		int a = 20;
		int b = 30;
		int c = a + b;
		System.out.println("Thread Started" + this.getId());
		System.out.println(c + " " + this.getId());
	}
}

class xyz {
}

class def extends Thread {

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
//		System.out.println("Paisa lagay");
		for (int i = 0; i < 25; i++) {
			
//			try {
////				Thread.sleep(300);
////				System.out.println("Current Thread is " + Thread.currentThread().getName());
//			} catch (Exception e) {
//			}
			System.out.print(i+"\t");
			
		}
//		System.out.println();

	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		abc a = new abc();
//		abc b= new abc(), c = new abc(), d  = new abc();
//		
//		a.start();
//		try {
//			a.start();
//		}catch(Exception e) {
//			System.out.println("Ja phele error thik kr re baba");
//		}
//		b.start();
//		c.start();
//		d.start();
//		System.out.println(a.activeCount());
//		
//		def R = new def();
//		Thread t = new Thread(R);
//		t.start();
//		Thread t1  = new Thread(R);
//		t1.start();

//		System.out.println(t.activeCount());
		// at this stage R would show threaded behaviour

		def th0 = new def();
		def th1 = new def();
		def th2 = new def();
		th0.start();
//		try {
//			th0.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		th1.start();
//		try {
//			th1.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		th2.start();
//		try {
//			th2.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

	}

}
