package core_java;

import java.util.*;


class Container<T> {
	
	private T val;

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
	

}

public class Collection_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Container<Number>  con = new Container();
//		? s ;
		char c = '1';
		byte n = (byte) c;
		con.setVal(n);
		System.out.println(con.getVal());
		System.out.println(con.getVal().getClass().getName());
		
		Collections col;
		Collection<?> cc;
		*/
		/*List<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(459);
		list.add(231);
		list.add(985);
		list.add(329);
		list.add(199);
		list.add(873);
		list.add(1258);
		list.add(1233);
		list.add(1523);
		list.add(1123);
		list.add(2293);
		list.add(1235);
		list.add(1129);
		
//		for(int i)
		
		
		
		Collections.sort(list);
		list.forEach(System.out::println);*/
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("ahca");
		System.out.println(al.size());
		System.out.println(al);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.poll();
		

	}

}
