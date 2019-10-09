package lab_11;
import java.util.Scanner;
public class Circle {
	private double radius;
	
	Circle() {
		radius = 1;
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	private double getRadius() {
		return radius;
	}
	private void setRadius(double inputRadius) {
		radius = inputRadius;
	}
	private double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	private double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	public String toString() {
		String description = "The circle has radius " + radius;
		return description;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		System.out.println();
		System.out.print("Enter the radius for circle 2: ");
		double radius = sc.nextDouble();
		c2.setRadius(radius);
		System.out.println();
		System.out.println("Print radius:");
		System.out.println("The radius is " + (int)c1.getRadius());
		System.out.println();
		System.out.println("Print area:");
		System.out.printf("The area is %1.2f", c1.getArea());
		System.out.println();
		System.out.println();
		System.out.println("Print perimeter:");
		System.out.printf("The perimeter is %1.2f", c1.getPerimeter());
		System.out.println();
		System.out.println();
		System.out.println("Set radius to " + (int)c2.radius + " and print the object:");
		System.out.printf("The circle has radius of " + (int)c2.getRadius());
		System.out.println();
		System.out.println();
		System.out.println("Print area:");
		System.out.printf("The area is %1.2f", c2.getArea());
		System.out.println();
		System.out.println();
		System.out.println("Print perimeter:");
		System.out.printf("The perimeter is %1.2f", c2.getPerimeter());
		System.out.println();
		System.out.println();
		sc.close();
	}

}
