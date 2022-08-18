package training_Lecture_9;
class CashPayment implements Payment{
	public void pay() {
		System.out.println("Cash");
	}
}

class CreditPayment implements Payment{
	public void pay() {
		System.out.println("Credit");
	}
}
interface Payment{
	void pay();
}
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashPayment C = new CashPayment();
		C.pay();
		Payment p = new CashPayment();
		p.pay();
		p= new CreditPayment();
		p.pay();
		
		Bike b = new Bike();
		System.out.println(b.speedLimit);
		b.Race();
		
		System.out.println(b.getClass());
		
		Object h = new Honda();
		int [] i = {1,5,2,4};
		String s = new String( i.toString());
		System.out.println(s);
		System.out.println(i.hashCode());
		System.out.println(b.toString().toString());
		System.out.println(i);
		Object [] a = new Object[20];
		int abc = 5;
		a[0]=abc;
		a[1]=15;
		System.out.println(a[0]+" - - "+a[1]);
		Integer ii = new Integer(abc);

	}

}

class Bike{
	int speedLimit = 90;
	void Race() {
		System.out.println("Riding a Bike");
	}
}
class Honda extends Bike{
	int speedLimit = 150;
	void Race() {
		System.out.println("Riding a Honda");
	}
}
