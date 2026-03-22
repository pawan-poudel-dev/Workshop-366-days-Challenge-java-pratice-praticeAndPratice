// class keyword  followed by the class name 
class Student{
    // fields (instance variables )
    // each object created  from a student will have its own copy 
     String name;// default : null
     int rollNo;// default 0
     double marks;// default o.od
     boolean passed;//default false
     // creating the methods or behaviours 
     void display(){
        System.out.println("===================== Student Info====================");
        System.out.println("Name: " + name);
        System.out.println("Roll No: "+ rollNo);
         System.out.println("Marks: " + marks);
          System.out.println("Passed: " + passed);
          

     }
     // another  method 
     void checkResults(){
        if(marks >= 40){
            passed = true;
            System.out.println(name + "passed");
            
        }else{
            System.out.println(name+"failed." );
        }
     }
     public static void main(String [] args){

     }}

     public class Student112{
        public static void main(String [] args){
            Student s1 = new Student();
            // assigining values using the dot operator s\
            s1.name = "Pawan";
            Student s2 = s1;
            s1.rollNo =12;
            s1.marks= 90;
            // calling  methods on object 
            s2.display();
            s1.checkResults();
            
        }
     }



