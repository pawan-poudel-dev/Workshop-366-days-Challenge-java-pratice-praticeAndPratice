class Laptop{
    String brand;
    int  ram;
    boolean powerOn;
    // explicit default constructor 
    Laptop(){
        brand = "Unknown";
        ram= 8;
        powerOn =false;
        System.out.println("Lapto objects created with defaults!!");
    }
    void display(){
        System.out.println(brand +" "+ "Ram : "+ ram+"GB" + "PowerOn:"+powerOn);
    }
}
class Membe{
    public static void main(String [] args){
        Laptop l1 = new Laptop();
        l1.display();
        Laptop l2 =  new Laptop();
        l2.display();
    }
}