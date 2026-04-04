public class LargrstDigit {
    public static void main(String [] args){
      int num = 467589;
      int max = 0;
      // it handles the negative  number 
      num = Math.abs(num);
      while(num!=0){
        int digit = num %10;// extracts the last digit 
        if(max<digit){
            max = digit;// update max if bigger digit found 
        }
        num =  num/10;// removes the last digit 
      }
      System.out.println("Largest digit is :" + max);
    }
    
}
