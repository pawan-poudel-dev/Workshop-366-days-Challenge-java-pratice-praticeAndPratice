public class Main {
    public static void main(String [] args){
        // create first String 
        String first = "Java";
        System.out.println("First String :" +  first);
        // create second 
        String second = "Programming";
        System.out.println("Second String: " + second);
        // joined using concat()
        String joinedString = first.concat(second);
        System.out.println(joinedString);
// comparing two String 
String first1  = "java programminng";
String second1 = "java programming";
String third = "Python Programming";
boolean result = first1.equals(second1);
System.out.println("String first and second are equal:" + result);
boolean result1 = first1.equals(third);
System.out.println("String first and third are equal" + result1);
    }
    
}
