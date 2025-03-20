package Geometry;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(int xx,int yy) {
		this.x=xx;
		this.y=yy;
	}
	
	public double distance (Point p2) {
		int dx = this.x-p2.x;
		int dy = this.y-p2.y;
		
		double d;
		
		d=Math.sqrt(dx*dx+dy*dy);
		
		return d;
	}
	
	public boolean isOrigin () {
		
		return this.x==0 && this.y==0;
	}
	
	public boolean isEqual(Point p2) {
		
		if(this.x==p2.x && this.y==p2.y) {
			return true;
		}else {
			return false;
		}
	}
	
	public void print () {
		System.out.println("x: "+this.x+","+"y: "+this.y);
		return;
	}
	
	public String toString() {
		
		return "("+this.x+","+this.y+")";
	}

}
