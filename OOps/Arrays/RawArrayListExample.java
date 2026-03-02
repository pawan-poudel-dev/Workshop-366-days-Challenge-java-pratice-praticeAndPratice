// can store  any type of objects 
// type safety  is not guranteed 
import java.util.ArrayList;
public class RawArrayListExample {
    public static void main (String [] args){
        ArrayList list = new ArrayList();// Raw arrayList 
    list.add("Java");
    list.add(100);
    list.add(3.13);
    System.out.println(list);
    }
    
}
