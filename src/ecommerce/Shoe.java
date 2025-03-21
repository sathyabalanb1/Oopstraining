package ecommerce;

public class Shoe implements Item{
	
	private String brand;
	private int price;
	private int size;
	private String type;
	
	public Shoe(String brand,int price,int size,String type) {
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.type=type;
	}
	
	public void setPrice (int p) {
		this.price=p;
	}
	
	public int getPrice () {
		return this.price;
	}

}
