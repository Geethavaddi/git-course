
package com.example.Tasks;

import java.math.*;

public interface Shape {
	public double calculateArea();

	public double calculatePerimeter();

}

class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;

	}

	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}

class Rectangle implements Shape {
	double length;
	double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}

	public double calculatePerimeter() {
		return 2 * (length + width);
	}

}

class Triangle implements Shape {
	double base, height, s1, s2, s3;

	public Triangle(double base, double height, double s1, double s2, double s3) {
		this.base = base;
		this.height = height;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double calculateArea() {
		return 0.5 * base * height;
	}

	public double calculatePerimeter() {
		return s1 + s2 + s3;
	}

}

class MainClass {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
		Rectangle r = new Rectangle(2, 6);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		Triangle t = new Triangle(3, 4, 3, 4, 5);
		System.out.println(t.calculateArea());
		System.out.println(t.calculatePerimeter());

	}
}