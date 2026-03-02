//linear search method to finnd the earch elements in array 

public class SearchElementsInArray {
    public static void main(String [] args){
        int[] arr = {34,35,56,67,68,89,10};
        int search_ele =10;// set a constant value so that we can easily compare
        boolean  flag = false;// default value given to the variable
        for(int i = 0; i<arr.length;i++){
            if(search_ele ==arr[i]){
                System.out.println(" elements found at index" + " "+i);
                flag = true;
                break;

            }
        }
        if(flag == false){

        
        System.out.println("Elements Not found.");

        }
        // java is fun and intresting!!!hahahahahahahhahahahhah
    }
    
}
/*
core logic is 
The program checks each array element one by one, compares it with the search value, stops when found, and uses a boolean flag to decide whether the element exists or not.

*/