package cafeteria;

public class employee {
	String name;
	int UID;
	
	
	@Override
	public String toString() {
		return "employee [name=" + name + ", UID=" + UID + "]";
	}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public employee(String name, int uID) {
		super();
		this.name = name;
		UID = uID;
	}
	
}
