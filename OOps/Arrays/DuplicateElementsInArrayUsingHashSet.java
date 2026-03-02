//calculating the duplicacy of the elements using the  HashSet Values(means this method only allows unique value to be printed ootherwise it shows the false or duplicacy.)
import java.util.HashSet;
public class DuplicateElementsInArrayUsingHashSet {
    public static void main(String[] args){
        String[] arr1= {"java", "python","c++","python","c"};
        HashSet <String> langs =new HashSet();// making the object of the hashset value so that it calls the unique  values from the elements.
        boolean flag = false; //  flag mean we still didnt  found a duplicate value to print
        for(String l :arr1){
            if(langs.add(l) == false){
                System.out.println("Found duplicate elements:" + l);
                flag = true;// if there is any duplicate  value fooun then  the flag will be true

            }
        }
        if(flag = false){
            System.out.println("Not found Duplicate elements");
        }

    }

    
}
