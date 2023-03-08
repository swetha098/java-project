package collections;

import java.util.HashMap;

public class hashmaps {

	public static void main(String[] args) {
		HashMap<String,Integer> abumap = new HashMap<>();
		abumap.put("Abu", 40);
		abumap.put("Kodiyan", 0);
		abumap.put("Saji", 20);
		int abuage= abumap.get("Abu");
		System.out.println(abuage);
		abumap.remove("Kodiyan");
		boolean cont=abumap.containsKey("Kodiyan");
		System.out.println(cont);
		for(String name:abumap.keySet()) {
			System.out.println(name+"="+abumap.get(name));
		}
				

	}

}
