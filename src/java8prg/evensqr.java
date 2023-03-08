package java8prg;
import java.util.*;

import java.util.List;

public class evensqr {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3,4,5,6);
		List<Integer> arr= a.stream().filter(t->t%2==0).map(t->(t*t)).toList();
		System.out.println(arr);
	}

}
