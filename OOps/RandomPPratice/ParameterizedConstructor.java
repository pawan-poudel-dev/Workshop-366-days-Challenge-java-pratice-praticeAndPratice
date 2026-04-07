public class ParameterizedConstructor {
    String brand;
    int ram;
    double price;
    // parameterized constructor 
    ParameterizedConstructor(String brand, int ram, double price){
        this.brand= brand;
        this.ram = ram;
        this.price = price;

    }
    void display(){
        System.out.println(brand + " | " + ram + "GB | ₹" + price);

    }
    
}
class Test{
    public static void main(String [] args){
        ParameterizedConstructor l1 = new ParameterizedConstructor("Dell",   16, 75000.0);
    ParameterizedConstructor l2 = new ParameterizedConstructor("HP",     8,  50000.0);
        ParameterizedConstructor l3 = new ParameterizedConstructor("Lenovo", 32, 120000.0); 
         l1.display();
        l2.display();
        l3.display();

    }
}
