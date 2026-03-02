public class MaxAndMinElementsInArrays {
    public static void main(String[] args){
        int arr[]={ 50 ,100,200,20,30,10,5};
        int max= arr[0];
        int min = arr[0];
        // finding the maxmumum value in array  
        //step1. use  for  regular  loop
        for(int i= 0; i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("The max value in array is : " +" " +max);
        // similarly for the minimum value of array
    // first we need to  compare min value with one of the array elements
    // secondly we use conditonal statements to  check the condition and then we will replace the max array element in max or min  value so that  it  works properly 
    // now 

    for(int i = 0; i<arr.length;i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("The minimum value of the array is : " + " "+ min);
    }
    
}// Java is very intresting and fun !!!!!!!!!!!ahahaahahhah aahahhahaah
