package collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraynumber {

	public static void main(String[] args) {
		System.out.println("Enter numbers");
		ArrayList <Integer> Abu= new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int Kodi = sc.nextInt();
			Abu.add(Kodi);
			
		}
		
		System.out.println(Abu);
		for(int i=0;i<5;i++) {
			for(int j=(i+1);j<5;j++) {
				if((Abu.get(i)+Abu.get(j))==25) {
					System.out.print(" "+Abu.get(i)+" "+Abu.get(j));
				}
			}
		}
	}

}
