import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyWindow extends JFrame{
    //constructor to set-up the window properties
    public MyWindow() {
        super("Profeaaional widow");// set title
        setSize(500, 400);
        setLocationRelativeTo(null);// center the screen  on the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        JLabel label = new JLabel("Welcome to   java series");
add(label);

    }
        public static void main(String [] args){
        // create  an instance of our window
            MyWindow window = new MyWindow();
            // and make it visible
            window.setVisible(true);
        }
    }


