class Phone {
    String brand;
    int    ram;
    int    storage;
    double price;

    // Full constructor — all the real work happens here
    Phone(String brand, int ram, int storage, double price) {
        this.brand   = brand;
        this.ram     = ram;
        this.storage = storage;
        this.price   = price;
        System.out.println("Full constructor called");
    }

    // 3-arg constructor → chains to 4-arg with default price
    Phone(String brand, int ram, int storage) {
        this(brand, ram, storage, 15000.0); // MUST be first line
        
System.out.println("3-arg constructor called");
    }

    // 1-arg constructor → chains to 3-arg
    Phone(String brand) {
        this(brand, 4, 64); // chains to Phone(String,int,int)
        
System.out.println("1-arg constructor called");
    }

    void display() {
        System.out.println(brand+"|"+ram+"GB|"+storage+"GB|₹"+price);
    }
}
class Mainer {
    public static void main(String[] args) {
        System.out.println("--- Creating p1 ---");
        Phone p1 = new Phone("Samsung");
        p1.display();
    }
}