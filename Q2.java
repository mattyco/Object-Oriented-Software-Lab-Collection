import java.util.Scanner;

public abstract class Shape{

	public abstract double area(){
		//System.out.println("inside masterclass");
	}
	
}

public class Circle extends Shape{

	public double area(double radius){
		System.out.println("Area of circle:"+ ((22.0/7.0)*(radius*radius)));
	}
}

public class Rect extends Shape{

	public double area(double length, double breadth){
		System.out.println("Area of rectangle:" + (length*breadth));
	}
}

class Q2{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle:");
		double length = in.nextDouble();
		double breadth = in.nextDouble();
		Shape myRect = new Rect();
		myRect.area(length, breadth);

		System.out.println("Enter radius of circle:");
		double radius = in.nextDouble();
		Shape myCircle = new Circle();
		myCircle.area(radius);
		//System.out.println("Area of rectangle:" + rectArea);
		//System.out.println("Area of circle:" + circleArea);
	}
}