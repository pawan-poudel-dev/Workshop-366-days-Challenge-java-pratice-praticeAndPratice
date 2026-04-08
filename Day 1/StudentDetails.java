class StudentDetails{
    public void studentAge(){
        // local variable 
int age = 10;
age = age+ 5;
System.out.println("Student age  is: " + age);
    }
    public static void main(String [] args){
        StudentDetails obj =  new StudentDetails();
        obj.studentAge();
    }
}