package customer;

public class cus {
	String name;
	int reg_id;
	String phone;
	String mail;
	String location;
	public cus(String name, int reg_id, String phone, String mail, String location) {
		super();
		this.name = name;
		this.reg_id = reg_id;
		this.phone = phone;
		this.mail = mail;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "cus [name=" + name + ", reg_id=" + reg_id + ", phone=" + phone + ", mail=" + mail + ", location="
				+ location + "]";
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
