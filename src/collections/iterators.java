package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iterators {

	public static void main(String[] args) {
		System.out.println("enter names");
		ArrayList <String> Kodi =new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String Abu= sc.next();
			Kodi.add(Abu);
		}
		
		Iterator Itr = Kodi.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next());
		}
	}

}
