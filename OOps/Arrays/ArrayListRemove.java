import java.util.*;// import java arrayList from the keyword 
class ArrayListRemove{
    public static void main(String [] args){
        // create an ArrayList and add initial elements 
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(45);
        numbers.add(45);
        //  insert 24 at index 2 
        numbers.add(0,25);
        System.out.println("After insertation on the index 2: " + numbers);
// remove elements at index 3 
numbers.remove(1);
System.out.println("After rfemoving : " +  numbers);

    }
}