package training;

import java.util.Scanner;

public class abc {
	
	public static void main(String[] args) {
		System.out.println("Harsh Tyagi");	
		System.out.println("Table of 10");
		for(int i=1; i<=10;i++){
			System.out.println("10 * "+i+" = "+(10*i));
		}
		System.out.println("Multiple of 3 ");
		
		abcd a = new abcd();
		a.alpha();
		Scanner scan = new Scanner(System.in);
		Person p = new Person();
		p.setName("MyName");
		p.setAge(26);
		p.setGender('m');
		Person p1 = new Person();
		p1.setName("");
		p1.setAge(5);
		p1.setGender('m');
		
		if(p.name==p1.name && p.age==p1.age && p.gender==p1.gender) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
	}
	
	
	public static int noteCount(int x) {
		int count=0;
		while(x!=0) {
			if(x>=500) {
				count += (x/500);
				x=x%500;
			}else if(x>=100) {
				count += (x/100);
				x%=100;
			}else if(x>=50) {
//				count
			}
		}
		return 0;
		
		
	}

}

class abcd{
	bcd d = new bcd();
	void alpha() {
		System.out.println("Inside Alpha");
		bcd.beta();
	}
}
class bcd{
	static void beta() {
		System.out.println("Inside Beta");
	}
}

class Person{
	String name;
	int age;
	char gender;
	
	public void setName(String name) {
		this.name= name;
	}
	public void setAge(int age) {
		this.age= age;
	}
	
	public void setGender(char gender) {
		this.gender= gender;
	}
	
}
