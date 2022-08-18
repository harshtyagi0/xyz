package Multithreading;

class sync{
	private static int count;

	public static int getCount() {
		return count;
	}

	public synchronized static void incrementCount() {
		try {
			count ++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class t implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<1000;i++)
			sync.incrementCount();
	}
}

public class MyThread {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new t());
		Thread t2 = new Thread(new t());
		t1.start();
//		t1.join();
		t2.start();
		
//		t2.join();
		System.out.println(sync.getCount());
		
		Runnable obj1 = () ->{
			
		};
		
//		Creating thread using lambda.
		Thread t3 = new Thread(()-> {
					for (int i = 0; i < 10; i++) {
						System.out.println("hii");						
					}
		});
		
		Thread t4 = new Thread(() -> {
					for (int i = 0; i < 10; i++) {
						System.out.println("hello");						
					}
		});
		t3.start();
		
		t4.start();
		t4.join();
		Thread.sleep(1000);
		System.out.println("end");
	}

}
