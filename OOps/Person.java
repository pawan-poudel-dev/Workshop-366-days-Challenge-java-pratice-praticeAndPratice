public class Person {
    String name;
    int marks;
    // parameterized constructors 
    Person(String name, int marks){
        this.name= name;
        this.marks = marks;
    }
    // copy constructor  takes same class object as parameter 
    Person (Person other){
        this.name = other.name;// copy field by field
        this.marks = other.marks;
        System.out.println("Copy constructor called");

    }
    void display(){
        System.out.println("Name:"+ name +" " +"marks:" + marks);

        

    }
    
}
class StudentTest{
    public static void main(String [] args){
        Person orginal = new Person("Pawan poudel" , 99);
// creates a copy - passes the orginal object as argument 
Person copy = new Person(orginal);
orginal.display();//pawan- 99 
copy.display();// pawan -99
// modify copy - orginal is not  affected 
copy.name = "Babishma";
copy.marks= 96;
orginal.display();
copy.display();

    }
    
}
