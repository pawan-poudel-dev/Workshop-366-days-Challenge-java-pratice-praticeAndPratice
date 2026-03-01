abstract class MotorBike {

    abstract void brake();

    
}
 class SportsBike extends MotorBike{
    // implementation of the abstract method of the super class 
    public void brake(){
        System.out.println("SportsBile brake...");
        }
 }
class MountainBike extends MotorBike{
    // implementation of the abstract method from the super class
    public void brake(){
        System.out.println("This is a brake of the Mountain bike....");
    }
}
 class Mian{
    public static void  main(String [] abc){
        MountainBike b1 = new MountainBike();
        SportsBike b2 = new SportsBike();
        b1.brake();
        b2.brake();
    }
 }