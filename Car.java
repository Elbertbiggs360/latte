/**
 * This class creates an instance of a Car
 * It implements the Locomotive Interface
 */
import Constants.TOP_GEAR;

public abstract class Car implements LocomotiveInterface {
    private int cadence, speed = 0;
    private int gear = 0;
    private int MAX_GEAR = TOP_GEAR;
    private int acceleration = 0;

    public Car(){
        super();
    }

    public Car(String name){
        this.name = name;
    }

    public Car(int cadence, int speed, int gear, String name){
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
        this.name = name;
    }

    public void setCadence(int cadence){
        this.cadence = cadence;
    }

    public int getCadence(){
        return this.cadence;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int newGearValue) {
        gear = newGearValue;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(int newAccelerationValue) {
        acceleration = newAccelerationValue;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeedValue) {
        speed = newSpeedValue;
    }

    public int getMaxGear() {
        return this.MAX_GEAR;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void changeCadence(int newCadenceValue) {
        cadence = newCadenceValue;
    }

    public void applyBrakes(int decrement){
        this.speed -= decrement;
    }

    public void decrementGear(){
        if (this.gear > 1) {
            this.gear--;
        } else {
            throw new IllegalArgumentException("Invalid gear!");
        }
    }

    public void incrementGear() {
        if(this.gear<MAX_GEAR){
            this.gear++;
        } else {
            throw new IllegalArgumentException("Invalid gear!");
        }
    }

    public void speedUp(int increment){
        this.speed += increment;
    }

    // Return a String description of this instance
    public String toString() {
        return "Car[Cadence=" + cadence + ",speed=" + speed + ",gear=" + gear + "]";
    }

}