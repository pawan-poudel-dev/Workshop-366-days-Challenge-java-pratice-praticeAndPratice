public class Bobby {
    public String  displayInfo( String hobby1, String hobby2, String hobby3){
        return " \n"+ hobby1+"\n "+
        hobby2 +" \n "+
        hobby3;
    }
    public static void main (String args[]){
        String a = "Singing";
        String  b = "Dancing";
        String c = "Sleeping";
        Bobby obj = new Bobby();
        String allHobbies= obj.displayInfo(a,b,c);
        System.out.println("Your hobbies are :" + allHobbies);
    }
    
}
