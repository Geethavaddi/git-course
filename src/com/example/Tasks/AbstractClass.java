package com.example.Tasks;

public abstract class AbstractClass {
	public abstract void draw();

	public abstract double calculteArea();
}

class Circle1 extends AbstractClass {
	private double radius;

	Circle1(double radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("circle");
	}

	public double calculteArea() {
		return Math.PI * radius * radius;

	}

}

class Rectangle1 extends AbstractClass {
	private double length;
	private double width;

	public Rectangle1(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void draw() {
		System.out.println("rectangle");
	}

	public double calculteArea() {
		return length * width;
	}
}

class Triangle1 extends AbstractClass {
	private double base, height;

	public Triangle1(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public void draw() {
		System.out.println("Triangle");
	}

	public double calculteArea() {
		return 0.5 * base * height;
	}
}

class AbstractMain {
	public static void main(String[] args) {
		Circle1 c = new Circle1(5);
		System.out.println(c.calculteArea());
		c.draw();
		Rectangle1 r = new Rectangle1(2, 6);
		r.draw();
		System.out.println(r.calculteArea());

		Triangle1 t = new Triangle1(3, 4);
		System.out.println(t.calculteArea());
		t.draw();

	}
}
