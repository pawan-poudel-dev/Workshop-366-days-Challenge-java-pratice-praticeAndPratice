public class Lamp11 {
    boolean  isOn;
    public void turnOn(){
        isOn = true;
        System.out.println(isOn);

    }
    public void turnOff(){
        isOn = false;
        System.out.println(isOn);
    }
    public static void main(String [] args){
        Lamp11 obj1 = new Lamp11();
        Lamp11 obj2 = new Lamp11();
        obj1.turnOn();
        obj2.turnOff();

        
    }
    
}
