public class Cat{
    private  String  name;
    private int age;
    public Cat(){
        //initialize name to unknown
        this.name = "Unknown";
        // Initialize age to 0
        this.age = 0;

    }
    //getter for name 
    public String getName(){
        return name;
    }
    //getter  for age 
    public int getAge(){
        return age;

    }
    public static void main(String [] args){
        Cat myCat = new Cat();
        System.out.println("cats name " + myCat.getName());
        System.out.println("cats age :" + myCat.getAge());
    }
    
}