package training_Lecture_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/*
public class test {
	
	public <T> void showItemDetails(T t) {
		System.out.println("Value = "+t+
				"\nType = "+t.getClass().getName());
	}
	public <Integer> int showIntDetails(Integer t) {
		System.out.println("Value = "+(int)t+
				"\nType = "+t.getClass().getName());
		return (int)t;
	}
	
	float sum;
	
	public <Float> void sumOfNumber(Float ... f) {
		for(int i = 0; i<f.length;i++) {
			this.sum+=(float)f[i];
		}
		
//		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> AL = new ArrayList();
		AL.add(55);
		int a= 442;
		AL.add(a);
		int i=AL.size();
		for(int c = 0; c<i; c++){
			System.out.println(AL.get(c));
			
		}
		int [] arr = {1,2,3};
		test abc = new test();
		abc.showItemDetails(arr);
		byte b = 55;
//		abc.sumOfNumber(b);
		abc.showIntDetails(45);
		abc.sumOfNumber(45.0f,54.0f);
		System.out.println(abc.sum);
//		System.out.println(abc.sumOfNumber(45.0f,54.0f));

	}

}
*/
class base{
	public <T> void alfa(T t) {
		System.out.println("Insdie Base \nValue = "+t);
	}
}

class child<T extends base>extends base {
	public <T> void alfa(T t) {
		super.alfa(t);
		System.out.println("Inside Child class");
	}
}
class abcd extends base{

}
public class test {
	
	public <T> void showItemDetails(T t) {
		System.out.println("Value = "+t+
				"\nType = "+t.getClass().getName());
	}
	public <Integer> int showIntDetails(Integer t) {
		System.out.println("Value = "+(int)t+
				"\nType = "+t.getClass().getName());
		return (int)t;
	}
	
	float sum;
	
	public <T> float sumOfNumber(T ... t) {
		for(int i = 0; i<t.length;i++) {
			this.sum+=(float)t[i];
		}
		
		return sum;
	}
	
	public <T> boolean compareArray(T[] t, T[] s) {
		if(t.length==s.length)
			return true;
		return false;
	
	}
	
	public static void main(String[] args) {
		/*
		test abc = new test();
//		System.out.println(abc.sumOfNumber(45.0f,54.0f));
//		Arrays.
		Integer a[] = {12,55};
		int [] aa = {1,2};
//		Integer aaa =aa;
		
		Integer b[] = {};
//		System.out.println(abc.compareArray(a,b));
//		xyz x = new xyz();
//		x.vall(abc);
//		xyz<abc> xyzz = new xyz<abc>();
//		ab in = new abc();
		Iterator I;
		Iterable ii;
		ArrayList AL = new ArrayList();
		AL.add(5);
		AL.add(aa);
		System.out.println(AL.get(0)+" "+AL.get(1)+" "+AL.size());
		for(Object t:AL) {
			System.out.println(t);
		}
		AL.forEach((element) -> { System.out.println(element); });
		ArrayList <String> S = new ArrayList();
		S.add("a");
		S.add("b");
		S.add("c");
		S.add("d");
		S.add("e");
		S.forEach((element) -> {System.out.println(element);});
		ArrayList <String> S1 = new ArrayList();
		S1.addAll(S);
		for(String ss:S1)
			System.out.println(ss);
		*/
		String st[]= {"sdcs","sdfsdas"};
		String s1[]= new String[st.length];
		int index =0;
		for(String el:st) {
			s1[index]= el;
			System.out.println(s1[index]);
			if(index==1)
				System.out.println(el);
			index++;
		}
		
		child xx = new child();
		xx.alfa(st);
		ArrayList S1 = new ArrayList();
		base b = new base();
		S1.add(b);
		Collections.sort(S1);
	}
}
interface ab{}
class Mother{
	int M = 45;
	void alfa() {
		System.out.println("Mother's Alfa");
	}
	class Baby{
		int M;
		void alfa() {
			System.out.println("I am a Baby");
		}
	}
}
