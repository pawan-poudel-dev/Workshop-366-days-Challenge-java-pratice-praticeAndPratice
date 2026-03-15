import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JLabel num1Label, num2Label, resultLabel;
    JTextField num1Field, num2Field, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn;

    public SimpleCalculator() {

        setTitle("Simple Calculator");
        setSize(400,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        num1Label = new JLabel("Number 1:");
        num1Label.setBounds(50,40,100,30);
        add(num1Label);

        num1Field = new JTextField();
        num1Field.setBounds(150,40,150,30);
        add(num1Field);

        num2Label = new JLabel("Number 2:");
        num2Label.setBounds(50,80,100,30);
        add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(150,80,150,30);
        add(num2Field);

        addBtn = new JButton("Add");
        addBtn.setBounds(40,140,80,40);
        add(addBtn);

        subBtn = new JButton("Subtract");
        subBtn.setBounds(130,140,100,40);
        add(subBtn);

        mulBtn = new JButton("Multiply");
        mulBtn.setBounds(240,140,100,40);
        add(mulBtn);

        divBtn = new JButton("Divide");
        divBtn.setBounds(150,190,100,40);
        add(divBtn);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50,240,100,30);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(150,240,150,30);
        resultField.setEditable(false);
        add(resultField);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;

        if(e.getSource() == addBtn)
            result = num1 + num2;

        else if(e.getSource() == subBtn)
            result = num1 - num2;

        else if(e.getSource() == mulBtn)
            result = num1 * num2;

        else if(e.getSource() == divBtn)
            result = num1 / num2;

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {

        new SimpleCalculator();

    }
}