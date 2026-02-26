
/*



*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Student {
    private String name;
    private  int studentId;
    private String programme;
    private int year;
    private String college;

//constructor with all five param 
// getter for each field
//getInitials();spilit name , take first char of  each 
public Student(String name, int studentId,String programme, int year,String college){
    this.name = name;
    this.studentId = studentId;
    this.programme = programme;
    this.year = year;
    this.college = college;

}
public String getName(){
    return name;
}
public int getId(){
    return studentId;
}
public String getProgramme(){
    return programme;

}
public int getYear(){
    return year;

}
public String getCollege(){
    return college;
}
public String getInitials(){
    String[] parts = name.split(" ");
    StringBuilder initials = new StringBuilder();
    for (String part : parts) {
        if (!part.isEmpty()) {
            initials.append(part.charAt(0));
        }
    }
    return initials.toString();




}

public String toHTML() {
    LocalDate today = LocalDate.now();
    LocalDate expiry = today.plusYears(4);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMM yyyy");
    return "<html>"
        + "<div style='text-align:center; padding:15px;'>"
        + "<h2>" + college + "</h2>"
        + "<hr>"
        + "<p><b>" + name + "</b> (" + getInitials() + ")"
        + "</p>"
        + "<p>ID: " + studentId + "</p>"
        + "<p>Programme: <i>" + programme + "</i></p>"
        + "<p>Year: " + year + "</p>"
        + "<hr><p><small>Issued: " + today.format(fmt)
        + " | Expires: " + expiry.format(fmt) + "</small></p>"
        + "</div></html>"
        + "<h2 style='color:#1a3c6e;'>" + college + "</h2>"
        + "<p style='color:gray;'><small>Issued: " + today.format(fmt) + "</small></p>";


}
}
