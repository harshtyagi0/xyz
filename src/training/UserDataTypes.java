package training;

public class UserDataTypes {
	Student[] stud_data;
	actors[] Act_data;
	politicians[] poli_data;
	static byte totalNumbStud;
	static byte totalNumbAct;
	static byte totalNumbPoli;
//	have all you been able to identify whats wrong with this object?
//	and how do we avoid this problem?

	static void setStudData(byte n) {
		totalNumbStud = n;
		for (byte i = 0; i < n; i++) {

		}
	}

	static void studentData(Student s) {
		System.out.println(s.Stud_name + " " + s.percentage);
	}

	static void actorsData(actors a) {
		System.out.println(a.Actor_name + " " + a.role + " " + a.netWorth);
	}

	static void politiciansData(politicians p) {
		System.out.println(p.politician_name + " " + p.party_Name);
	}

	public static void main(String[] args) {
		studentData(new Student("Harsh", 85));
		actorsData(new actors("Abc", "Hero", 555555));
		politiciansData(new politicians("Xyz", "IJK"));
		Room r = new Room();
		System.out.print(r.l);
		System.out.print(r.b);
		System.out.print(r.h);
	}

}

class Student {
	String Stud_name;
	float percentage;

	Student(String Stud_name, float percentage) {
		this.Stud_name = Stud_name;
		this.percentage = percentage;
	}

}

class Room {
	int h, l, b;
}

class actors {
	String Actor_name;
	String role;
	float netWorth;

	actors(String Actor_name, String role, float netWorth) {
		this.Actor_name = Actor_name;
		this.role = role;
		this.netWorth = netWorth;
	}
}

class politicians {
	String politician_name;
	String party_Name;

	politicians(String politician_name, String party_name) {
		this.politician_name = politician_name;
		this.party_Name = party_name;
	}

}

class Cricketer {
	String Cricketer_name;
	String team_Name;

}
