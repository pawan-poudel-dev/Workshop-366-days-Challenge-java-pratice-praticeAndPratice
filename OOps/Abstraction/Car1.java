public class Car1{
    private String model;
    private double price;
    private String color;


    // 3 constructors or this is constructor chaining 
    Car1(String model){
        this.model = model;
        System.out.println(model);
    }
    Car1(String model, double price , String color){
        this.model = model;
        this.price = price;
        this.color = color;
        System.out.println(model + " \n" + price+"  \n" + color);

    }
     Car1(){
        this.model ="Huwai";
        this.color= "pink";
        this.price = 9456.8;
        System.out.println(model +" \n"+ color+" \n"+price );
     }
      public String getModel(){
        return model;
      }
      public double getPrice(){
        return price;
      }
       public String getColor(){
        return color;
       }
     public static void main (String [] args){
         Car1 obj = new Car1("marcedes",234.67,"Red");
         Car1 obj1  = new Car1("BMW");
         Car1 obj2 = new Car1();
         

     }
    }
    
    
