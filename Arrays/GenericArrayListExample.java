import java.util.ArrayList;
// this is a example   of generic arraylist which provides type safety and prevents from runtime errors and only contain specific  data type 
public class GenericArrayListExample {
    public static void main(String [] args){
    ArrayList<String> names = new ArrayList<>();// this is a genericArraylist syntax 
    names.add("Pawan");
    names.add("Aayusha");
    names.add("Pritam ji");
System.out.println("Names: "+ names);


    }
    
}
