import javax.swing.*;
import java.awt.*;

public class Example2 extends JFrame {
    public Example2(Example3 info, int studentCount){
        super(info.getName());
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.orange);
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel label = new JLabel(info.toHTML(studentCount), SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }

    public static void main(String[] args){
        Example3 college = new Example3(
                "LondonMet College, Dulari",
                "Dulari, Morang",
                "BSc(Hons) Computing, BA(Hons) Business Administration, BSc CSIT",
                "London Met University"
        );

        Example2 window = new Example2(college, 1200); // Correct class name

        SwingUtilities.invokeLater(() -> window.setVisible(true));
    }
}