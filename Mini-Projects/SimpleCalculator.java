import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField display;
    JButton[] numButtons = new JButton[10];
    JButton addBtn, subBtn, mulBtn, divBtn, eqBtn, clrBtn;

    double firstNumber = 0;
    String operator = "";
    boolean startNewNumber = true;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setBounds(30, 30, 220, 40);
        display.setEditable(false);
        add(display);

        int x = 30, y = 80;
        for (int i = 1; i <= 9; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].setBounds(x, y, 50, 40);
            numButtons[i].addActionListener(this);
            add(numButtons[i]);
            x += 60;
            if (i % 3 == 0) { x = 30; y += 50; }
        }

        numButtons[0] = new JButton("0");
        numButtons[0].setBounds(30, y, 50, 40);
        numButtons[0].addActionListener(this);
        add(numButtons[0]);

        addBtn = new JButton("+"); addBtn.setBounds(90,  y,      50, 40);
        subBtn = new JButton("-"); subBtn.setBounds(150, y,      50, 40);
        mulBtn = new JButton("*"); mulBtn.setBounds(210, 80,     50, 40);
        divBtn = new JButton("/"); divBtn.setBounds(210, 130,    50, 40);
        eqBtn  = new JButton("="); eqBtn .setBounds(210, 180,    50, 40);
        clrBtn = new JButton("C"); clrBtn.setBounds(150, y + 50, 50, 40);

        for (JButton btn : new JButton[]{addBtn, subBtn, mulBtn, divBtn, eqBtn, clrBtn}) {
            btn.addActionListener(this);
            add(btn);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Number buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                if (startNewNumber) {
                    // Keep "5 + " prefix, just append the new digit
                    display.setText(display.getText() + i);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + i);
                }
                return;
            }
        }

        // Operator buttons
        if (e.getSource() == addBtn || e.getSource() == subBtn ||
                e.getSource() == mulBtn || e.getSource() == divBtn) {
            try {
                firstNumber = Double.parseDouble(display.getText());
                operator = ((JButton) e.getSource()).getText();
                display.setText(display.getText() + " " + operator + " "); // show "5 + "
                startNewNumber = true;
            } catch (NumberFormatException ex) {
                display.setText("Invalid Input");
            }
            return;
        }

        // Equals button
        if (e.getSource() == eqBtn) {
            try {
                // Extract second number from end of expression string
                String text = display.getText().trim();
                String[] parts = text.split(" ");
                double secondNumber = Double.parseDouble(parts[parts.length - 1]);

                double result = 0;
                switch (operator) {
                    case "+": result = firstNumber + secondNumber; break;
                    case "-": result = firstNumber - secondNumber; break;
                    case "*": result = firstNumber * secondNumber; break;
                    case "/":
                        if (secondNumber == 0) {
                            display.setText("Cannot divide by 0");
                            return;
                        }
                        result = firstNumber / secondNumber;
                        break;
                    default:
                        display.setText("No operator");
                        return;
                }

                // Show clean integer if result is whole number
                if (result == (long) result)
                    display.setText(String.valueOf((long) result));
                else
                    display.setText(String.valueOf(result));

                startNewNumber = true;

            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
            return;
        }

        // Clear button
        if (e.getSource() == clrBtn) {
            display.setText("");
            firstNumber = 0;
            operator = " ";
            startNewNumber = true;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}