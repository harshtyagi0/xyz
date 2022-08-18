package Assessment;

public class HarshAssignment {

	public static void main(String[] args) {

		trial t = new trial("ABC", 45);
		System.out.println(t);
		System.out.println(t.hashCode());
//		212628335
		
		t.alfa(50);
		System.out.println(t.marks);

		trial x = new trial("XYZ", 55);
		System.out.println(x);
		try {
			if (x.clone() == x.getClass())
				System.out.println(true);
			else
				System.out.println(false);
		} catch (Exception E) {
			System.out.println("Exception: " + E);
		}

	}

}

class trial {
	String name;
	int marks;
	char grade;

	trial(String name, int marks) {
		this.name = name;
		this.marks = marks;
		this.grade = ' ';
	}
	
	void alfa(int marks) {
		marks=marks;
	}

	public String toString() {
		String info = "Name	= " + name;
		info += "\nMarks	= " + marks;
		if (grade==' ' && marks>=50) {
			if (marks >= 90)
				grade = 'O';
			else if (marks >= 80)
				grade = 'A';
			else if (marks >= 70)
				grade = 'B';
			else if (marks >= 60)
				grade = 'C';
			else
				grade = 'D';
			info += "\nGrade	= " + grade+"\nPass";
			
		} else
			info += "\nFail\nFlying Chappal Recieved";
		return info;
	}
	
//	public int hashCode() {
//		int h=5;
//		return (int) (5*h/(2.26));
//	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone().getClass();
	}
//	public int hashCode() {
//		super.hashCode();
//		return Integer.hashCode(super.hashCode());
//	}
}
