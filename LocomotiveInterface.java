
/**
 * LocomotiveInterface
 * This interface defines a travel tool
 */
public interface LocomotiveInterface {

    void applyBrakes(int decrement);

    void speedUp(int increment);

    void incrementGear();
    
    void decrementGear();

    void changeCadence(int newValue);

}