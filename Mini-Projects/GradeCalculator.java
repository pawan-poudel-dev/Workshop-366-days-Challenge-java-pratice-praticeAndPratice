import javax.swing.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame {

    JTextField txtName,
               txtProgramming,
               txtLogic,
               txtIS,
               txtFOC,
               txtCHSA;

    JTextArea resultArea;
// constructor
    public GradeCalculator(){
        setTitle("Grade Calculator");// sets the title at title  bar
        setSize(700,500);// sets the size
        setLocationRelativeTo(null);// sets the screen to the center
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Labels
        JLabel lblName = new JLabel("Name:");
        JLabel lblProgramming = new JLabel("Programming:");
        JLabel lblLogic = new JLabel("Logic:");
        JLabel lblIS = new JLabel("IS:");
        JLabel lblFOC = new JLabel("FOC:");
        JLabel lblCHSA = new JLabel("CHSA:");

        // Text Fields
        txtName = new JTextField();
        txtProgramming = new JTextField();
        txtLogic = new JTextField();
        txtIS = new JTextField();
        txtFOC = new JTextField();
        txtCHSA = new JTextField();

        // Button
        JButton btnCalculate = new JButton("Calculate Grade");

        // Result Area
        resultArea = new JTextArea();

        // Positions
        lblName.setBounds(50,40,100,30);
        txtName.setBounds(150,40,150,30);

        lblProgramming.setBounds(50,80,100,30);
        txtProgramming.setBounds(150,80,150,30);

        lblLogic.setBounds(50,120,100,30);
        txtLogic.setBounds(150,120,150,30);

        lblIS.setBounds(50,160,100,30);
        txtIS.setBounds(150,160,150,30);

        lblFOC.setBounds(50,200,100,30);
        txtFOC.setBounds(150,200,150,30);

        lblCHSA.setBounds(50,240,100,30);
        txtCHSA.setBounds(150,240,150,30);

        btnCalculate.setBounds(100,290,180,35);

        resultArea.setBounds(350,80,250,200);

        // Add components
        add(lblName);
        add(txtName);
        add(lblProgramming);
        add(txtProgramming);
        add(lblLogic);
        add(txtLogic);
        add(lblIS);
        add(txtIS);
        add(lblFOC);
        add(txtFOC);
        add(lblCHSA);
        add(txtCHSA);

        add(btnCalculate);
        add(resultArea);

        // Button Action
        btnCalculate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String name = txtName.getText();

                int programming = Integer.parseInt(txtProgramming.getText());
                int logic = Integer.parseInt(txtLogic.getText());
                int is = Integer.parseInt(txtIS.getText());
                int foc = Integer.parseInt(txtFOC.getText());
                int chsa = Integer.parseInt(txtCHSA.getText());

                int total = programming + logic + is + foc + chsa;
                double average = total / 5.0;

                String grade;

                if(average >= 80)
                    grade = "A";
                else if(average >= 70)
                    grade = "B";
                else if(average >= 60)
                    grade = "C";
                else if(average >= 50)
                    grade = "D";
                else
                    grade = "F";

                resultArea.setText(
                        "Name: " + name +
                                "\nAverage: " + average +
                                "\nGrade: " + grade
                );
                txtName.setText(" ");
                txtProgramming.setText(" ");
                txtLogic.setText(" ");
                txtIS.setText(" ");
                txtCHSA.setText("");
                txtFOC.setText(" ");
            }
        });
    }

    public static void main(String[] args){
        GradeCalculator g = new GradeCalculator();
        g.setVisible(true);
    }
}