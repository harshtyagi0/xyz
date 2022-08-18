package training_Lecture_17;

import java.io.*;

public class Launcher {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "this is a file.";
		String sss = "     ";
		String[] aa = sss.split("\\s");
		for (String a : aa) {
			System.out.println(a);
		}
		int v = aa.length;
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_17\\text.dat"))) {
			dout.writeDouble(1.1);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('4');
		}

		catch (FileNotFoundException ex) {
			System.out.println("Cannot Open the Output File");
			return;
		}

// Reading the data back using DataInputStream
		try (DataInputStream din = new DataInputStream(new FileInputStream("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_17\\text.dat"))) {
			double a = din.readDouble();
			int b = din.readInt();

			boolean c = din.readBoolean();
			char d = din.readChar();

			System.out.println("Values: " + a + " " + b + " " + c + " " + d);
		}

// Catch block to handle FileNotFoundException
		catch (FileNotFoundException e) {
			System.out.println("Cannot Open the Input File");
			return;
		}
	}
}