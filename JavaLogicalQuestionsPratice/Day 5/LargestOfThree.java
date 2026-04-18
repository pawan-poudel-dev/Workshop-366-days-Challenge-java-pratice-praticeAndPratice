public class LargestOfThree {
    public static void main(String [] args){
        // find largest of three  numbers
        int a = 24;
        int b = 45;
        int c = 89;
        if( a  >b && a >c){
            System.out.println("Largest is A");
        }
        else if(b >a&& b>c){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest  number is C");
        }

    }
}
