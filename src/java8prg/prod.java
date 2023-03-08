package java8prg;

import java.util.Arrays;
import java.util.List;

public class prod {

	public static void main(String[] args) {
		product p1=new product("Abu",123,1000000);
		product p2=new product("Kodiyan",145,2000);
		product p3=new product("Saji",1467,200000);
		List<product> prodl=Arrays.asList(p1,p2,p3);
		List<product> pro =prodl.stream().filter(t->(t.getPrice()>10000)).toList();
		System.out.println(pro);
		
		}

}

