package training;
import java.util.*;
class vvv{
	int c,d,e;
	/*void Display(String n, int roll, char gender) {
		Studs v = new Studs(n, roll ,gender);
		System.out.println(v.name);
		System.out.println(v.rollNo);
		System.out.println(v.gender);
	}*/
	public String toString() {
		String data = "\nState of class vvv \nc	: "+c;
		data += "\nd	: "+d;
		data += "\ne	: "+e;
		return data;
	}
	static void Display(Studs s) {
		System.out.print("Name : "+s.name);
		System.out.print("RollNo : "+s.rollNo);
		if(s.gender=='M' || s.gender=='F')
			System.out.print("Gender : "+s.gender);
	}
	static void Display(vvv v, Studs s) {
		System.out.println("\nState of VVV");
		System.out.print("\tC : "+v.c);
		System.out.print("\td : "+v.d);
		System.out.print("\te : "+v.e);
		System.out.println("\nState of Studs");
		System.out.print("\tName : "+s.name);
		System.out.print("\tRollNo : "+s.rollNo);
		if(s.gender=='M' || s.gender=='F')
			System.out.print("\tGender : "+s.gender);
	}
	void sum(vvv v) {
		System.out.println("Sum = "+(v.c+v.d+v.e));
	}
}

class Studs{
	String name;
	int rollNo;
	final char gender;
	
	Studs(String name, int rollNo, char gender){
		this.name= name;
		this.rollNo = rollNo;
		this.gender = gender;
	}

	Studs(String name, int rollNo){
		this.name= name;
		this.rollNo = rollNo;
		this.gender = ' ';
	}
	public String toString() {
		String data = "\nState of class Studs \nName	: "+name;
		data += "\nRoll No	: "+rollNo;
		data += "\nGender	: "+gender;
		return data;
		
	}
	void display(Object v) {
		System.out.print(v.toString());
	}
	
}
public class Launcher {
	
	public static void main(String[] args) {
		vvv a = new vvv();
		vvv b = new vvv();
		b.c=10;
		b.e=20;
//		a.sum(a);
//		a.sum(b);
//		Studs s = new Studs("Harsh",05);
//		vvv.Display(b, s);
		/*
		bankAccount ba = new bankAccount();
		ba.Deposit(20000);
		ba.display();
		ba.Deposit(20000);
		ba.display();
		bankAccount ba1 = new bankAccount();
		*/
//		System.out.println(ba);
//		System.out.println(ba1);
//		System.out.println(ba1=new  bankAccount());
//		System.out.println(ba1);
		Studs s = new Studs("Harsh",10,'M');
		s.display(s);
		s.display(a);
		LivingDead lv = new LivingDead();
//		System.gc();
		lv.printing();
		LivingDead ll = new LivingDead();
		lv.printing();
		ll.printing();
		
//		a=a.clone().getClass();//=a.getClass();
	}
	
	
	

}

class LivingDead{
	static byte count=0;
	LivingDead(){
		count++;
		System.out.print("\nCons created "+count);
		while(count>0) {
			System.exit(1);
		}

		
	}
	
	void printing() {
		System.out.println("Count = "+count);
	}
	
}

class bankAccount{
	String name;
	private int bal;
	void Deposit(int deposit) {
		bal = bal+deposit;
	}
	void WithDrawal(int withdrawal) {
		bal = bal-withdrawal;
	}
	void display() {
		System.out.println("Balance : "+(-bal));
	}
}

