import java.util.Scanner;

interface Vehicle {
	
	int		speed	= 45;  
	String	unit	= "Km";

	public void start(); 
	public void move(); 
	public void stop(); 
	
}

interface VehicleCat extends Vehicle
{

	public void byRoad();
	public void byRails();
}

class Car implements Vehicle {
	public void start() {
		System.out.println("Car Started");
	}

	public void move() {
		System.out.println("Car is Moving");
	}

	public void stop() {
		System.out.println("Car Stopped");
	}
}

 class Train  implements Vehicle{
	 public void start() {
		System.out.println("Train Started");
	}

	public void move() {
		System.out.println("Train is Moving");
	}

	public void stop() {
		System.out.println("Train Stopped");
	}
	
}

class CarCategory implements VehicleCat {
	public void start() {
		System.out.println("Car Started");
	}

	public void move() {
		System.out.println("Car is Moving");
	}

	public void stop() {
		System.out.println("Car Stopped");
	}

	public void byRoad() {
		System.out.println("Car By Road");
	}

	public void byRails() {
		System.out.println("Car By Rails");
	}
}

public class VehicleInterfaceWithCataEgl {

	public static void main(String[] args) {

		Car p = new Car();
		p.move();

		Vehicle b = new Car();
		b.move();

		Vehicle c = new Train();
		c.start();

		Train d = new Train();
		d.start();

		CarCategory e = new CarCategory();
		e.byRoad();

	}

}