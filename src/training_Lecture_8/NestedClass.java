package training_Lecture_8;
import training.*;

class outer{
	static class firstClass{
		int x=15,y=20,z=10;
		int sums() {
			int s = x+y+z;
			return s;
		}
	}
	class secondClass extends firstClass{
		void sum(int x, int y, int z) {
			int result= super.sums()+x+y+z;
			System.out.println(result);
		}
		
	}
}

public class NestedClass {
	
	public static void main(String [] args) {
		outer o = new outer();
		System.out.println(new outer.firstClass().sums());
		outer.secondClass s = o.new secondClass();
//		s.sum(10, 15, 25);
		
		
	}

}
