public class Example4 {
    
    public static void main (String[] args){
        // doing the part of the String in the java 
        String text= "Hello world";
        // the simple principle of the  Sub string is it takes the first or beginning value as inclusive and last value exclusive 
        String result = text.substring(6,8);
        String result1 = text.substring(0,5);
        System.out.println(result);
        System.out.println(result1);
        String result2 = text.toUpperCase();
        String  result3 = text.toLowerCase();
         String result4 =text.trim();
         System.out.println(result2);
         System.out.println(result3);
        System.out.println(result4);
        System.out.println(result2);
    


    }
}
