package collections;
import java.util.LinkedList;
import java.util.Scanner;
public class linked {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		LinkedList <Integer>link=new LinkedList<>();
		int size =sc.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			int ele=sc.nextInt();
			link.add(ele);
		}
		System.out.println(link);
		System.out.println((link.get(size/2)));
		
		
	}

}
