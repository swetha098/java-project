package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class AbuList {
	public static void main(String[] args) {
		ArrayList <String>name=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 names");
		for(int i=0;i<10;i++) {
			String Abu = sc.next();
			name.add(Abu);
		}
	
	System.out.println(name);}
	
}
