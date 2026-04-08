class AccessModifiers{
    boolean isOn;
    // ,method to turn on the light 
    void turnOn(){
        isOn = true;
        System.out.println("Light on?" + isOn);
    }
    // method to turn off the light
    void turnOff(){
        isOn= false;
        System.out.println("Light on?"+ isOn);
    }

}
class Member{
    public static void main(String [] args){
        // create objects led and halogen 
        AccessModifiers led = new AccessModifiers();
        AccessModifiers halogen = new AccessModifiers();
        // turn on the light 
        // calling method turn on()
        led.turnOn();
        halogen.turnOff();
        led.turnOff();
    }
}