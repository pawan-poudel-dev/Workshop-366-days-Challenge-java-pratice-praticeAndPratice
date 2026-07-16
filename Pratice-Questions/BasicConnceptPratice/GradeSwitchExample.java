import java.util.*;
public class GradeSwitchExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please !type A character  here: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'A':
                System.out.println("Excellent");
                break;
                case 'B':
                    System.out.println("Very Good");
                    break;
                    case 'C':
                        System.out.println("Good");
                        break;
                        case 'D':
                            System.out.println("Satisfied");
                            break;
                            case 'F':
                                System.out.println("Unfortunately! Failed  the exam.");
                                break;
                                default:
                                    System.out.println("Invalid Input.");
        }
        sc.close();
    }
    
}
