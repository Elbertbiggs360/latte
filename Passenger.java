/**
 * This class creates an instance of a Car
 * It implements the Locomotive Interface
 */

public class Passenger implements PersonInterface {
	private String name = "John Smith";
	private int weight = 45;

	public Passenger(){
		super();
	}

	public Passenger(String name){
		this.name = name;
	}

	public Passenger(String name, int weight){
		this.weight = weight;
		this.name = name;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return this.weight;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void changeWeight(int newWeightValue) {
		this.weight = newWeightValue;
	}
	public String toString() {
		return "Car[Cadence=" + cadence + ",speed=" + speed + ",gear=" + gear + "]";
	}

}