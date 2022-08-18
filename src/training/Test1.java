package training;


class WiseOwl{
	void alfa() {
		System.out.println("WiseOwl");
	}
}
class JungleJava extends WiseOwl{
	void alfa() {
		System.out.println("Junglee trainer howls to WiseOwls");
	}
}








abstract class vehicle{
	abstract void vehicleName(String s);
	abstract void vehicleNumber(String s);
	abstract void numberOfTires();
	abstract float millage(float f);
}
class fourVehicler extends vehicle{

	@Override
	void vehicleName(String s) {
		// TODO Auto-generated method stub
		
	}
	float millage(float f) {
		return f;
	}

	
	@Override
	void vehicleNumber(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void numberOfTires() {
		// TODO Auto-generated method stub
		
	}
	
}



abstract class base1{
	private int x;
	base1(){
		System.out.println("Base Class Constructor");
	}
	abstract int sum(int x, int y);
	void setX(int x) {
		this.x=x;
	}
	int getX() {
		return x;
	}
	
}
class child1 extends base1{
	int x;
	child1(){
		this.x=1;
		super.setX(12);
		System.out.println("Child Class Constructor");
	}
	void setX(int x, int y) {
		this.x=x;
		super.setX(y);
	}
	void getVal() {
		System.out.println(x);
		System.out.println(super.getX());
	}

	@Override
	int sum(int x, int y) {
		// TODO Auto-generated method stub
		return (x+y);
	}
	
}
public class Test1 {
	
	public static void main(String[] args) {
//		child1 c = new child1();
//		c.setX(10, 20);
//		c.getVal();
		JungleJava j = new JungleJava();
		JungleJava jj = new JungleJava();
		j.alfa();
		
		if(j.equals(jj)) {
			System.out.println("Same");
		}else {
			System.out.println("Nope");
		}
	}

}

