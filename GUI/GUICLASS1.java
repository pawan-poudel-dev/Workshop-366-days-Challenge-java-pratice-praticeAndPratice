import javax.swing.*;
import java.awt.*;

public class GUICLASS1 {
    public static void createComponenets() {
        JFrame display=new JFrame("GUI TRY");
        display.setSize(400,500);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setLayout((new FlowLayout(FlowLayout.CENTER)));
        display.setResizable(false);
        display.setLocationRelativeTo(null);

        JLabel lblName=new JLabel("Name :");
        JLabel lblAge=new JLabel("Age :");
        JLabel lblGender=new JLabel("Gender :");
        JTextField txtName=new JTextField(15);
        JTextField txtAge=new JTextField(15);
        /**JComboBox comboGender=new JComboBox();
         comboGender.addItem("Male");
         comboGender.addItem("Female");**/
        JRadioButton rbMale=new JRadioButton("Male");
        JRadioButton rbFemale=new JRadioButton("Female");
        ButtonGroup group=new ButtonGroup();
        group.add(rbMale);
        group.add(rbFemale);


        JButton btnSave =new JButton("Save");

        display.add(lblName);
        display.add(txtName);
        display.add(lblAge);
        display.add(txtAge);
        display.add(lblGender);
        display.add(rbMale);
        display.add(rbFemale);
        display.add(btnSave);
        btnSave.addActionListener(e -> {
            String name=txtName.getText();
            String age=txtAge.getText();
            String gender=(rbMale.isSelected())?"Male":"Female";
            JOptionPane.showMessageDialog(display,"Name:"+name+"\nAge:"+age+"\nGender:"+gender);
        });


        display.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUICLASS1::createComponenets);
    }


}