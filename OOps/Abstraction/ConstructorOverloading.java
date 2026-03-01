public class ConstructorOverloading {
    String language;// initialize instance variable 
   
    // constructor with no parameters 
    ConstructorOverloading(){
        this.language = "python";

    }
    // constructor with a single parameter 
    ConstructorOverloading(String language){
        this.language= language;

    }
    public void getName(){
        System.out.println("programming langauage:" + this.language);

    }
    public static void main(String [] args){
ConstructorOverloading obj1 = new ConstructorOverloading();
ConstructorOverloading obj2 = new ConstructorOverloading("java");
obj1.getName();
obj2.getName();


    }

}
