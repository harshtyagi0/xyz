package trainig_lecture_12;

import java.util.*;
import training_Lecture_10.*;

public class Test {
	public static void main(String[] args) {
//		Solution 1
		/*
		ArrayList<std> ad = new ArrayList();
		std s = new std("Harsh", 50);
		std s1 = new std("Amit", 60);
		std s2 = new std("Deepak", 40);
		ad.add(s);
		ad.add(s1);
		ad.add(s2);
		for (std val : ad)
			System.out.println(val);
		Collections.sort(ad, Comparator.comparing(std::getName));
		System.out.println("After Sort");
		for (std val : ad)
			System.out.println(val);
		*/
//		Solution 2

		LinkedList<String> al = new LinkedList();
		al.add("a");
		al.add("b");
		al.add("c");
		Iterator<String> itr = al.iterator();
		System.out.println("Values of LinkedList AL");
		while(itr.hasNext())
			System.out.println(itr.next());
		LinkedList<Integer> il = new LinkedList();
		il.add(5);
		il.add(16465);
		il.add(555);
		il.add(222);
		Iterator<Integer> i = il.iterator();
		System.out.println("Values of LinkedList IL");
		while(i.hasNext())
			System.out.println(i.next());
		Iterator II = al.descendingIterator();
		System.out.println("REv Values of LinkedList AL");
		while(II.hasNext())
			System.out.println(II.next());
		II = il.iterator();
		Vector v = new Vector();
//		v.addAll(il);
//		v.addAll(al);
		int x = 1;
		Iterator vi = v.iterator();
		while(vi.hasNext()) {
			System.out.println();
			x++;
		}
		System.out.println(x);

	}

}

class std {
	String name;
	int marks;

	std(String name, int mark) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}
}