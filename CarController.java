/**
 * This class creates an instance of a Car
 * It implements the Locomotive Interface
 */

public class CarController {

	public CarController(){
		Car car = createCar(3, 2, 1, "Sample Car");
		System.out.println("This car is called "+ car.getName() + " " + car.getCadence());
	}

	public Car createCar(int cadence, int speed, int gear, String name){
		return new Car(cadence, speed, gear, name);
	}

	void accelerate(){
		int speed = car.getSpeed();
		int cadence = car.getCadence();
		int increment = car.getAcceleration();
		for(int rave = (1* car.getGear()); rave<cadence; rave+=increment) {
			car.speedUp(increment);
			if(rave >= cadence) {
				try{
					car.incrementGear();
				} catch (IllegalArgumentException ex) {
					ex.printStackTrace();
				}
				
				rave = 1*car.getGear();
			}
		}
	}

	void deccelerate(int decrement){
		int total_decrement = 0;
		while(car.getGear()>0 && car.getSpeed()>0) {
			car.applyBrakes(decrement);
			total_decrement+=decrement;
			if(total_decrement>= this.getCadence()){
				try {
					car.decrementGear();
					total_decrement = 0;
				} catch (IllegalArgumentException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

}