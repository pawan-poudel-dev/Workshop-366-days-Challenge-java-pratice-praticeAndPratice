import javax.swing.*;
     //Example1 IS-A Frame
    public class Example1 extends JFrame{
        // constructor : set  up the window  properties
        public Example1(){
             super("professional window:");// sets  the title
             setSize(500,400);
             setLocationRelativeTo(null);// center on screen
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setResizable(true);
             JLabel label = new JLabel("Welcome to professional window!!",SwingConstants.CENTER);
               add(label);

         }
         public static void main(String [] args){
             Example1 obj = new Example1();
            SwingUtilities.invokeLater(()->obj.setVisible(true));

         }

    }

