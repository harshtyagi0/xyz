package MessageServer;

import java.nio.ByteBuffer;
import java.util.*;

public class MessageQueue {
	private MessageGreater M = new MessageGreater();
	private Queue<ByteBuffer> MessageQ = new PriorityQueue<>();
	private int QueueSize;

	public void putMessage(String s) {
		MessageQ.add(M.StringToByte(s));
		QueueSize++;

	}

	public String showMessage() {
		String s = M.ByteTOString(MessageQ.peek());
		MessageQ.remove();
		return s;
	}

	public int queueSize() {
		return QueueSize;
	}

}
