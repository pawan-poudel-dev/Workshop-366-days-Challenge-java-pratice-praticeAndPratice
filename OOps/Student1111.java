
public class Student1111 {
    private String name;
    private  int age;
    private  String school;
    private int grade;
    private  String citizenship;
    private String phone;
    
    
    public Student1111(String name, int age, String school, int grade, String citizenship, String phone) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.grade = grade;
        this.citizenship = citizenship;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSchool() {
        return school;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public String getCitizenship() {
        return citizenship;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getNameInitials() {
        StringBuilder initials = new StringBuilder();
        String[] parts = name.split(" ");
        for (String part : parts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0)).append(".");
            }
        }
        return initials.toString();
    }


}