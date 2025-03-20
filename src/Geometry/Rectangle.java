package Geometry;

public class Rectangle implements Shape, Comparable<Rectangle>{
	
	private int length;
	private int breadth;
	private Point corner;
	
	public Rectangle (int l,int b,Point cor) {
		this.length=l;
		this.breadth=b;
		this.corner=cor;
	}
	
	public double area() {
		return this.length*this.breadth;
	}
	
	public double perimeter() {
		return 2*this.length*this.breadth;
	}
	
	public void print() {
		System.out.print("Rectangle: "+"length:"+this.length+", "+"breadth:"+this.breadth+", Point: ");
		this.corner.print();
	}
	
	public boolean isEqual(Rectangle r2) {
		if(this.length==r2.length && this.breadth==r2.breadth && this.corner.equals(r2.corner)) {
			return true;
		}else {
			return false;
		}
		
	}
	/*
	public int compareTo (Rectangle r2) {
		
		if(this.area()==r2.area()) {
			return 0;
		}else if(this.area()>r2.area()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	*/

	@Override
	public int compareTo(Rectangle r2) {
		
		if(this.area()==r2.area()) {
			return 0;
		}else if(this.area()>r2.area()) {
			return 1;
		}else {
			return -1;
		}
	}

}
