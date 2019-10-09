package lab_10;

import java.util.Scanner;

public class Rectangle {
	private double height;
	private double width;
	
	Rectangle() {
		height = 1;
		width = 1;
	}
	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public double getArea() {
		double area = this.height * width;
		return area;
	}
	public double getPerimeter() {
		double perimeter = height * 2 + width * 2;
		return perimeter;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height: ");
		double height = sc.nextDouble();
		System.out.print("Enter the width: ");
		double width = sc.nextDouble();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(height, width);
		System.out.println();
		System.out.println("First object:");
		System.out.println("	Height:		" + (int)r1.getHeight() + " unit");
		System.out.println("	Width:		" + (int)r1.getWidth());
		System.out.println("	Height:		" + (int)r1.getArea() + " unit^2");
		System.out.println("	Width:		" + (int)r1.getPerimeter() + " units");
		System.out.println();
		System.out.println("Second object:");
		System.out.println("	Height:		" + (int)r2.getHeight() + " unit");
		System.out.println("	Width:		" + (int)r2.getWidth());
		System.out.println("	Height:		" + (int)r2.getArea() + " units^2");
		System.out.println("	Width:		" + (int)r2.getPerimeter() + " units");
		System.out.println();
		sc.close();
	}
}
