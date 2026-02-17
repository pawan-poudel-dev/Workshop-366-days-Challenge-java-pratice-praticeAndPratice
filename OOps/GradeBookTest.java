import java.util.Scanner;//program uses Scanner
public class GradeBookTest {
 //main method begins program execution 
 // create a gradeBook object and pass a string to 
 //its displayMessage method
 //main  method  begins program execution
 public static void main(String [] args){
    //create a scanner to obtain input from a command window 
    Scanner input = new Scanner(System.in);
        GradeBook myGradeBook =new GradeBook();
        //create a GradeBook object and assign it to myGradeBook
        //prompt for and input courseName
        System.out.println("please Enter your course Name: ");
        String nameOfCourse = input.nextLine();//reads the line of the text 
        System.out.println();//outputs a blank line 
//Now, call myGradeBook's displayMessage method
//and pass the nameOfCourse as an argument 

        myGradeBook.displayMessage();


    }
}
    

