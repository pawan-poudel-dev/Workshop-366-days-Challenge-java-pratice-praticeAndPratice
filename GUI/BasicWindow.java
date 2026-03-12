import javax.swing.JFrame;
public class BasicWindow {
    public static void main(String [] args){
        JFrame frame = new JFrame("MY First App");// title
        frame.setSize(600,400);// size
        frame.setLocationRelativeTo(null);// center on screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close the operation
        frame.setVisible(true);//show window

    }
}
