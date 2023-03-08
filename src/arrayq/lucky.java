
package arrayq;
import java.util.Scanner;

public class lucky {
	
	public static void main(String[] args) {
		int a[]= {3,6,9};
		int b[]=new int[4];
		int f=0;
		System.out.println("Enter 4 digits");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
		b[i]=sc.nextInt();}
		for(int j=0;j<b.length;j++) {
			int key=b[j];
			for(int k=0;k<3;k++) {
				if(a[k]==key) {
					f+=1;
				}
			}
			}
		if (f==4) {
			System.out.println("lucky");
		}else System.out.println("not lucky");
		}
		
			
		
	}


