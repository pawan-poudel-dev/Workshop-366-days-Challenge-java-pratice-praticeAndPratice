
public class CensusProcessor {
    public static Student1111[] parseCSV(String[] csvData) {
        Student1111[] students = new Student1111[csvData.length - 1]; // Skip header
        for (int i = 1; i < csvData.length; i++) {
            String line = csvData[i];
            String[] fields = line.split(",");
            String name = fields[0].trim();
            int age = Integer.parseInt(fields[1].trim());
            String school = fields[2].trim();
            int grade = Integer.parseInt(fields[3].trim());
            String citizenship = fields[4].trim();
            String phone = fields[5].trim();
            students[i - 1] = new Student1111(name, age, school, grade, citizenship, phone);
        }
        return students;

    }
    public  static  boolean isValidCitizenship(String citizenship){
        if (citizenship.length() != 10) return false;
        if (citizenship.charAt(2) != '-') return false;
        for (int i = 0; i < citizenship.length(); i++) {
            if (i == 2) continue; // skip the hyphen position
            if (!Character.isDigit(citizenship.charAt(i))) return false;
        }
        return true;


    }
    public static boolean isValidPhone(String phone) {
        if (phone.length() != 10) return false;
        if (!phone.startsWith("98")) return false;
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) return false;
        }
        return true;
    }
public static void main(String[] args) {
        String[] csvData = {
            "Name,Age,School,Grade,Citizenship,Phone",
            "Ram  Bahadur  Thapa,18,ItahariInt.College,12,01-0012345,9841234567",
            "Sita Kumari Rai,17,ItahariInt.College,11,01-0054321,9807654321",
            "Hari Prasad Sharma,19,ICKCollege,12,02-0098765,9812345678",
            "Gita Devi Tamang,16,ICPCollege,10,03-0011111,9800000000",
            "Bikash Kumar Limbu,18,ItahariInt.College,12,01-0077777,9841111111",
            "Anita Rai,17,ICKCollege,11,04-002222,981234",
            "Deepak Shah,20,ICPCollege,12,01-00ABCDE,9867890123"
        };
        Student1111[] students = parseCSV(csvData);
        for (Student1111 student : students) {
            boolean validCitizenship = isValidCitizenship(student.getCitizenship());
            boolean validPhone = isValidPhone(student.getPhone());
            if (!validCitizenship || !validPhone) {
                System.out.println("Invalid record for: " + student.getName());
                if (!validCitizenship) {
                    System.out.println("  Invalid Citizenship: " + student.getCitizenship());
                }
                if (!validPhone) {
                    System.out.println("  Invalid Phone: " + student.getPhone());
                }
            }
        }
    }
}
