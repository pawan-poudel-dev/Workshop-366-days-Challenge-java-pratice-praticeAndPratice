//class declearstion for  one method 
  public class GradeBook {
    private String courseName;
    //method to set the courseName
    public void setCourseName(String name){
      courseName = name;//sttores the course name 

    }
    public String getCourseName(){
      return courseName;

    } 
    //calls getCoursename tp get the name of the course the gradeBook represents 
       //display a welcome message to the gradeBook user
    public void displayMessage(){
        System.out.printf("Welcome to the grade book for \n%s!\n",getCourseName());



    }//end method displaymessage 
    
}//end class GradeBook
