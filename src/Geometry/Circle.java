package Geometry;

public class Circle implements Shape, Comparable<Circle>{
	
	protected int radius;
	protected Point center;
	
	public Circle(int r,Point p) {
		this.radius=r;
		this.center=p;
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*this.radius;
	}
	
	public boolean isConcentric (Circle c2) {
		
		return this.center.equals(c2.center);
	}
	
	public boolean isIntersect (Circle c2) {
		
		double d = this.center.distance(c2.center);
		
		return this.radius+c2.radius > d;
	}
	
	public boolean isEqual (Circle c2) {
		
		if(this.radius == c2.radius && this.center.equals(c2.center)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void print() {
		System.out.print("Radius: "+this.radius+","+" Center: ");
		this.center.print();
	}

	@Override
	public int compareTo(Circle cr) {
		// TODO Auto-generated method stub
		
		if(this.area()>cr.area()) {
			return 1;
		}else if(this.area()<cr.area()) {
			return -1;
		}else {
			return 0;
		}
	}

}
