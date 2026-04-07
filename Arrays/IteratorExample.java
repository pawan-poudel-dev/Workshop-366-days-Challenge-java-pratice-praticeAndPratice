import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample{
    public static void main(String [] args){
        // create an Arraylist 
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        // create a iterator
        Iterator<String> it = fruits.iterator();
    // transverse the arraylIst using Iterator 
    while(it.hasNext()){
        String fruit = it.next();
        System.out.println(fruit);
    }
    
    
    
    
    }
}