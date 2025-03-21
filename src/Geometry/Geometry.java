package Geometry;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point al = new Point(5,10);
		Point kar = new Point(7,6);
		
		double d;
		d=al.distance(kar);
		System.out.println(d);
		
		boolean ans;
		ans=al.isOrigin();
		System.out.println(ans);
		
		ans=al.isEqual(kar);
		System.out.println(ans);
		
		al.print();
		
		System.out.println(al);
		
		kar.toString();

		System.out.println("---------------");
		
		Circle c1 = new Circle(4,al);
		Circle c2 = new Circle(2,kar);
		
		Circle c3 = new Circle(2,al);
		Circle c4 = new Circle(3,kar);
		
		c1.print();
		
		ans=c1.equals(c2);
		System.out.println(ans);
		
		ans=c1.isConcentric(c2);
		System.out.println(ans);
		
		ans=c3.isIntersect(c4);
		System.out.println(ans);
		
		ans=c3.isEqual(c4);
		System.out.println(ans);
		
		d=c1.area();
		System.out.println(d);
		
		d=c4.perimeter();
		System.out.println(d);
		
		System.out.println("----------");
		
		Point a = new Point(4,5);
		Point b = new Point(8,8);
		Point c = new Point(2,6);
		Point fourthPoint = new Point(5,4);
		
		Rectangle rec1 = new Rectangle(5,2,a);
		Rectangle rec2 = new Rectangle(6,3,b);
		Rectangle rec3 = new Rectangle(4,2,c);
		Rectangle rec4 = new Rectangle(3,7,fourthPoint);
		
		double rectangleArea;
		rectangleArea=rec1.area();
		System.out.println(rectangleArea);
		
		double rectanglePerimeter;
		rectanglePerimeter=rec2.perimeter();
		System.out.println(rectanglePerimeter);
		
		rec1.print();
		
		int rectangleCompare;
		rectangleCompare = rec1.compareTo(rec2);
		System.out.println(rectangleCompare);
		
		boolean equalRectangle;
		equalRectangle=rec1.isEqual(rec2);
		System.out.println(equalRectangle);
		
		
		System.out.println("---largest Circle---");
		
		Circle circleArray[] = {c1,c2,c3,c4};
		
		Circle largeCircle;
		largeCircle = largestCircle(circleArray);
		largeCircle.print();
		
		System.out.println("---largestRectangle---");
		
		Rectangle rectangleArray[] = {rec1,rec2,rec3,rec4};
		
		Rectangle largeRectangle;
		largeRectangle = largestRectangle(rectangleArray);
		largeRectangle.print();
		
		System.out.println("---largestShape---");
		
		Shape shapeArray[] = {c1,c2,c3,c4,rec1,rec2,rec3,rec4};
		
		Shape largeShape;
		largeShape = largestShape(shapeArray);
		largeShape.print();
		
		System.out.println("------Sorting Objects----");
		
		sortObjects(circleArray);
		
		for(Circle cr: circleArray) {
			System.out.println("Circle Area "+cr.area());
		}
		
		sortObjects(rectangleArray);
		
		for(Rectangle rc: rectangleArray) {
			System.out.println("Rectangle Area "+rc.area());
		}
		
	//	sortObjects(shapeArray);  //compilation error
		
		// The method sortObjects(T[]) in the type Geometry is not applicable for the arguments (Shape[])
		
		Ring r1 = new Ring(a,3,5);
		r1.print();
		
		double ringArea;
		ringArea=r1.area();
		System.out.println(ringArea);
		
		double ringPerimeter;
		ringPerimeter=r1.perimeter();
		System.out.println(ringPerimeter);
		
		Circle rc = r1;
		System.out.println(rc.area());
	}
	
	public static Circle largestCircle (Circle c[]) {
		
		int i=0;
		
		Circle big =c[0];
		
		while(i<c.length) {
			if(c[i].area()>big.area()) {
				big=c[i];
			}
			i++;
		}
		
		return big;
	}
	
	public static Rectangle largestRectangle (Rectangle r[]) {
		
		int i=0;
		Rectangle big = r[0];
		
		while(i<r.length) {
			
			if(r[i].area()>big.area()) {
				big=r[i];
			}
			i++;
		}
		
		return big;
	}
	
	public static Shape largestShape (Shape shape[]) {
		
		int i=0;
		
		Shape big=shape[0];
		
		while(i<shape.length) {
			
			if(shape[i].area()>big.area()) {
				big=shape[i];
			}
			i++;
		}
		
		return big;
	}
	
	public static void sortCircle (Circle c[]) {
		
		int i=0,j;
		Circle small=c[0],temp;
		int smallPos=0;
		
		while(i<c.length) {
			small=c[i];
			smallPos=i;
			j=i+1;
			while(j<c.length) {
				if(c[j].area()<small.area()) {
					small=c[j];
					smallPos=j;
				}
				j++;
			}
			temp=c[i];
			c[i]=c[smallPos];
			c[smallPos]=temp;
			i++;
		}
		
	}
	
	public static void sortCircleUsingcompareTo (Circle c[]) {
		
		int i=0,j,smallPos;
		
		Circle small = c[0],temp;
		
		while(i<c.length) {
			j=i+1;
			small=c[i];
			smallPos=i;
			while(j<c.length) {
				if(small.compareTo(c[j])>0) {
					small=c[j];
					smallPos=j;
				}
				j++;
			}
			temp=c[i];
			c[i]=c[smallPos];
			c[smallPos]=temp;
			i++;
		}
		
		return;	
		
	}
	/*
	public static void sortObjects (Object obj[]) {
		int i=0,j=0,smallPos=0;
		
		while(i<obj.length) {
			Comparable<Object>small = (Comparable<Object>)obj[i];
			smallPos=i;
			j=i+1;
			while(j<obj.length) {
				if(small.compareTo(obj[j])>0) {
					small=(Comparable<Object>)obj[j];
					smallPos=j;
				}
				j++;
			}
			Comparable<Object>temp = (Comparable<Object>)obj[i];
			obj[i]=obj[smallPos];
			obj[smallPos]=temp;
			i++;
		}
		
		return;
	}
	*/
	
	public static <T extends Comparable<T>> void sortObjects(T[] arr) {
        int i, j, smallPos;
        for (i = 0; i < arr.length - 1; i++) {
            smallPos = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallPos]) < 0) {
                    smallPos = j;
                }
            }
            // Swap elements
            T temp = arr[i];
            arr[i] = arr[smallPos];
            arr[smallPos] = temp;
        }
    }
	/*
	public static <T extends Comparable<T>> void sortObjects(T[] arr)

	1️⃣ Understanding Generics (<T>)

	<T>: Declares a generic type parameter T.
	The method can work with any type instead of being restricted to specific ones like Integer, String, or Circle.

	2️⃣ Meaning of <T extends Comparable<T>>

	T extends Comparable<T> means that T must implement Comparable<T>.
	This ensures that objects of type T can be compared using compareTo(), making sorting possible.

	3️⃣ Parameter Explanation (T[] arr)

	The method accepts an array of type T.
	Since T extends Comparable<T>, every element in arr must implement Comparable<T>
	
	*/





}
