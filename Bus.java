/**
 * Creates an instance of a bus
 */

public class Bus extends Car {
	private static int MAX_GEAR = 5;
	private int capacity = 54;
	private Passenger[] passengers = new Passenger[this.capacity];
	private int number_of_passengers = 0;

	public Bus(){
		super();
	}

	public Bus(int capacity){
		this.capacity = capacity;
	}

	void addPassenger(Passenger newPassenger) {
		passengers[number_of_passengers++] = newPassenger;
	}

	public Passenger[] getPassengers() {
		return this.passengers;
	}

}