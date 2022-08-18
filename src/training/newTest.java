package training;
class base{
	int a = 15;
	{
		System.out.println("Base");
	}
}
class child extends base{
	int a = 5;
	static{
		System.out.println("Static Block");
	}
	{
		System.out.println(a);
		a=25;
		System.out.println(this.a);
		System.out.println(super.a);
	}
	child(){
		System.out.println("Child Cons");
	}
}
public class newTest {
	
	static {
		System.out.println("Static Block of newTest");
	}
	
	{
		System.out.println("Non-Static Block of newTest");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child C = new child();
		final child d;
		d=C;
		System.out.println(C);
		System.out.println(d);

	}

}
