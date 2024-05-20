package com.example.Tasks;

public class MethodOverriding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.display();
		Parent p1 = new Child();
		p1.display();
	}
}

class Parent {
	public void display() {
		System.out.println("parent method");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("child method");
	}
}

