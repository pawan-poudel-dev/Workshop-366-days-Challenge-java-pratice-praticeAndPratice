
 
public class Eample2E n h ancedForLoop {    
    public  static void mai n(Str ing[] args) {
        String[] name = {"Pawan", "Anjali", "Animesh", "Sandesh", "Aakash"};

     

        // It automatically accesses each element one by one.
        // It is simpler than a normal for loop because you do not need to use an index.
        // Syntax: for (dataType variable : arrayName)

        for (String names : name) {
            System.out.println(names);
        }
    }
}

//### Short exam definition

//> **Enhanced for loop (for-each loop)** is a loop used to traverse the elements of an array or collection one by one without using an index. It makes the code simpler and easier to read.

//This definition is suitable for exams and viva questions.
