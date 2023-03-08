package customer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class cusmain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
		int idin= sc.nextInt();
		cus cus1=new cus("Abu",2458,"284789594","Abu.com","Anthrolil");
		cus cus2=new cus("Saji",2425,"2847899584","Abu.com","Anthrolil");
		cus cus3=new cus("Kodian",2455,"28478569584","Abu.com","Anthrolil");
		cus cus4=new cus("Abu2",2466,"284787884","Abu.com","Anthrolil");
		
		List<cus> lis= Arrays.asList(cus1,cus2,cus3,cus4);
		
		List<cus> lis1=lis.stream().filter(t:t.get()regid.equals())
		
		
		
		
		

	}

}
