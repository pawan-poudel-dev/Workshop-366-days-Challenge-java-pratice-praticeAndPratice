public class WithBreakStatement {
    public static void main(String [] args){
        int num = 3;
        switch(num){
    case 1: System.out.println("Insert Data");
    
      case 2:
        System.out.println("Edit Data");
    break;
        case 3:
            System.out.println("Delete Data");
        break;
            case 4:
                System.out.println("View Data");
                 break;
                 default:
                    System.out.println("Invalid Choice");
        }
    }
    
}
