// write a program to add the  given digits 
class SumOfDigits{
    public static void main(String []args){
  int sum = 0;
   int num = 23456;
  while(num!= 0){
    int digit = num%10;//get the last digit 
    sum = sum +digit;// sum of digit 
    num = num/10;

  }
  System.out.println("The sum of the digit  is :"+ sum );


    }
}