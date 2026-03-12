import javax.swing.JFrame;
import javax.swing.JLabel;
public class ExtendFrame extends JFrame{
     public ExtendFrame(){
         super("My First App");
         setSize(600,400);// set the height of width of  600 and height of 400
         setLocationRelativeTo(null);
         // center the location on the screen
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel label = new JLabel("Learning the first phase of gui is quite intresting");
         label.setLocation(600,600);
         add(label);

     }
     public static void main(String [] args){
         ExtendFrame  frame1 = new ExtendFrame();
         frame1.setVisible(true);
     }
}


