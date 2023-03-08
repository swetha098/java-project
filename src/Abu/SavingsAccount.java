package Abu;

public class SavingsAccount extends Account {
	private double min_balance;
	
	public SavingsAccount(int acc_number, double balance, Customer cust_obj, double min_balance) {
		super(acc_number, balance, cust_obj);
		this.min_balance = min_balance;
	}
	@Override
	public boolean withdraw(double amount) {
		if ((balance-amount)>min_balance) {
			balance=balance-amount;
			return true;
		}
		else
		return false;
	}
	public double getMin_balance() {
		return min_balance;
	}
	public void setMin_balance(double min_balance) {
		this.min_balance = min_balance;
	}

	
}
