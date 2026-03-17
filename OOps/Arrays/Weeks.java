//Take a number (1–7) and print the day of the week.
public class Weeks {
    public static void main(String[] args) {
        int num = 7;//declare the num as 7 which is suppose to constant
        String day;// iniatilize days as variable 
        switch(num){
            case 1:
                day = "Sunday";
                break;
                case 2:
                day = "Monday" ;
                break;
                case 3:
                    day = "Turesday";
                    break;
                    case 4:
                        day = "Wednesday";
                        break;
                        case 5:
                            day = "Thursday";
                            break;
                            case 6:
                                day = "Friday";
                                break;
                                case 7:
                                    day = "Saturday";
                                    break;

                                    default:
                                       day =  "Invalid day!!!";





        }
        System.out.println("Day: " + day);
        
    }
    
}
