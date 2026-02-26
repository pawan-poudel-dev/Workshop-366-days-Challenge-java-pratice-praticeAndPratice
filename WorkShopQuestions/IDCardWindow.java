


import javax.swing.*;
public class IDCardWindow extends JFrame {
    private Student student;

    public IDCardWindow(Student student) {
        super(student.getName() + " - ID Card");
        this.student = student;
        setSize(450, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JLabel card = new JLabel(student.toHTML(),
       SwingConstants.CENTER);
      add(card);


     setVisible(true);
    }

    public static void main(String[] args) {
        Student student = new Student("Ram Bahadur Thapa", 12345, "BSc (Hons) Computing", 1, "LondonMet College, Dulari");
        Student student2 = new Student("Sita Kumari Rai", 67890, "BA (Hons) Business Administration", 2, "LondonMet School of Business, Dulari");
        new IDCardWindow(student);
        IDCardWindow w2 = new IDCardWindow(student2);
        w2.setLocation(50, 50);
        new IDCardWindow(student);

    }


    
}
