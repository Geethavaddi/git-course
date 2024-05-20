package com.example.Tasks;

public class Encapsulation {

	public static void main(String[] args) {
		Employee e = new Employee(101, "geetha", 20000);
		System.out.println(e.getId(102));
		System.out.println(e.getName("raji"));
		System.out.println(e.getsal(20000));
	}
}

class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getsal(int salary) {
		return salary;
	}

	public void setSal(int salary) {
		this.salary = salary;
	}
}
