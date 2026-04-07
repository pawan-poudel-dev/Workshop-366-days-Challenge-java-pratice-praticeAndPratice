import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String [] args){
        // example to find the arrayList  using contains()
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("python");
        languages.add("Javascript");
        languages.add("Go");
        System.out.println("Arraylist :" + languages); 
       // checks if  "CHSS" is present in languages or not 
       System.out.println(languages.contains("css"));
       int size = languages.size();
       System.out.println(size);

    }
    
}
