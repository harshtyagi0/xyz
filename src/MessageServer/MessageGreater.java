package MessageServer;

import java.nio.ByteBuffer;

public class MessageGreater {
	private int smallBlockSize = 4*1024;
	private int mediumBlockSize = 128*1024;
	private int largeBlockSize = 1024 * 1024;
	private int smallBlockOffSet = 0;
	private int mediumBlockOffSet = 0;
	private int largeBlockOffSet = 0;

	private int smallBlockCount = 0;
	private int mediumBlockCount = 0;
	private int largeBlockCount = 0;
	private ByteBuffer smallMessage = ByteBuffer.allocate(smallBlockSize);
	private ByteBuffer mediumMessage = ByteBuffer.allocate(mediumBlockSize);
	private ByteBuffer largeMessage = ByteBuffer.allocate(largeBlockSize);

	protected ByteBuffer StringToByte(String text) {
		int cap = (text.length() * 2) + 2;
		if (smallMessage.remaining() >= cap) {
			smallBlockOffSet = smallMessage.capacity()-smallMessage.remaining();
			smallMessage.asCharBuffer().put(text);
			return smallMessage.slice();
		}else if(mediumMessage.remaining()>=cap) {
			mediumMessage.asCharBuffer().put(text);
			return mediumMessage;
		}
		largeMessage.asCharBuffer().put(text);
		return largeMessage;
	}

	protected String ByteTOString(ByteBuffer b) {
		char c;
		StringBuffer sb = new StringBuffer();
		while ((c = b.getChar()) != 0)
			sb.append(c);
		return sb.toString();
	}

}
