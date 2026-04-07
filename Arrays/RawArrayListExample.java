import java.util.ArrayList;
public class RawArrayListExample {
    public static void main(String [] args){
        // example of the arraylist which can store any different types of objects 
        ArrayList list = new ArrayList();// this is a raw arraylist 
        list.add("Java");
        list.add(100);
        list.add(223.5);
        System.out.println(list);
    }
}
