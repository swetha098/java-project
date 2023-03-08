package cafeteria;

public class caferate {
	private String fooditem;
	private int rate;
	int id;
	
	public caferate(String fooditem, int rate,int id) {
		super();
		this.fooditem = fooditem;
		this.rate = rate;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "caferate [fooditem=" + fooditem + ", rate=" + rate + "]";
	}
	public String getFooditem() {
		return fooditem;
	}
	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
   
}
	