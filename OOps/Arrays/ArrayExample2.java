// compute suym and aveerage of arrays elements
public class ArrayExample2 {
    public static void main(String []args){
        int sum = 0;
        int[] numbers = {2,-9,8,7,6,5,4,3,2,1,90,45,-100,56};
        for(int a: numbers) {
            sum += a;

        }
        Double average;
             // get the total length of the arrays
            int arrayLength = numbers.length;
            average = ((double)sum/(double)arrayLength);
            System.out.println("sum = "+ sum);
            System.out.println("Average:" + average);

    }
}
