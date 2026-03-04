public  abstract class Appliance {
    // instance variable decleare as private 
    private String brand;
    private int power;
    // abstract method  dosen't have body 
    public Appliance(String brand, int power){
        this.brand = brand;
        this.power = power;
    }
    abstract void turnOn();
    abstract void turnOff();
    // concrete method do have body
    public void showDetails(){
        System.out.println("Brand is :" + brand + "Power is: " + power);
    }


    }
    class Fan extends Appliance{
        public Fan(String brand, int power){
            super(brand, power);
        }
        @Override
        public void turnOn(){
            System.out.println("Fan is spinning.");
        }
        @Override
        public void turnOff(){
            System.out.println("Fan Stopped");
        }
    }
    class Ac extends Appliance{
         public Ac(String brand, int power){
            super(brand, power);
        }
        @Override
        public void turnOn(){
            System.out.println("Ac is cooling");

        }
        @Override
        public void turnOff(){
            System.out.println("Ac stopped");
        }
    }
class Test1{
    public static void main(String [] args){
        Appliance  f1 = new Fan("CG ", 67);
        Appliance f2 = new Ac("BMW", 1500);
        f1.turnOff();
        f1.turnOn();
        f2.turnOff();
        f2.turnOn();
        
    
    }
}
