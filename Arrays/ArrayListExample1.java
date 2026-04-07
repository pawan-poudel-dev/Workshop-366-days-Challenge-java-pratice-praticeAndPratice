import java.util.ArrayList;
public class ArrayListExample1 {
    public static void main(String [] args){
        ArrayList <String> modules = new ArrayList<>();
        modules.add("Pawan");
        modules.add("Harry");
        modules.add("MiCHEL");
        modules.add("jackson");
        modules.add("Peter");
        modules.add("Julia");
        modules.add("Forn");
        modules.add("x");
        modules.add("Tooo");
        modules.remove(2);
        modules.remove("x");
        System.out.println(modules);// remove elements 
        String SecondFruit = modules.get(1);// Access Elements 
        System.out.println(SecondFruit);
        modules.add(5,"CHSA");
        System.out.println(modules);





    }
    
}
