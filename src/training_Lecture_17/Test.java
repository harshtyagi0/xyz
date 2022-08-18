package training_Lecture_17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.Scanner;

public class Test {
	public static String readFileAsString(String fileName)throws Exception
	  {
	    String data = "";
//	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    Path p = Paths.get(fileName);
	    byte [] b = Files.readAllBytes(p);
	    data = new String(b);
	    return data;
	  }

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_17\\abc.txt");
//		String data ="";
//		String path = args[0];
//		try {
//			
//			data = readFileAsString(path);
//			System.out.println("Second file");
//			System.out.println(readFileAsString(args[1]));
//		String data ="";
//		String path = args[0];
//		try {
//			
//			data = readFileAsString(path);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	    System.out.println(data);
//		try {
//			f.createNewFile();
//			System.out.println("done");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			Scanner sc = new Scanner(f);
//			 while (sc.hasNextLine())
//			      System.out.println(sc.nextLine());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 Scanner sc = new Scanner(System.in);
		  
	        // String input
		 /*
	        String name = sc.nextLine();
	  
	        // Character input
	        char gender = sc.next().charAt(0);
	  
	        // Numerical data input
	        // byte, short and float can be read
	        // using similar-named functions.
	        int age = sc.nextInt();
	        long mobileNo = sc.nextLong();
	        double cgpa = sc.nextDouble();
	  
	        // Print the values to check if the input was correctly obtained.
	        System.out.println("Name: "+name);
	        System.out.println("Gender: "+gender);
	        System.out.println("Age: "+age);
	        System.out.println("Mobile Number: "+mobileNo);
	        System.out.println("CGPA: "+cgpa);
	       
	        int sum = 0, count = 0;
	        
	        // Check if an int value is available
	        while (sc.hasNextInt())
	        {
	            // Read an int value
	            int num = sc.nextInt();
	            sum += num;
	            count++;
	        }
	        int mean = sum / count;
	        System.out.println("Mean: " + mean);
	        */
		
//		Scanner sc;
//		try {
//			sc = new Scanner(f);
//			sc.useDelimiter("f");
//			 
//		    System.out.println(sc.next());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		FileReader sourceStream = null;
        try {
            sourceStream
                = new FileReader("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_17\\abcd.txt");
  
            // Reading sourcefile and
            // writing content to target file
            // character by character.
            int temp;
            while ((
                       temp = sourceStream.read())
                   != -1)
                System.out.println((char)temp);
        }
        finally {
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
        File file = new File("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_17\\abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;
  
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
        }
        if (sentenceCount >= 1) {
            paraCount++;
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of sentences = "+ sentenceCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of paragraphs = "+ paraCount);
        System.out.println("Total number of whitespaces = "+ whiteSpaceCount);
    }
}

		 
		
	
