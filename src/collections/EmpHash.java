package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmpHash {

	public static void main(String[] args) {
		
		HashMap<Integer, List<String>> emp=new HashMap<Integer,List<String>>();
		ArrayList<String>arr=new ArrayList<String>();
		arr.add("Abu");
		arr.add("23");
		arr.add("vaazha");
		emp.put(233, arr);
		ArrayList<String>arr2=new ArrayList<String>();
		arr2.add("Kodiyan");
		arr2.add("23");
		arr2.add("vaazha");
		emp.put(243, arr2);
		System.out.println(emp.get(243));
		for(Integer id:emp.keySet()) {
			System.out.println(id+"="+emp.get(id));
		}
		
		
			

	}

}
