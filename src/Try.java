import java.lang.reflect.*;

class DDDD { // Error
	public DDDD() {
		System.out.println("DDDD");
	}
}

class Dirt {
	static <T> Constructor[] peepInside(String s) {
		try {
			Class c = Class.forName(s);
			Constructor[] Cn = c.getConstructors();
			System.out.println(Cn.length);
			return Cn;
		} catch (Exception E) {
			System.out.println(E);
			return null;
		}
	}

	public static Dirt makeDirt() {
		Dirt D = new Dirt();
		return D;
	}
}

public class Try {
	public Try() {
		System.out.println("Inside Something");
	}

	public Try(int r) {
	}

	public static void main(String args[]) {
		// int r = Integer.parseInt("3");

		Constructor[] c = Dirt.peepInside(args[0]);
		for (int i = 0; i < c.length; i++) {
			try {
				c[0].newInstance();
//				System.out.println(O.toString());
			} catch (Exception e) {
			}
		}
	}
}