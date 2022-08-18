package MessageServer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		MessageQueue MQ = new MessageQueue();
		MQ.putMessage("GoodEvening");
		MQ.putMessage("WhatsUp");
		int s = MQ.queueSize();
		MQ.showMessage();
		
		
		while (s > 0) {
			String message = MQ.showMessage();
			System.out.println(message);
			s--;
		}
		
	}

}
