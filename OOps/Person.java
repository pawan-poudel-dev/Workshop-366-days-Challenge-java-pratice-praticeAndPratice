public class Person {
    /*
    Create a class Person with:

variables: name, age

method: displayInfo()
     */
    String name;
    int age;
    public void displayInfo(){
        System.out.println("The name and age of the person is: "+ name + " "+age);
    }
    public static void main(String [] args){
        Person obj = new Person();
        obj.name = "pawan poudel";
        obj.age = 20;
        obj.displayInfo();
    }
}
