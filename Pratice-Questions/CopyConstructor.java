public class CopyConstructor {
    String name;
    int marks;
    // parametrized constructor 
    CopyConstructor(String name , int marks){
    this.name = name;
    this.marks = marks;

    }
    // copy constructor - takes same class object as parameter 
    CopyConstructor(CopyConstructor obj){
        this.name = name;
        this.marks = marks;
        System.out.println("Copy constructor Called!");
    }
    void display(){
        System.out.println(name + " >"+ marks);
    }
}
class Team{
    public static void main(String [] args){
        CopyConstructor obj = new CopyConstructor("Pawan" ,90);
        // create  a copy - passesorginal object as argument 
        CopyConstructor copy = new CopyConstructor(obj);
        obj.display();//Aarav - 88
        copy.display();//Aarav - 88
    // modify orginal is not affected 
    copy.name = "Priya";
    copy.marks = 97;
    obj.display();
    copy.display();
    }
}
