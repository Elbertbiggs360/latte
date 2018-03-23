/**
 * The Main class
 * This is the entry point for the Latte program
 */

public class Main {

	public static NAME = "Bruce";

	public static void main(String[] args) {
		System.out.println("Hola Mundo!"); // Display the string
		Main app = new Main();
		Bus zuka = app.bus(3, 2, 1, "Zuka");
		System.out.println("This bus is called "+ zuka.getName() + " " + zuka.getCadence());
		System.out.println(String.format("Name: %s", NAME));
		//variable argument list
	}

	public Bus bus(int cadence, int speed, int gear, String name){
		return new Bus(cadence, speed, gear, name);
	}
}