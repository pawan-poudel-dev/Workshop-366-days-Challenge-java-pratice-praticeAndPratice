public class Laptop {
     String brand;
    int ram;
    double price;
    Laptop( String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void display(){

    
    // now wwe have to create the method to call the constructor values 
System.out.println(brand +"|" + ram +":GB" + price);
}
}
class treasure{
    public static void main(String [] args){
        // each object gets its  own custom values at creation 
        Laptop L1 = new Laptop("Dell",256,75000000.0);
        Laptop L2 = new Laptop("HP",256,75000000.0);
        Laptop L3 = new Laptop("Lenovo",256,75000000.0);
        L1.display();
        L2.display();
        L3.display();




    }
}