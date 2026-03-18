
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountHandler implements ActionListener {
    private BankFrame view;
    private AccountModel model;

    public AccountHandler(BankFrame view, AccountModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(view.amountField.getText().trim());
            boolean success = false;
            String action = e.getActionCommand();

            if ("Deposit".equals(action)) {
                success = model.deposit(amount);
            } else if ("Withdraw".equals(action)) {
                success = model.withdraw(amount);
            }

            if (success) {
                String fullHistory = model.getHistory();
                String currentHistory = view.historyArea.getText();  // Get current UI text
                String newEntry = fullHistory.substring(currentHistory.length());
                view.updateDisplay(model.getBalance(), currentHistory + newEntry);
                view.amountField.setText("");
            } else {
                JOptionPane.showMessageDialog(view, "Invalid transaction!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Enter valid amount!");
        }
    }
}