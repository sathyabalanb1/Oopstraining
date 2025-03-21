package basederived;

public class Basederived {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d = new Derived();
		Base b=d;
		
		b.f1();
		b.f2();
//		b.f3();
		
		d.f1();
		d.f2();
		d.f3();

	}

}
