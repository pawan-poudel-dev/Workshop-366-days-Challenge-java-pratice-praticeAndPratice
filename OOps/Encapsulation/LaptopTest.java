public class LaptopTest {
    public static void main(String [] args){
     Laptop obj = new Laptop();
     obj.setBrand("Mac");// Invalid price → will print warning
     obj.setPrice(20000);
     Laptop obj1 = new Laptop();
     obj1.setBrand("Lenovo");
     obj1.setPrice(90000.00);
     System.out.println("The brand of the Laptop is:"+ obj.getBrand());
     System.out.println("The price of he laptop is :" + obj.getPrice());
     System.out.println("The brand of the Laptop is:"+ obj1.getBrand());
     System.out.println("The price of the laptop is :" + obj1.getPrice());
     

    }
    
}
