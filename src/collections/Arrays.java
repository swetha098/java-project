package collections;
import java.util.HashSet;
import java.util.Scanner;
public class Arrays {
public static void main(String[] Args) {
	HashSet<Integer> set1=new HashSet<Integer>();
	HashSet<Integer> set2=new HashSet<Integer>();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter elements in first set");
	for(int i=0;i<5;i++) {
		int b=sc.nextInt();
		set1.add(b);
	}
	System.out.println("Enter elements in second array");
	for(int i=0;i<5;i++) {
		int a=sc.nextInt();
		set2.add(a);
	}
	set1.retainAll(set2);
	System.out.println(set1);

	
}
}
