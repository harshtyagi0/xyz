package Multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReadWrite frw = new FileReadWrite();
		new w(frw);
		new r(frw);
	}
}

class r implements Runnable {
	FileReadWrite frw;
	public r(FileReadWrite frw) {
		this.frw = frw;
		new Thread(this, "Reader").start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				frw.reading();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class w implements Runnable {
	FileReadWrite frw;

	public w(FileReadWrite frw) {
		this.frw = frw;
		new Thread(this, "Writter").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				frw.writting("abc.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class FileReadWrite {
	private String value;
	private boolean valSet = false;

	public synchronized void reading() throws FileNotFoundException, IOException {
		while (!valSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File f = new File(value);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readUTF());
		valSet = false;
		notify();

	}

	public synchronized void writting(String value) throws FileNotFoundException, IOException {
		while (valSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.value = value;
		File f = new File(value);
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		System.out.print("Enter data :- ");
		Scanner scan = new Scanner(System.in);
		dos.writeUTF(scan.nextLine());
		valSet = true;
		notify();
	}

}
