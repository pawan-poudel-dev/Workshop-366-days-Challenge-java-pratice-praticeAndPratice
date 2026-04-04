public class Reverse1 {
    public static void main(String [] args){
        int i;
        int rev = 0;
        int num = 7568394;
while(num!=0){
    int digit = num%10;// provides the remainder or may be we can say it getting last digit 
    rev = rev*10+digit;// Here, the reverse is build 
    num = num/10;// It removes the last digit so that reverse is possible 

}
System.out.println("The reverse of the nnumber is:" + rev);
    }
    
}
