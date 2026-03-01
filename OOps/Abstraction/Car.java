public class Car {
    private String  brand;
    private String  model;
    private  double price;

    public void displayInfo(){
        System.out.println("Brand is : " + brand);
        System.out.println("Model is: "  + model);
        System.out.println("Price is: " + price);

    }
    public static void main (String [] args){
        Car obj = new Car();// creating the object od the car class 
        obj.brand = "Bmw";
        obj.model= "20224";
        obj.price = 345667.784d;


        Car obj1 = new Car();
        obj1.brand = "Marcedes";
        obj1.model= "20225";
        obj1.price = 34345667.784d;


    }
    
}
