package training;

class ccc{
	int c = 45;
	
	ccc(){
		System.out.println("Base");
	}
	ccc(int a){
		c+=a;
		System.out.println("Base "+c);
	}
	ccc(int a, int b){
		c+=a;
		c+=b;
		System.out.println("Base "+c);
	}
	void ceta() {}
	void DisplayState() {
		System.out.println(c);
	}
}
class ddd extends ccc{
	int x;
	static{
		System.out.println("Static Block");
	}
	{
		x=10;
		x++;
		System.out.println("Non-Static Block");
	}
	int d = 23;
	ddd(){
		x++;
		System.out.println("Child"+x);
	}
	ddd(int a){
		super(15);
		x--;
		d+=a;
		System.out.println("Child "+d+" "+x);
	}
	ddd(int a, int b){
		super(10,15);
//		this(25);
		d+=a; d+=b;
		x+=d;
		x%=5;
		System.out.println("Child "+d+"\nx"+x);
	}
	void delta() {}
	
	void delta(short aa,short a) {
		System.out.println("Short");
	}
	void delta(int a, byte b) {
		System.out.println("Int");
	}
	void delta(float a) {
		System.out.println("Float");
	}
	void delta(double a) {
		System.out.println("double");
	}
	void delta(int a,int b) {}
	void delta(byte a, int b) {}
	void DisplayState() {
		super.DisplayState();
		System.out.println(d);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ddd D  = new ddd();
		ddd D1 = new ddd(10);
		ddd D2 = new ddd(11,21);
//		D.DisplayState();
//		byte b = 10;
//		D.delta(b,10);

	}

}
