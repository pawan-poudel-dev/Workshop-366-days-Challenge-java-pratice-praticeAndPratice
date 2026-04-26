/*
Seconds Breakdown
Given totalSeconds = 9999. Print the breakdown:
Hours: 2
Minutes: 46
Seconds: 39


*/
public class CalculationSeconds {
    public static void main(String[] args) {
        int totalSeconds = 9999;
        int hour = 9999 / 3600;// gets thr hour
        int remaningSeconds = totalSeconds % 3600;// gets the remaning seconds after hour

        int min = remaningSeconds / 60;// gets the minutes from remaning seconds
        int seconds = remaningSeconds % 60;// gets the remaning seconds from total seconds in minutes
        System.out.println("Hour :" + hour);
        System.out.println("Minutes :" + min);
        System.out.println("Seconds: " + seconds);
    }

}
