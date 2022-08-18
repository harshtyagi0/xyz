import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

class Marks { // return String array---> contain Student name
	String[] centPercentage() {
		String[] SS = new String[5];
		SortedMap m = new TreeMap();
		m.put("Manish", "100");
		m.put("Bhikam", "90");
		m.put("Romesh", "98");
		m.put("Suman", "100");
		m.put("Drishti", "100");
		m.put("Aditya", "100");
		m.put("Anil", "90");

		Iterator I = m.keySet().iterator();
		int j = 0;
		while (I.hasNext()) {
			String key = (String) I.next();
			String value = (String) m.get(key);
			int i = Integer.parseInt(value);
			if (i == 100) {
				SS[j] = key;
				// System.out.println(SS[j]);
				j++;
			}
		}
		return SS;
	}
}

class Result implements Runnable {
	PipedOutputStream pout;
	Marks M = new Marks();
	String[] SS = M.centPercentage();

	Result(PipedOutputStream pout) {

		this.pout = pout;
	}

	int ii = SS.length - 1;
	int i = 0;

	public void run() {
		// byte[] b = (byte[])S[i];
		while (i <= ii ) {
			try {
				// System.out.println(S[i]);
				// byte[] s = SS[i].getBytes();
				String[] SPLIT = SS[i].split("");
				for(i=0;i<SPLIT.length;i++) {
				try {
					pout.write(SPLIT[i].getBytes());
					Thread.sleep(500);
				
				} catch (Exception E) {
					System.out.println("Line no - 62 " + E);
				}
				}
			} catch (Exception e) {
				System.out.println("Line No. - 70 "+e);
			}
			
			i++;
		}
	}
}

class ShowResult implements Runnable {
	PipedInputStream pin;
	Marks M = new Marks();
	String[] SS = M.centPercentage();
	int i = SS.length;
	int iii=0;
	
	ShowResult(PipedInputStream pin) {
		this.pin = pin;
	}

	public void run() {
		try {
			int ii = 0;
			while (ii <= i - 2) {
				String[] SPLIT = SS[ii].split("");
				for(iii=0;iii<SPLIT.length;iii++) {
				// String[] btos= new String(pin.read());
				// System.out.println(pin.read());
				System.out.print((char)pin.read());
				}
				ii++;
				System.out.println("");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

public class ThreadPipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PipedOutputStream pout = new PipedOutputStream();
		PipedInputStream pin = new PipedInputStream();
		try {
			pout.connect(pin);
		} catch (Exception E) {
			System.out.println("Line no - 107 " + E);
		}

		Result R = new Result(pout);
		ShowResult S = new ShowResult(pin);

		Thread T1 = new Thread(R);
		Thread T2 = new Thread(S);

		T1.start();
		T2.start();
	}

}