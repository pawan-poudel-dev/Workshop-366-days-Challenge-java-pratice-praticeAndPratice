import java.util.ArrayList;
public class ForEachExample {
    public static void main(String [] args){
// create arraylist of strings 
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Banana");
fruits.add("Apple");
fruits.add("Grapes");
fruits.add("PineApple");
fruits.add("Mango");
//for(String fruit: fruits){
   // System.out.println(fruit);
//}
fruits.remove("Apple");
System.out.println(fruits);
    }
    
}
