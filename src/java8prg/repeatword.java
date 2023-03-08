package java8prg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function; 
import java.util.stream.Collectors;


public class repeatword {

	public static void main(String[] args) {
		List<String> lis=Arrays.asList("tvm","tvm","hyder","kodiyan","pta","anthrolil");
		Map<String,Long> dupe=lis.stream()
				.map(city->city.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(dupe);
		
		
	}
	

}
