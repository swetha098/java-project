package cafeteria;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class foodmain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		caferate food1= new caferate("vegmeals",80,1);
		caferate food2= new caferate("fishcurry",120,2);
		caferate food3= new caferate("chapati&vegcurry",40,3);
		caferate food4= new caferate("chapati&chickcurry",120,4);
		caferate food5= new caferate("vegfriedrice",60,5);
		caferate food6= new caferate("chicken friedrice",150,6);
		
		employee e=new employee(null,0);
		System.out.println("Enter your name");
		e.setName(sc.next());
		System.out.println("enter UID");
		e.setUID(sc.nextInt());
		List<employee>lis2=Arrays.asList(e);
		
		for(employee k:lis2) {
	System.out.println("Name : "+ k.getName()+"\nUID : "+k.getUID());
	}int y=0;
	int j=-1;
	int price=0;
	String arr []=new String[10];
		do {++j;
		
			System.out.println("the food items are :\n");
			int i=1;
		List<caferate>lis=Arrays.asList(food1,food2,food3,food4,food5,food6);
			for(caferate h:lis) {
			System.out.println(i+" - "+h.getFooditem()+" :"+h.getRate());
			i++;
		}
			System.out.println("\nselect an item");
			int in=sc.nextInt();
			
	    List<caferate> lis1=lis.stream().filter(t->t.getId()==in).collect(Collectors.toList());
		
		for(caferate k:lis1) {
			System.out.println("The selected items are\n ");
			arr[j]=k.getFooditem();
			price+=k.getRate();
		}for(int k=0;k<=j;k++) {
			System.out.println(arr[k]);}
		System.out.println("Total price : "+price);
		
		System.out.println("\nDo u want to add more items? If yes press 1 else 0 ");
		y=sc.nextInt();
		}
		while(y==1);
				
	}}
		
		
		


