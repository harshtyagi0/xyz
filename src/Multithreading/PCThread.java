package Multithreading;

import java.util.LinkedList;

class Operation {

	LinkedList<Integer> list = new LinkedList<Integer>();
	byte cap = 1;

	public void produce() {
		int value = 1;
		while (true) {
			synchronized (this) {
				while (list.size() == cap) {
					try {
						wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				System.out.println("Produce : " + value);
				list.add(value++);
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void sell() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() == 0) {
					wait();
				}
				System.out.println("Consumer : " + list.pollFirst());
				notify();
				Thread.sleep(1000);
			}
		}

	}
}

class Producers extends Thread {
	Operation O;

	public Producers(Operation o) {
		O = o;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		while (true) {
			O.produce();
		}
	}
}

class Consumers extends Thread {
	Operation O;

	public Consumers(Operation o) {
		O = o;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		while (true) {
			try {
				O.sell();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}

public class PCThread {

	public static void main(String[] args) {
		Operation O = new Operation();
		new Producers(O);
		new Consumers(O);

	}

}
