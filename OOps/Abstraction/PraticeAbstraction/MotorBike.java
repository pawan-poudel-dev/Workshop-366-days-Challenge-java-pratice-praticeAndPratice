abstract  class MotorBike {
    abstract void brake();
}


class SportsBike extends MotorBike{
    // implementation of the abstract method
    public void brake(){
        System.out.println("SportsBike  Brake");
    } 


}
class MountainBike extends MotorBike{
    // implementation of the abstract method 
    public void brake(){
        System.out.println("Mountain Bike Brake.");
    }
}
class MainTest{
    public static void main(String [] args){
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }

    
}