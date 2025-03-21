package abstractclassdemo;

public class Abstractclassexampletwo {
	
	public static void main(String[] args) {
		
		Phone iphone = new Iphone();
		show(iphone);
		
		Phone samsung = new Samsung();
		show(samsung);
		
		
	}
	/*
	public static void show (Iphone obj) {
		obj.showConfig();
	}
	
	public static void show (Samsung obj) {
		obj.showConfig();
	}
	*/
	public static void show (Phone obj) {
		obj.showConfig();
	}

}
