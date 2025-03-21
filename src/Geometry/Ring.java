package Geometry;

public class Ring extends Circle{
	
	private int radius2;
	
	public Ring (Point c, int r1, int r2) {
		super(r1,c);
		this.radius2=r2;
	}
	
	@Override
	public double area() {
		
		return Math.abs(super.area()-Math.PI*this.radius2*this.radius2);
	}
	
	/*
	public double area() {
		
		return Math.abs(Math.PI*this.radius*this.radius - Math.PI*this.radius2*this.radius2);
		
	}
	
	*/
	@Override
	public void print() {
		super.print();
		System.out.println("Circle2: "+this.radius2);
	}

}
