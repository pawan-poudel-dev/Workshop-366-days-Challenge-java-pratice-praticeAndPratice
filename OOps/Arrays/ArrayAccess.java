

public class ArrayAccess {//accessing the java elements 
    public static void main (String [] args ){
        //create an array 
        int [] ages = {23,70,30,49,80};
        for(int ageNumber : ages){
            System.out.println(ageNumber);
        } 

        //access each array element 
        System.out.println("First element is : " + ages[0]);
        System.out.println(".Second element: " +  ages[1]);
        System.out.println(".(third element is )" +  ages[4]);
    }
    
}
