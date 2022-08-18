package training_Lecture_18;

//Java program to demonstrate
//ByteBuffer class

import java.nio.*;
import java.util.*;

public class GFG {

	public static void main(String[] args)
	{

		// Declaring the capacity of the ByteBuffer
		int capacity = 50;

		// Creating the ByteBuffer
		try {
			
			String ss = "G";
			System.out.println(ss.length());
			
			int cap = (ss.length()*2)+2;

			// creating object of ByteBuffer
			// and allocating size capacity
			ByteBuffer bb = ByteBuffer.allocate(cap);

			// changeing bytebuffer view as char buffer
			// and putting a string value
			bb.asCharBuffer().put(ss);

			// Declaring char variable c
			char c;

			// print the ByteBuffer
			System.out.print("Char buffer : ");
			while ((c = bb.getChar()) != 0)
				System.out.print(c + " ");
			System.out.println();
			System.out.println(bb.capacity());
			System.out.println(bb.remaining());
		}

		catch (IllegalArgumentException e) {

			System.out.println("Exception thrown : " + e);
		}

		catch (ReadOnlyBufferException e) {

			System.out.println("Exception thrown : " + e);
		}
		/*
		MessageQueue.JAva
		private MessageGreater M = new MessageGreater();
		private Queue<byte[]> MessageQ = new LinkedList<byte[]>();
		private int QueueSize;

		public void putMessage(String s) {
			MessageQ.add(M.MM(s));
			QueueSize++;
		}

		public void showMessage() {
			Iterator I = MessageQ.iterator();

			while (I.hasNext()) {
				String s = M.ByteTOString((byte[]) I.next());
				System.out.println(s);
	
			}
			return s;
		}

		public int queueSize() {
			return QueueSize;
		}
	
		public void DeleteMsg() {
			MessageQ.remove();
		}
 */
		
		/* MessageGreater.Java
		 private byte[] Message;

	private void StringToByte(String text) {
		int cap = text.length();  
		Message = new byte[cap];
		for(int i=0; i<cap;i++) {
			Message[i]=(byte)text.charAt(i);
		}
	}
	
	public byte[] MM(String s) {
		StringToByte(s);
		return Message;
	}

	protected String ByteTOString(byte[] b) {
		char c;
		StringBuffer sb = new StringBuffer();
		for(byte first:b) {
			c= (char)first;
			sb.append(c);
		}
		return sb.toString();
	}
	
		 * */
		
	}
}
