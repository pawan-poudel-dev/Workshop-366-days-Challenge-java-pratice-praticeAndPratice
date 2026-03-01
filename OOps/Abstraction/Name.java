public class Name {
    public String name(String fName, String lName){
        String fullName = fName + lName;
        return fullName;

    }
    public static void main(String [] args){
        String name1 = "pawan";
        String name2 = "poudel";
        Name obj = new Name();
        String finalName = obj.name(name1,name2);
        System.out.println(finalName);
    }
    
}
