package training_Lecture_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_16\\CopyingFile.java");
		File oFile = new File("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_16\\newFile.txt");

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// Now we make them as objects of both classes
			// and passed reference of file in directory
			fis = new FileInputStream(file);
			fos = new FileOutputStream(oFile);
			System.out.println("fos and fis File created");
		}

		// Catch block to handle exceptions
		catch (FileNotFoundException e) {

			// Display message if exception occurs
			// File Not Found or Path is Incorrect
			e.printStackTrace();
			System.out.println(e);
		}

		try {

			// Now let us check how many bytes are available
			// inside content of file
			fis.available();
			System.out.println("fis File available");
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

		int i = 0;
		try {
			while ((i = fis.read()) != -1) {
				fos.write(i);
				System.out.println("writting in fos File "+ i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		finally{

			// Closing the file connections

			// For input stream
			if (fis != null) {
				try {
					fis.close();
					System.out.println("fis File closed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e);
				}
			}

			// For output stream
			if (fos != null) {
				try {
					fos.close();
					System.out.println("fos File closed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e);
				}
			}
		}
	}
}
