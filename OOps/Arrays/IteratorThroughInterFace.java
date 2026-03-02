import java.util.*;
public class IteratorThroughInterFace {
    public static void main(String [] args){
        //iterator interface in java used to transverse collection elements 
ArrayList<String > fruits = new ArrayList<>();//  create an arrayList 
fruits.add("Mango");
fruits.add("PINEAPPLE");
fruits.add("Apple");
fruits.add("Almond");
// create iterator
Iterator<String > it = fruits.iterator();
System.out.println("Using Iterator");
// transverse arrayList Using Iterator
while(it.hasNext()){
    String fruit = it.next();
    System.out.println(fruit);
}
    }

    
}
