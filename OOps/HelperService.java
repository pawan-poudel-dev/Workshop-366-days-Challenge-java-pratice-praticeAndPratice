public class HelperService {
    private String  formatNumber(int value){
        return String.format("%d",value);//%d is a format specifier for integer and converts the integer into string 
    }
    private String formatNumber(double value){
        return String.format("%.3f",value);//%.3f means shows 3 digts after decimal and rounds the number if needed 
    }
    private String formatNumber(String value){
        return String.format("%.2f",Double.parseDouble(value));
    }
    public static void main(String [] args){
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.00000));
        System.out.println(hs.formatNumber("550"));
    }
}
