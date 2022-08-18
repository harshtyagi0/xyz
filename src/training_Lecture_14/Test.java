package training_Lecture_14;

import java.util.*;

public class Test {
	void alfa() {
		System.out.println("abc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Test t = new Test(); // String val = t.alfa(); Map<String, String> map=new
		 * HashMap(); //Adding elements to map map.put("key1","Value1");
		 * map.put("key2","Value2"); Map<String, String> mapB = new HashMap();
		 * mapB.putAll(map); System.out.println(mapB.isEmpty()+" "+map.size());
		 * System.out.println(map.containsKey("key1"));
		 * System.out.println(map.containsValue("Value1"));
		 * 
		 * Iterator a = map.entrySet().iterator(); Iterator aa =
		 * map.keySet().iterator();
		 * 
		 * 
		 * 
		 * //Traversing Map Set set=map.entrySet();//Converting to Set so that we can
		 * traverse Iterator itr=set.iterator(); while(aa.hasNext()){ //Converting to
		 * Map.Entry so that we can get key and v // Map.Entry
		 * entry=(Map.Entry)aa.next(); Object key = aa.next(); Object value =
		 * map.get(key); System.out.println(key+" "+value); }
		 * 
		 * for(Map.Entry m : map.entrySet()) {
		 * System.out.println(m.getKey()+"="+m.getValue()); }
		 * 
		 * for(Object m : map.keySet()){ System.out.println(m+"="+map.get(m)); }
		 */
		SortedMap<String, String> s = new TreeMap();
		s.subMap(null, null);
		
		
		s.put("DHO", "13");
		s.put("DHONI", "7");
		s.put("Harsh Tyagi", "13");

		Iterator sI = s.keySet().iterator();
		while (sI.hasNext()) {
			String k = (String) sI.next();
			String V = s.get(k);
			System.out.println(k + " = " + V);
		}

	}

}

class std {
	String name;
	int marks;

	std(String name, int marks) {
		this.marks = marks;
		this.name = name;
	}
}
