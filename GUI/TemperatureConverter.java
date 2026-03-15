import java.awt.event.*;
import javax.swing.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    JLabel inputLabel, resultLabel;
    JTextField inputField, resultField;
    JButton cToFButton, fToCButton;

    public TemperatureConverter(){

        setTitle("Temperature Converter");
        setSize(400,250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputLabel = new JLabel("Enter Temperature:");
        inputLabel.setBounds(40,40,150,30);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(180,40,150,30);
        add(inputField);

        cToFButton = new JButton("C → F");
        cToFButton.setBounds(60,90,100,40);
        add(cToFButton);

        fToCButton = new JButton("F → C");
        fToCButton.setBounds(200,90,100,40);
        add(fToCButton);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(40,150,100,30);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(180,150,150,30);
        resultField.setEditable(false);
        add(resultField);

        cToFButton.addActionListener(this);
        fToCButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        double temp = Double.parseDouble(inputField.getText());
        double result = 0;

        if(e.getSource() == cToFButton){
            result = (temp * 9/5) + 32;
        }

        else if(e.getSource() == fToCButton){
            result = (temp - 32) * 5/9;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args){

        new TemperatureConverter();

    }
}