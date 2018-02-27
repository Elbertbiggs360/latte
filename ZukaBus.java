/**
 * This class creates an instance of a car called Zuka for
 * short travels in an urban center. 
 * It implements the Locomotive Interface
 */

public class ZukaBus implements LocomotiveInterface {
    int cadence, speed = 0;
    int gear = 1;
    String name = "";

    public void changeCadence(int newCadenceValue) {
        cadence = newCadenceValue;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void decrementGear(){
        try {
            gear--;
        }
        catch (Exception e) {
            return;
        }
    }

    public void incrementGear() {
        try {
            gear++;
        } catch (Exception e) {
            return;
        }
    }

    public void giveName(String busName){
        name = busName;
    }

    public String getName() {
        return name;
    }

    public void speedUp(int increment){
        speed += increment;
    }

}