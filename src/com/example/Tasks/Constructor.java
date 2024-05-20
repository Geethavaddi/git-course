package com.example.Tasks;

public class Constructor {
	public static void main(String[] args) {
		Student c = new Student();
		Student s1 = new Student("geetha");
		Student s2 = new Student(101, "geetha");

	}
}

class Student {
	int id;
	String name;
	int age;

	Student() {
		System.out.println("first");
	}

	Student(String name) {

		this.name = name;
	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(name);
		System.out.println(id);
	}
}
