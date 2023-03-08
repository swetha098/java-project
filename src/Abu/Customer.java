package Abu;

public class Customer {
	private int customer_id;
	private String customer_name;
	private String email_id;
	
	public Customer(int customer_id, String customer_name, String email_id) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.email_id = email_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
}
