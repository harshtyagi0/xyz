package training_Lecture_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
// Main class
public class GFG2 {
 
    // Main driver method
    public static void main(String[] args) throws IOException
    {
 
        // Creating object of File class
        // Passing files from directory of local machine
        File file = new File(
            "/Users/mayanksolanki/Desktop/demo.rtf");
        File oFile = new File(
            "/Users/mayanksolanki/Desktop/outputdemo.rtf");
 
        // Now creating object of FileInputStream
        // Here they are variables
        FileInputStream fis = null;
        FileOutputStream fos = null;
 
        try {
            // Now we make them as objects of both classes
            // and passed reference of file in directory
            fis = new FileInputStream(file);
            fos = new FileOutputStream(oFile);
        }
 
        // Catch block to handle exceptions
        catch (FileNotFoundException e) {
 
            // Display message if exception occurs
            // File Not Found or Path is Incorrect
        	e.printStackTrace();
        }
 
        try {
 
            // Now let us check how many bytes are available
            // inside content of file
            fis.available();
        }
 
        catch (Exception e) {
            e.printStackTrace();
        }
 
        // Using while loop to
        // write over outputdemo file
        int i = 0;
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
 
        // It will execute no matter what
        // to close connections which is
        // always good practice
       
        {
 
            // Closing the file connections
 
            // For input stream
            if (fis != null){
                fis.close();
            }
 
            // For output stream
            if (fos != null) {
                fos.close();
            }
        }
    }
}
