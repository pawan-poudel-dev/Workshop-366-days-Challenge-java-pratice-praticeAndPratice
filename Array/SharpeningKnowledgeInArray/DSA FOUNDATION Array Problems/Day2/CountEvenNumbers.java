public class CountEvenNumbers {
    public static void main(String [] args){
        int []numbers = {2,3,4,5,6,7,8,9,10,11,12};
        int count = 0;
        for(int num = numbers ){
            if(num %2 == 0){
                count++;
            }
        }
    System.out.println("Even Numbers = "+ count);
    
    
    
    }
    
}
