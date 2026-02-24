public class Dog {
   private String name;
   private  String color; 
    public Dog(String name, String color){
        this.name = name;
        this.color = color;

    }
    //getter for the name 
    public String getName(String name){
        return name;
    }
     public String getColor(String color){
        return color;

     }
     public static void main(String  [] args){
        Dog d1 = new Dog("Huskey" ,"blue");
    System.out.println(d1.name);
    System.out.println(d1.color);
     }
    
}
