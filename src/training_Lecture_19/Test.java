package training_Lecture_19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

class DIRT {
	static <T> Constructor[] peepInside(String s) {
		try {
			Constructor[] ch = Class.forName(s).getConstructors();
			System.out.println(ch.length);
			return ch;
		} catch (Exception E) {
		}
		return null;
	}

	public static DIRT makeDirt() {
		DIRT D = new DIRT();
		return D;
	}
}

class DD {
	public DD() {
		System.out.println("Inside 0");
	}

	public DD(int a, int b) {
		System.out.println("Inside 2");
	}
}

class abc {
	static int count = 0;

	private abc() {
	}

	static abc obj(int a) {
		abc X = null;
		while (count < a) {
			X = new abc();
			count++;
			System.out.println(X.hashCode());
			System.out.println(count);

		}
		return X;
	}
}

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
//		int r = Integer.parseInt("3");
//		abc.obj(r);
//		abc.obj(r);

		Constructor[] c = DIRT.peepInside(args[0]);
		for (Constructor cons : c) {
			System.out.println("Constructor Name: " + cons.getName());
			int modifier = cons.getModifiers();
			String mod = Modifier.toString(modifier);
			System.out.println("Modifier: " + mod);
			Class p[] = cons.getParameterTypes();
			
			if(p.length==0)
			cons.newInstance();
		}
//		DIRT.makeDirt(args[0]);
//		Object obj = Class.forName(args[0]).newInstance();
//		Object ref = new c[i];
//		System.out.println("cons");

	}

}
