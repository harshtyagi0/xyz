package SharedResources;

import java.util.*;

public class Result implements Runnable {
	HashMap<String, Integer> stud = new HashMap();
	public static ArrayList<String> printCenturian(HashMap<String, Integer> h){
		ArrayList<String> al = new ArrayList();
		for(Map.Entry<String, Integer> e : h.entrySet()) {
			if(e.getValue()==100) {
				al.add(e.getKey());
			}
		}
		return al;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
