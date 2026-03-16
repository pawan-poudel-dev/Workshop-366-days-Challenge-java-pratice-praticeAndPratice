public class ExampleOfSwitchStatement {
    public static void main(String [] args){
        int status = 200;
        switch(status){
            case 200:
                System.out.println("200  ok- Request Succeeded");
                break;
                case 201:
                    System.out.println("201 created - Resource Created");break;
                    case 204:
                        System.out.println("204 No content - Sucessful but no data");break;
                        case 404: System.out.println("404 Not found- Resource Missing.");break;
                        default:
                            System.out.println("Unknown status code.");
        }
    }
    
}
