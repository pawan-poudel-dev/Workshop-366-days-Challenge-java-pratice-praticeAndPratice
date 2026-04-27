
/*
 Largest of Three — No if/else
Declare a = 45, b = 82, c = 67. Find and print the largest number using only Math.max().



*/
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 45;
        int b = 82;
        int c = 67;
        System.out.println(Math.max(Math.max(a,b),c));
    }

}
