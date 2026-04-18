public class EvenNumbers {
    public static void main(String [] args){
        // print even numbers  of known number
       /* int i;
        // for loop to iterate numbers
        for(i = 1; i<= 100; i++){
            //  use comparision operatior to check weather a number is divided by 2 or not
            if(i%2 ==0){
                System.out.println(i);
            }
        }*/
        // another approach to solve the problem
        for(int i = 1; i<= 100;i+= 2){
            System.out.println(i);
        }
    }
}
