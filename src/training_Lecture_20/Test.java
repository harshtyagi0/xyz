package training_Lecture_20;

import java.util.*;
import java.io.*;

class Student{
	String name;
	String email;
//	Student(){}
}

class def{
	int d=45,e,f;
	public void delta() {
		if(d>=50) {
			System.out.println("Pagla gaya re ye to pura ka pura.......");
		}else{
			System.out.println("Kam krne de yar....");
		}
	}
	
}
public class Test {

	public Test() {
	}
	

//	10/5/2020
//	Properties Class
	public static void main(String[] args) throws Exception {

//		Properties p = System.getProperties();
//		Set set = p.entrySet();
//
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//		}

		Properties p = new Properties();
		p.setProperty("name", "Harsh Tyagi");
		p.setProperty("email", "harshtyagi@kelltontech.com");
		Student s = new Student();
		p.setProperty("name", s.name);
		p.setProperty(s.email, "null");

		p.store(new FileWriter("C:\\Users\\harsh\\eclipse-workspace\\training\\src\\training_Lecture_20\\infostd.properties"), "Javatpoint Properties Example");

	}

}


