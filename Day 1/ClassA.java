// Example of HIrearchicalInheritance 
public class ClassA {
    public  void displayA(){
        System.out.println("Its the method of DisplayA()");

    }
    
}
class ClassB extends ClassA{
    public void dispB(){
        System.out.println("Display B method calling.");
    }
}
 class ClassC extends ClassA{
    public void dispC(){
        System.out.println("Method C calling ddhjdvcjhbcscbsdc");

    }

}
class  ClassD extends ClassA{
    public void dispD(){
        System.out.println("Method D is calling.");
    }

}
class HierarchicalInheritanceTest{
    public static void main(String [] args){
ClassB b = new ClassB();
b.dispB();
ClassC c = new ClassC();
c.dispC();
ClassD d = new ClassD();
d.dispD();
d.displayA();
    }   
}
