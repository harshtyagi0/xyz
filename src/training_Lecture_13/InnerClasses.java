package training_Lecture_13;

import java.util.*;

public class InnerClasses {
	static class Mother {
//		<T> alfa(){
//			return null;
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet<String> set=new HashSet<String>();  
//        set.add("Alfa");  
//        set.add("Charle");  
//        set.add("Delta");  
//        set.add("Beta");
		/*
		 * HashSet<Integer> set = new HashSet<Integer>(); set.add(5); set.add(125);
		 * System.out.println("An initial list of elements: " + set); for (int v : set)
		 * System.out.println(v); Iterator I = set.iterator();
		 * System.out.println("Iterator"); while (I.hasNext())
		 * System.out.println(I.next());
		 * 
		 * HashSet<Mother> setObj = new HashSet<Mother>(); setObj.add(new
		 * InnerClasses.Mother()); setObj.add(new InnerClasses.Mother()); setObj.add(new
		 * InnerClasses.Mother()); setObj.add(new InnerClasses.Mother()); setObj.add(new
		 * InnerClasses.Mother()); setObj.add(new InnerClasses.Mother());
		 * System.out.println("Mother Class Obj"); for (Mother vv : setObj)
		 * System.out.println(vv); Iterator II = setObj.iterator();
		 * System.out.println("Iterator"); while (II.hasNext())
		 * System.out.println(II.next());
		 * 
		 */

		Set<Book> set = new TreeSet<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing TreeSet
		System.out.println(b1.compareTo(b3));
//		for (Book b : set) {
//			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
//		}

	}

}

class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
