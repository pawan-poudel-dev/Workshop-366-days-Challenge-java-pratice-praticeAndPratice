

/*   

Check if marks ≥ 50, and inside that, check if attendance ≥ 75%.



*/
public class AttendenceChecker {
    public static void main(String[] args){
       int marks = 70;
       int attandence = 65;
if(marks >= 50){
    if(attandence >= 75){   
        System.out.println(" your marks is " +  marks+ " and  your attendence is greater than or equal to 75.");


    }else{
          System.out.println("your attendence is less than 75.");

    }
}else{
    System.out.println("Sorry ,you are failed.");
}
    }

    
}
