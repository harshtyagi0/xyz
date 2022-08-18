package training_Lecture_18;

import java.io.*;
import java.util.*;


class Student implements Serializable {
	int id;
	String name;
	
	

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Depersist {
	public static void dep(){  
	  try{  
	  //Creating stream to read the object  
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_18\\file.txt"));
	  Student s=(Student)in.readObject();  
	  //printing the data of the serialized object  
	  System.out.println(s.id+" "+s.name);  
	  //closing the stream  
	  in.close();  
	  }catch(Exception e){System.out.println(e);}  
	 }
}
class save{
	public static void s(int roll, String name) {
		try {
			// Creating the object
			Student s1 = new Student(roll, name);
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream(
					"C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_18\\file.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class stud{
	PipedInputStream marks;
	PipedInputStream name;
	stud(PipedInputStream marks,PipedInputStream name){
		this.marks=marks;
		this.name = name;
	}
	public stud(Object write) {
		// TODO Auto-generated constructor stub
	}
}
class result implements Runnable {
	ArrayList<stud> st = new ArrayList();
	ArrayList<String> printCenturian(){
		ArrayList<String> al = new ArrayList();
		System.out.println("ListMaded"+st.size());
		for(stud s : st) {
//			if(s.marks==100) {
//				al.add(s.name);
//				System.out.println("Adding Names");
//			}
			System.out.println("Skipping");
		}
		System.out.println("List");
		return al;
	}
	public void run() {
		
	}
}
public class Test {

	public static void main(String args[]) throws InterruptedException, IOException {
//		save.s(12, "Harsh");
//		save.s(15, "Hhh");
//		Depersist.dep();
		
		result R = new result();
		final PipedInputStream pipedInputStream=new PipedInputStream();
		final PipedOutputStream pipedOutputStream=new PipedOutputStream();
		
		/*Connect pipe*/
		pipedInputStream.connect(pipedOutputStream);
		
		/*Thread for writing data to pipe*/
		Thread pipeWriter=new Thread(new result() {
			@Override
			public void run() {
				byte[]b = {1,2};
//				pipedOutputStream.write(st.add(new stud(b)));
//				st.add(new stud( pipedOutputStream.write(b),pipedOutputStream.write(b)));
			}
		});
		
		/*Thread for reading data from pipe*/
		Thread pipeReader=new Thread(new result() {
			@Override
			public void run() {
//				ArrayList<String> a = new ArrayList();
//				a.addAll(printCenturian());
				for(String s :printCenturian()) {
					System.out.println(s);
				}
			}
		});
		
		/*Start thread*/
		pipeWriter.start();
		pipeReader.start();
		
		/*Join Thread*/
		pipeWriter.join();
		pipeReader.join();
		
		/*Close stream*/
		
			pipedOutputStream.close();
		
		
			pipedInputStream.close();
		
		
	}
}
