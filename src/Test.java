import java.nio.ByteBuffer;

public class Test {

	public static void main(String[] args) {
		String text = "String";
		byte[] b = new byte[text.length()];
		for (int i = 0; i < text.length(); i++) {
			b[i] = (byte) text.charAt(i);
		}
		ByteBuffer Message = ByteBuffer.allocate(1024);
		Message.put(b);
		System.out.println(Message.remaining());
		System.out.println(Message.capacity());
		Message.put(b, (Message.capacity()-Message.remaining()), text.length());
		System.out.println(Message.remaining());
		System.out.println(Message.capacity());
		char c;
		StringBuffer sb = new StringBuffer();
		while ((c = Message.getChar()) != 0)
			sb.append(c);
		System.out.println(sb.toString());

	}

}
