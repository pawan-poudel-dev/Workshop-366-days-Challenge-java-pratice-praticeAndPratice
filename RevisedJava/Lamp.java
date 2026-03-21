public class Lamp {
    // stores the value of the light 
    // true if light is on 
    // falase if light is onn 
    // false if light is off
    boolean isOn;
    // method to turn on thr light 
    void turnOn(){
        isOn = true;
        System.out.println("Light is on:" + isOn);

    }

    ///method to turn off the light 
    void turnOff(){
        isOn = false;
        System.out.println("Light is off:" + isOn);
    }
    
}
class main{
public static void main(String [] args){
    // create objects led and halogen 
    Lamp led = new Lamp();
    Lamp halogen = new Lamp();
    // turn off the light by 
    // calling the method turnon()
    led.turnOn();
    halogen.turnOff();
}
}
