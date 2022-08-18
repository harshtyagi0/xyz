package training;

public class number {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		option o = new option();
		int a = option.number(5, 7);
		System.out.println(a);
//		int b  = option.compareasMany(null);
		option.nn(15,12,25,18,35,45,10);
		float [] x= {12.0f, 15.0f,12.055f,};
		System.out.println(x);
		boolean [] b;
//		b = {false};
		char [] c ;
		int [] y = new int[2];

	}

}

class option{
	static int number(int a, int b) {
		if(a>b)
			return a;
		return b;
	}
	
	static void nn(int ...a) {
		int numb=0;
		for(int n:a) {
			if(n>numb)
				numb=n;
		}
		System.out.print(numb);
	}
	
	static int compareasMany (int arr[]) {
		int numb = 0;
		for(int i= 0; i<arr.length; i++) {
			if(numb<arr[i])
				numb=arr[i];
		}
		return numb;
	}

}
