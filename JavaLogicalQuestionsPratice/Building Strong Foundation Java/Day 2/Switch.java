/*

 Day Name Using Switch
Declare day = 4. Using a switch statement print the day name.
1 → Monday
2 → Tuesday
...
7 → Sunday
default → Invalid day


 */
public class Switch {
    public static void main(String [] args){
        int day = 4;
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            case 8:
            System.out.println("Sunday");
            break;
            default:
                System.out.println("Invalid!!! error");
        }
    }
}
