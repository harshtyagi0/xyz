package Multithreading;

class WorkingThread {
	int quantity;
	boolean valueSet = false;

	public synchronized void setQuantity(int quantity) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Put : " + quantity);
		this.quantity = quantity;
		valueSet = true;
		notify();
	}

	public synchronized void getQuantity() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get : " + quantity);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	WorkingThread wt;

	public Producer(WorkingThread wt) {
		this.wt = wt;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			wt.setQuantity(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	WorkingThread wt;

	public Consumer(WorkingThread wt) {
		this.wt = wt;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while (true) {
			wt.getQuantity();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class InterThread {

	public static void main(String[] args) {
		WorkingThread wt = new WorkingThread();
		new Producer(wt);
		new Consumer(wt);
	}

}
