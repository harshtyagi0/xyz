package training_Lecture_18;

import java.nio.ByteBuffer;

public class DEmo {
	
	public static void main(String[] args) {
		ByteBuffer b = ByteBuffer.allocate(10);
	
		System.out.println(b.capacity());
		System.out.println(b.remaining());
//		b.asCharBuffer().put("abcdef");
		byte bb [] = {1,2,5};
		System.out.println(b.remaining());
		b.put(bb);
		System.out.println(b.remaining());
		b.put(bb);
		System.out.println(b.remaining());
		b.put(bb);
		System.out.println(b.remaining());
		b.put((byte)1);
		System.out.println(b.remaining());
		b.put(bb[0]);
		System.out.println(b.remaining());
		System.out.println(b);
	
	}

}
