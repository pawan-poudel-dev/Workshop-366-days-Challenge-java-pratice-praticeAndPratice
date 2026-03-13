public class ReverseElement {
    public static void  main(String [] args){
        int number = 12345;
        int rev_num = 0;
        System.out.println("Orginal number:" + number);
        // using the while loop untio num becomes 0
        while(number!= 0){
            // get the last digit from num
            int digit = number %10;
             rev_num = rev_num *10 + digit;
             // remove the last digit from num

             number/=10; 
        }
System.out.println("Reversed number is :" + rev_num);

    }
    
}
