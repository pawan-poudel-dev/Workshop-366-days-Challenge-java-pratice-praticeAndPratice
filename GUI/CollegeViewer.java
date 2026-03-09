import javax.swing.*;
import java.awt.*;

public class CollegeViewer extends JFrame {
    public CollegeViewer(CollegeInfo info)
    {
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Collage Viewer");
        getContentPane().setBackground(Color.cyan);
        setResizable(false);
        JLabel label=new JLabel(info.toHTML(),SwingConstants.CENTER);
        add(label);
        setLocationRelativeTo(null);
        setVisible(true);



    }

}