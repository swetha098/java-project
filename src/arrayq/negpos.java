package arrayq;
import java.util.Scanner;

public class negpos {

	public static void main(String[] args) {
		
		int a[]= {4,-4,6,8,-9,0,4,-7,56};
		int count_neg=0;
		int count_pos=0;
		for ( int i=0;i<a.length;i++) {
			if(a[i]<0) {
				count_neg++;
				
			}
			else if(a[i]>0) {
				count_pos++;
			}
			
				
		}
		System.out.println("negative numbers="+count_neg);
		System.out.println("positive numbers="+count_pos);
		
	}

}
