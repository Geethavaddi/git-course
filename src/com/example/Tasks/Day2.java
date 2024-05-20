package com.example.Tasks;

public class Day2 {
//	   Vehicle v=new Vehicle("toyota","hfy23",2024);
//	}
// own code
//	   c.start();
//	   c.stop();
//	   c.drive();
//	   System.out.println(c.make);
//	   System.out.println(c.model);
//	   System.out.println(c.year);
//	   v.start();
//	   v.stop();
////	   v.drive();
//	   System.out.println(v.make);
//	   System.out.println(v.model);
//	   System.out.println(v.year);
//	}	
//
//	}
//	class Vehicle{
//		 String make="toyota";
//		 String model="djh";
//		int year=2929;
//		public  void start() {
//			System.out.println("start method");
//		}
//        public  void stop() {
//			System.out.println("stop parent method");
//		}
//		
//		
//	}
//class Car extends Vehicle{
//	int numDoors;
//	public  void drive() {
//		System.out.println("drive");
//		
//	}
//    public void stop() {
//    	System.out.println("stop child method");
//		
//	}
//	
//}
//reference code
	public static void main(String[] args) {
		Car c = new Car("toyota", "hfy23", 2024, 4);
		c.start();
		c.stop();
		c.drive();
		System.out.println(c.getMake());
		System.out.println(c.getModel());
		System.out.println(c.getYear());
		System.out.println(c.getNumDoors());
	}
}

class Vehicle {
	private String make;
	private String model;
	private int year;

	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void start() {
		System.out.println("start vehicle");
	}

	public void stop() {
		System.out.println("stop vehicle");
	}

}

class Car extends Vehicle {
	private int numDoors;

	public int getNumDoors() {
		return numDoors;
	}

	public Car(String make, String model, int year, int numDoors) {
		super(make, model, year);
		this.numDoors = numDoors;
	}

	public void drive() {
		System.out.println("drive car");

	}

	public void stop() {
		System.out.println("stop car");

	}

}
