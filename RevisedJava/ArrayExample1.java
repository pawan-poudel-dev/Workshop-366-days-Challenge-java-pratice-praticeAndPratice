public class ArrayExample1 {
    public static void main(String[] args){
        int numbers [] = {1,2,3,55,678,89,0};
        int sum = 0;
        for(int i : numbers){
            sum+= i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
    
}
