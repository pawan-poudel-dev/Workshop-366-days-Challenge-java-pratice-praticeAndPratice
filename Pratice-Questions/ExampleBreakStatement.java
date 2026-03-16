public class ExampleBreakStatement {
    public static void main(String[] args) {
        int i = 1; // start from 1

        while(i <= 50) { // loop until 50
            if(i % 7 == 0) {
                System.out.println("First number divisible by 7: " + i);
                break; // exit the loop immediately
            }
            i++; // increment i each time
        }
    }
}