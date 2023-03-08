package Abu;

public class Main {

	public static void main(String[] args) {
		Customer Cust_obj=new Customer(123,"kodiyan","kodiyan@gmail.com");
		SavingsAccount Saving_obj=new SavingsAccount(12345,9,Cust_obj,500);
		Saving_obj.setBalance(4000);
		System.out.println( Saving_obj.withdraw(1000));
		System.out.println(Saving_obj.getBalance());

	}

}
