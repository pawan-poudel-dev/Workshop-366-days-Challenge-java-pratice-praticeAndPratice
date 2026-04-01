public class Student {
    String name;
    int age;
    Student(String name , int age){
        this.name = name;
        this.age = age;
        }
        void printInfo(){
            System.out.println(name+" "+ age);
        }
    
}
class Test20{
    public static void main(String [] args){
        Student s = new Student("Ram", 18);
        Student s1 = new Student("Shyam",19);
        s.printInfo();
        s1.printInfo();
        
    }
}