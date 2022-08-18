package training_Lecture_10;

import java.util.*;

public class exampleDeque {
	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.offerFirst("Vijay");
		deque.add("Ajay");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}

		deque.removeLast();
		deque.addLast("abc");
		System.out.println("\nPaisa laya\n");
		for (String str : deque) {
			System.out.println(str);
		}
	}

}
