public class SwitchStatementCase {
    public static void main(String [] args){
        int status = 200;
        switch(status){
            case 200:System.out.println("200 ok -Requested Succeed");
            case 201:System.out.println("201 Created - Resiurce Created");
            case 202:System.out.println("202 No content - Successful but no data");
            default:System.out.println("Unknown status code.");
        }
    }
    
}
// statement is fall through because we haven't used  break statement after each case 