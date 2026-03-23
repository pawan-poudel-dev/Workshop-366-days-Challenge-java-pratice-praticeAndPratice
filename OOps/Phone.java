// constructor chaining 
 public class Phone{
    String  brand;
    int ram;
    int storage;
    double price;
    
Phone(String brand, int ram, int storage, double price){
    this.brand = brand;
    this.ram = ram;
    this.storage = storage;
    this.price = price;
    System.out.println("Full constructor called here.");
    // 3 args constructor
}
    Phone(String brand, int ram, int storage){
this(brand,ram,storage,15000.0);// this must be in first line 
System.out.println("3 args constructor");

}   
// 1 args constructor 
Phone(String brand){
    this(brand,4,64);// it chains to string , int int 
}
void display(){
    System.out.println(brand + ram +  storage + price);
}

    }
     class PhoneTest{
        public static void main(String [] args){
            System.out.println("------Creating P1");
            Phone p1 = new Phone("Samsumg");
            p1.display();

        }
     }
