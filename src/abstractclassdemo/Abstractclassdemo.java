package abstractclassdemo;

public class Abstractclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Basicphone obj = new Basicphone(); //Cannot instantiate the type Abstractclassdemo.Basicphone
		
	//	Basicphone obj = new Javaphone();  //Cannot instantiate the type Abstractclassdemo.Javaphone
		
		Basicphone obj = new Androidphone();
		
		obj.call();
		obj.move();
		obj.cook();
		obj.dance();

	}
	
	
	
	
	
	

}
