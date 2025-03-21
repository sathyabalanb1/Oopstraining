package ecommerce;

public class Laptop implements Item{
	
	private String brand;
	private int price;
	private String ram;
	private String memory;
	
	public Laptop(String brand,int price, String ram, String memory) {
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.memory=memory;
	}
	
	public void setPrice (int p) {
		this.price=p;
	}
	
	public int getPrice () {
		return this.price;
	}

}
