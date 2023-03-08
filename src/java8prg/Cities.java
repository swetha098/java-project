package java8prg;

import java.util.Arrays;
import java.util.List;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a= Arrays.asList("Trivandrum","Hyderabad","Tvm","thiruvalla");
		List<String> arr= a.stream().filter(t->t.toLowerCase().startsWith("t")).toList();
		System.out.println(arr);

	}

}
