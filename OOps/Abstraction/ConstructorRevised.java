class ConstructorRevised{
    private String name;// instance variable 
    ConstructorRevised(){
        System.out.println("Constructor is called.");
        name = "programiz";
    }
    public static void main(String [] args){
        // constructor is invoked while 
        // creating an object of the constructorRevised  class
        ConstructorRevised obj = new ConstructorRevised();
        System.out.println("The name is" + obj.name);

    }

}