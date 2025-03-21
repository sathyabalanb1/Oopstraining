package ecommerce;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("How to Program",400,"deitel",850);
		Book b2 = new Book("Impress a girl",20000,"sathyabalan",1000);
		
		
		int bookPrice;
		bookPrice=b1.getPrice();
		System.out.println(bookPrice);
		
		Shoe s1 = new Shoe("adidas",2500,8,"casual");
		Shoe s2 = new Shoe("reebok",4300,9,"sports");
		
		int shoePrice;
		shoePrice=s2.getPrice();
		System.out.println(shoePrice);
		
		Laptop l1 = new Laptop("dell",25000,"8 gb","256gb ssd");
		Laptop l2 = new Laptop("lenovo",30000,"16 gb","550gb ssd");
		
		int laptopPrice;
		laptopPrice=l1.getPrice();
		System.out.println(laptopPrice);
		
		Item it[]= {b2,l1,s2};
		
		int billAmount;
		billAmount=calculateTotal(it);
		System.out.println(billAmount);
		

	}
	
	public static int calculateTotal(Item items[]) {
		
		int i=0,sum=0;
		
		while(i<items.length) {
			sum=sum+items[i].getPrice();
			i++;
		}
		
		return sum;
		
	}

}
