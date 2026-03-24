import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame {
    private JFrame frame;
    private int counter = 0;


    public LoginFrame() {
        frame = new JFrame("User Login");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel messageLabel = new JLabel();
        JLabel attemptsLabel = new JLabel("0 attempts");

        JLabel userLabel = new JLabel("UserName");
        JLabel passwordLabel = new JLabel("Password");

        JTextField userNameTf = new JTextField(15);
        JPasswordField passwordTf = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        JButton clearButton = new JButton("Clear");


        // Layout setup
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(messageLabel, gbc);

        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(userLabel, gbc);

        gbc.gridx = 1;
        panel.add(userNameTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        panel.add(passwordTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(loginButton, gbc);

        gbc.gridx = 1;
        panel.add(clearButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(attemptsLabel, gbc);

        // Actions
        loginButton.addActionListener(e -> {
            String username = userNameTf.getText();
            String password = new String(passwordTf.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                messageLabel.setText("Empty username or password.");
            } else if (username.equals("admin") && password.equals("admin")) {
                messageLabel.setText("Congratulations. Login Successful!");
            } else {
                counter++;
                messageLabel.setText("Username or password is incorrect.");
                attemptsLabel.setText(counter + " attempts");
            }
        });

        clearButton.addActionListener(e -> {
            userNameTf.setText("");
            passwordTf.setText("");
            counter = 0;
            messageLabel.setText("");
            attemptsLabel.setText("0 attempts");
        });
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new LoginFrame();
    }
}
