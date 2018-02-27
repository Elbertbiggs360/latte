/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output
 */
import ZukaBus;


class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!"); // Display the string
        HelloWorldApp app = new HelloWorldApp();
        app.getZuka("Milkyway");
        System.out.println("This bus is called");
    }

    void getZuka(String busName) {
        ZukaBus zuka = new ZukaBus();
        zuka.giveName(busName);
    }

    String getZukaName(){
        return this.zuka.getName();
    }
}