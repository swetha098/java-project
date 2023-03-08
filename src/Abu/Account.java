package Abu;

public abstract class Account {
	protected int acc_number;
	protected double balance;
	protected Customer cust_obj;
	public Account(int acc_number, double balance, Customer cust_obj) {
		super();
		this.acc_number = acc_number;
		this.balance = balance;
		this.cust_obj = cust_obj;
	}
	public abstract boolean withdraw(double amount) ;
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCust_obj() {
		return cust_obj;
	}
	public void setCust_obj(Customer cust_obj) {
		this.cust_obj = cust_obj;
	}
		
	
}
