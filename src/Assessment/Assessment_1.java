package Assessment;

public class Assessment_1 {

	public static void main(String[] args) {
		abc a = new abc();
		abc b = new abc();
		System.out.println(a.toString());
		a.a=10;
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		
//
//		String s = new String("asdfg");
		String s1 = "asdfg";
		s1="abcd";
//		
//		
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		room r = new room();
//		System.out.println(Integer.hashCode(180));
//		final int I = 0;
//		final int b = 0;
//		final int h = 1;
//
//		System.out.println(Integer.hashCode(b));
//		System.out.println(Integer.hashCode(h));
//		
		
	}

}

class abc {
	int a;
	int b, c, d;
	
	public String toString() {
		String data = "\na = "+a;
		data+="\nb = "+b;
		data+="\nc = "+c;
		data+="\nd = "+d;
		return data;
	}

//	public int hashCode() {
//		Integer.toHexString(1);
//		return 5;
//	}
}

class room {
	final int a;
	final int b;
	final int c;

	room() {
		this.a = 0;
		this.b = 0;
		this.c = 11;
	}
}

class jkl {
}

class ccc {
	jkl J;
}

//Lets make objects of ccc
class Test {
	public static void main(String[] args) throws Exception {
		ccc C = new ccc();
		ccc D = new ccc();
		int m = C.hashCode();
		int n = D.hashCode();
		System.out.println(m);
		System.out.println(n);
//		int m = C.J.hashCode();
//		int n = D.J.hashCode();
	}
}
/*
 * HashCode():- IntrinsicCandidate
 * 
 * 
 * Returns a hash code value for the object. This method issupported for the
 * benefit of hash tables such as those provided by java.util.HashMap.
 * 
 * The general contract of hashCode is: •Whenever it is invoked on the same
 * object more than once duringan execution of a Java application, the hashCode
 * methodmust consistently return the same integer, provided no informationused
 * in equals comparisons on the object is modified.This integer need not remain
 * consistent from one execution of anapplication to another execution of the
 * same application. •If two objects are equal according to the equals(Object)
 * equals method, then calling the hashCode method on each of the two objects
 * must produce thesame integer result. •It is not required that if two objects
 * are unequalaccording to the equals(Object) equals method, thencalling the
 * hashCode method on each of the two objectsmust produce distinct integer
 * results. However, the programmershould be aware that producing distinct
 * integer results forunequal objects may improve the performance of hash
 * tables.
 * 
 * Returns: a hash code value for this object.
 * 
 * See Also: java.lang.Object.equals(java.lang.Object)
 * java.lang.System.identityHashCodeImpl Spec: As far as is reasonably
 * practical, the hashCode method definedby class Object returns distinct
 * integers for distinct objects.
 */
/**
 * hashCode() Returns a hash code value for the object. This method is supported
 * for the benefit of hash tables such as those provided by
 * {@link java.util.HashMap}.
 * <p>
 * The general contract of {@code hashCode} is:
 * <ul>
 * <li>Whenever it is invoked on the same object more than once during an
 * execution of a Java application, the {@code hashCode} method must
 * consistently return the same integer, provided no information used in
 * {@code equals} comparisons on the object is modified. This integer need not
 * remain consistent from one execution of an application to another execution
 * of the same application.
 * <li>If two objects are equal according to the {@link equals(Object) equals}
 * method, then calling the {@code
 *     hashCode} method on each of the two objects must produce the same integer
 * result.
 * <li>It is <em>not</em> required that if two objects are unequal according to
 * the {@link equals(Object) equals} method, then calling the {@code hashCode}
 * method on each of the two objects must produce distinct integer results.
 * However, the programmer should be aware that producing distinct integer
 * results for unequal objects may improve the performance of hash tables.
 * </ul>
 *
 * @implSpec As far as is reasonably practical, the {@code hashCode} method
 *           defined by class {@code Object} returns distinct integers for
 *           distinct objects.
 *
 * @return a hash code value for this object.
 * @see java.lang.Object#equals(java.lang.Object)
 * @see java.lang.System#identityHashCode
 * 
 * 
 * @IntrinsicCandidate public native int hashCode();
 */

/**
 * toString() Returns a string representation of the object.
 * 
 * @apiNote In general, the {@code toString} method returns a string that
 *          "textually represents" this object. The result should be a concise
 *          but informative representation that is easy for a person to read. It
 *          is recommended that all subclasses override this method. The string
 *          output is not necessarily stable over time or across JVM
 *          invocations.
 * @implSpec The {@code toString} method for class {@code Object} returns a
 *           string consisting of the name of the class of which the object is
 *           an instance, the at-sign character `{@code @}', and the unsigned
 *           hexadecimal representation of the hash code of the object. In other
 *           words, this method returns a string equal to the value of:
 *           <blockquote>
 * 
 *           <pre>
 *           getClass().getName() + '@' + Integer.toHexString(hashCode())
 *           </pre>
 * 
 *           </blockquote>
 *
 * @return a string representation of the object.
 * 
 * 
 *         public String toString() { return getClass().getName() + "@" +
 *         Integer.toHexString(hashCode()); }
 */

/**
 * equals() Indicates whether some other object is "equal to" this one.
 * <p>
 * The {@code equals} method implements an equivalence relation on non-null
 * object references:
 * <ul>
 * <li>It is <i>reflexive</i>: for any non-null reference value {@code x},
 * {@code x.equals(x)} should return {@code true}.
 * <li>It is <i>symmetric</i>: for any non-null reference values {@code x} and
 * {@code y}, {@code x.equals(y)} should return {@code true} if and only if
 * {@code y.equals(x)} returns {@code true}.
 * <li>It is <i>transitive</i>: for any non-null reference values {@code x},
 * {@code y}, and {@code z}, if {@code x.equals(y)} returns {@code true} and
 * {@code y.equals(z)} returns {@code true}, then {@code x.equals(z)} should
 * return {@code true}.
 * <li>It is <i>consistent</i>: for any non-null reference values {@code x} and
 * {@code y}, multiple invocations of {@code x.equals(y)} consistently return
 * {@code true} or consistently return {@code false}, provided no information
 * used in {@code equals} comparisons on the objects is modified.
 * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should
 * return {@code false}.
 * </ul>
 *
 * <p>
 * An equivalence relation partitions the elements it operates on into
 * <i>equivalence classes</i>; all the members of an equivalence class are equal
 * to each other. Members of an equivalence class are substitutable for each
 * other, at least for some purposes.
 *
 * @implSpec The {@code equals} method for class {@code Object} implements the
 *           most discriminating possible equivalence relation on objects; that
 *           is, for any non-null reference values {@code x} and {@code y}, this
 *           method returns {@code true} if and only if {@code x} and {@code y}
 *           refer to the same object ({@code x == y} has the value
 *           {@code true}).
 *
 *           In other words, under the reference equality equivalence relation,
 *           each equivalence class only has a single element.
 *
 * @apiNote It is generally necessary to override the {@link hashCode hashCode}
 *          method whenever this method is overridden, so as to maintain the
 *          general contract for the {@code hashCode} method, which states that
 *          equal objects must have equal hash codes.
 *
 * @param obj the reference object with which to compare.
 * @return {@code true} if this object is the same as the obj argument;
 *         {@code false} otherwise.
 * @see #hashCode()
 * @see java.util.HashMap
 * 
 * 
 *      public boolean equals(Object obj) { return (this == obj); }
 */