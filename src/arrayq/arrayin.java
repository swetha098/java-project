package arrayq;
import java.util.Scanner;
public class arrayin {
	public static void main(String[] args) {
		int a[]=new int[20];
		System.out.println("Enter the length of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("ivalid");
		}
		else {
			int i=0;
			System.out.println("Enter the elements");
			Scanner e=new Scanner(System.in);
		for(i=0;i<n;i++) {
			
			a[i]=e.nextInt();
			
					}
		for(int j=0;j<n-1;j++) {
			a[j+1]+=a[j];
		}
		for(int j=0;j<n;j++) {
		
		System.out.println(a[j]);
		}
		}
	}


	

}
