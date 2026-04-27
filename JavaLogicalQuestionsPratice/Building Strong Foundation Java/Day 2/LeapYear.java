/*
Leap Year Checker
Declare year = 2024. A leap year is:

Divisible by 4
But NOT divisible by 100
EXCEPT if divisible by 400
 */

public class LeapYear {
    public static void main(String [] args){
        int year = 2024;
        if(year %4== 0&& year %100 !=0 || (year %400 == 0)) {
            System.out.println("Year is leap year");

        }else{
            System.out.println("Not a leap year .");
        }
    }}
