public class Student1 {
    private  int rollNo;
    Student1(int rollNo){
        this.rollNo = rollNo;
    }
    public int getRolllNo(){
        return rollNo;
    }
    
}
class Student1Test{
    public static void main(String [] args){
    Student1 obj = new Student1(123);
    System.out.println("Student roll no is: "+ obj.getRolllNo());

    

    }
}
