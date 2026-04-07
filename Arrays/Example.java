import java.util.ArrayList;
public class Example {
    public static void main(String [] args){
        ArrayList<String> aNames =new ArrayList<>();// this is a generic arraylsit which prevents from runtime error andd provides type safety 
        aNames.add("Tiger");
        aNames.add("Lion");
        aNames.add("Cheetah");
        aNames.add("Fox");
        aNames.add("Zebra");
        aNames.add("Hyena");
        aNames.add("Lion");
        aNames.add("Rhino");
        aNames.add("RElephant");
        aNames.add("Monkey");
        aNames.add("Bear");
        aNames.add("Panda ");
        aNames.add("Giraffe");
        aNames.add("Kangaroo");
        aNames.add("Rbbit");
        aNames.add("Jackle");

aNames.add(2,"Dog");
aNames.remove("Panda");
String name =aNames.get(8);
System.out.println(name);
aNames.set(4,"Pawan");
aNames.contains("Jackle");
System.out.println("AnAMES:" + aNames);
    
    }
    
}
