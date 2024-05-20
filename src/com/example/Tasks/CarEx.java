package com.example.Tasks;

class EngineEx {
	private int horsepower;
	private String fuelType;

	public EngineEx(int horsepower, String fuelType) {
		this.horsepower = horsepower;
		this.fuelType = fuelType;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void start() {
		System.out.println("Engine started. Horsepower: " + horsepower + ", Fuel type: " + fuelType);
	}

	public void stop() {
		System.out.println("Engine stopped.");
	}
}

public class CarEx {
	private EngineEx engine;

	public CarEx(EngineEx engine) {
		this.engine = engine;
	}

	public void startCar() {
		System.out.println("Starting the car...");
		engine.start();
	}

	public void stopCar() {
		System.out.println("Stopping the car...");
		engine.stop();
	}

	public static void main(String[] args) {

		EngineEx myEngine = new EngineEx(250, "Petrol");

		CarEx myCar = new CarEx(myEngine);

		myCar.startCar();

		myCar.stopCar();
	}
}
