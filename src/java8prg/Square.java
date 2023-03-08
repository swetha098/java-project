package java8prg;
import java.util.*;


public class Square {

	public static void main(String[] args) {
	List<Integer> a=Arrays.asList(1,2,3,4,5,6,7);
	List<Integer> arr=a.stream().map(t->(t*t)).toList();
	System.out.println(arr);

	}

}
