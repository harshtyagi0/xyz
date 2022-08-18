package training_Lecture_16;

import java.io.*;

//Main class
public class GFG {

 // Main driver method
 public static void main(String[] args)
 {
     // Creating a new file by
     // creating object of File class where
     // local directory is passed as in argument
     File file
         = new File("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_16\\GFG.java");

     // Checking if file exists
     boolean exists = file.exists();
     if (exists == true) {

         // Changing the file permissions
         file.setExecutable(true);
         file.setReadable(true);
         file.setWritable(false);
         System.out.println("File permissions changed.");

         // Printing the permissions associated with the
         // file currently
         System.out.println("Executable: "
                            + file.canExecute());
         System.out.println("Readable: "
                            + file.canRead());
         System.out.println("Writable: "
                            + file.canWrite());
     }

     // If we reach here, file is not found
     else {
         System.out.println("File not found");
     }
 }
}


