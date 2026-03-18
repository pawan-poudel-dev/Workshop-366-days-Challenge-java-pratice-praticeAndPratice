import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankFrame extends JFrame {
    JTextField amountField;
    private JLabel balanceLabel;
    JTextArea historyArea;
    private JButton depositBtn, withdrawBtn;
    private AccountModel model;

    public BankFrame() {
        model = new AccountModel();
        setTitle("Bank Account Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(400, 300);

        JPanel inputPanel = new JPanel(new FlowLayout());
        amountField = new JTextField(10);
        amountField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        depositBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(depositBtn);
        inputPanel.add(withdrawBtn);


        balanceLabel = new JLabel("Balance: Rs " + model.getBalance());
        historyArea = new JTextArea(model.getHistory(), 8, 30);
        historyArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        add(scrollPane, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.NORTH);
        add(balanceLabel, BorderLayout.CENTER);

        // Attach handler
        AccountHandler handler = new AccountHandler(this, model);
        depositBtn.addActionListener(handler);
        withdrawBtn.addActionListener(handler);

        setVisible(true);
    }

    public void updateDisplay(double newBalance, String newHistory) {
        balanceLabel.setText("Balance: Rs " + newBalance);
        String transaction = newHistory.substring(historyArea.getText().length());  // Only new part
        if (!transaction.isEmpty()) {
            historyArea.append(transaction);
            historyArea.setCaretPosition(historyArea.getDocument().getLength());  // Auto-scroll
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BankFrame::new);
    }
}