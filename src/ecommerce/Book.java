package ecommerce;

public class Book implements Item {
	
	private String title;
	private int price;
	private String author;
	private int pages;
	
	public Book (String title, int price, String author, int pages) {
		this.title=title;
		this.price=price;
		this.author=author;
		this.pages=pages;
	}
	
	public void setPrice(int p) {
		this.price=price;
	}
	
	
	public int getPrice() {
		return this.price;
	}
	

}
