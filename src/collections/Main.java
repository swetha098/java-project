package collections;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		employee emp1=new employee("Kodiyan",3,"dasfgdh");
		employee emp2=new employee("Abu",4,"av");
		employee emp3=new employee("Saji",5,"ds");
		HashMap<Integer,employee>Abu=new HashMap<>();
		Abu.put(233, emp1);
		Abu.put(234, emp2);
		Abu.put(235, emp3);
		
		System.out.println(Abu);
		

	}

}
