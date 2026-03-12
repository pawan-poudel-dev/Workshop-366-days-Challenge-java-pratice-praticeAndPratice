import javax.swing.JFrame;// import java swing from the keyword
class GuiExample{
    public static void main(String [] args){
        JFrame frame = new JFrame("For pawan poudel");
        // set the size with th reference of jframe
        frame.setSize(400,500);
        //choose the close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        // NOW, we have to implement set visible so that we can see the object in the screen ,
        frame.setVisible(true);
        // learning java is quite fun but sometimes getting the concepts are even more bruttel
    }
}