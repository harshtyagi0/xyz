package training_Lecture_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;

class xyz{
	int a;
	String ss;
	
	void printName(Object obj) {
		java.lang.Class c  = obj.getClass();
		System.out.println(c.getName());
	}
}
public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		Class c  = Class.forName("xyz");
//		System.out.println(c.getName());
//		xyz x = new xyz();
		
//		x.printName(x);
//		Reflection r  =new Reflection();
//		x.printName(r);
//		Class c = Class.forName(r.getClass().getName());
//		System.out.println(c.getName());
//		String s = new java.lang.String();
		
//		int []a =new int[1];
//		Class C =a.getClass();
//		System.out.println(C);
//		Class<?>[] all = Object.class.getClasses();
//		for(Object o:all) {
//			System.out.println(o.getClass().getName());
//		}
//		System.out.println(all);
//		Class<?>[] all = Character.class.getClasses();
//		byte[] bytes = new byte[1024];
//		Class cc = bytes.getClass();
//		System.out.println(cc.getName());
//		Class a = Class.forName(args[0]);
//		System.out.println(a.getName());
//		Class b = Class.forName(args[1]);
//		System.out.println(a.getName());
		
		Class c = Class.forName("training_Lecture_18.Reflection");
		System.out.println(c.isInterface());
		xyz x = new xyz();
		Class cl = xyz.class;
		Field [] F =cl.getFields();
		Method[] M =cl.getMethods();
		Constructor [] C = cl.getConstructors();
		
		for(int i=0; i<F.length;i++) {
			System.out.println(i);
			System.out.println(F[i]);
		}
		

	}

}
