package Entity;

public class Discount {
	
	int id;
	int discountRate;
	
	public Discount() {
		
	}
	
	public Discount(int id, int discountRate) {
		this.id = id;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}
