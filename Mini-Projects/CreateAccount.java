import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class CreateAccount extends JFrame implements ActionListener {

    JTextField     txtAccountNo, txtBankCode;
    JTextArea      txtAddress;
    JPasswordField txtPin;
    JComboBox<String> cmbAccountType, cmbGender, cmbNationality, cmbSecurityQ;
    JTextField     txtName, txtDOB, txtCaste, txtMobile, txtAnswer;
    JButton        btnCreate, btnClear, btnClose;

    // ── Colour palette ────────────────────────────────────────────
    Color bgMain      = new Color(240, 245, 255);   // soft blue-grey page
    Color bgHeader    = new Color(25,  60, 130);    // deep navy header
    Color bgForm      = Color.WHITE;
    Color bgInput     = new Color(250, 252, 255);   // near-white input
    Color borderClr   = new Color(180, 200, 230);   // light blue border
    Color labelClr    = new Color(30,  60, 120);    // navy label text
    Color titleClr    = Color.WHITE;
    Color btnPanel    = new Color(230, 237, 250);   // button bar tint

    Font labelFont  = new Font("Arial", Font.BOLD,  13);
    Font inputFont  = new Font("Arial", Font.PLAIN, 13);
    Font titleFont  = new Font("Arial", Font.BOLD,  20);
    Font buttonFont = new Font("Arial", Font.BOLD,  13);

    public CreateAccount() {
        setTitle("Create New Bank Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 660);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(bgMain);

        // ── Header ───────────────────────────────────────────────
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(bgHeader);
        headerPanel.setBorder(new EmptyBorder(14, 24, 14, 24));

        JLabel titleLabel = new JLabel("  Create New Bank Account", SwingConstants.LEFT);
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(titleClr);

        JLabel subLabel = new JLabel("Fill in all details below", SwingConstants.RIGHT);
        subLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        subLabel.setForeground(new Color(180, 210, 255));

        headerPanel.add(titleLabel, BorderLayout.WEST);
        headerPanel.add(subLabel,   BorderLayout.EAST);

        // ── Form card ────────────────────────────────────────────
        JPanel formCard = new JPanel(new GridBagLayout());
        formCard.setBackground(bgForm);
        formCard.setBorder(new CompoundBorder(
                new EmptyBorder(16, 20, 10, 20),
                new CompoundBorder(
                        BorderFactory.createLineBorder(borderClr, 1),
                        new EmptyBorder(14, 20, 14, 20)
                )
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 8, 5, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 0: Account No | Name
        addLabel(formCard, gbc, "Account No.", 0, 0);
        txtAccountNo = createField();
        addField(formCard, gbc, txtAccountNo, 1, 0);
        addLabel(formCard, gbc, "Name", 2, 0);
        txtName = createField();
        addField(formCard, gbc, txtName, 3, 0);

        // Row 1: Bank Code | DOB
        addLabel(formCard, gbc, "Bank Code No.", 0, 1);
        txtBankCode = createField();
        addField(formCard, gbc, txtBankCode, 1, 1);
        addLabel(formCard, gbc, "Date of Birth", 2, 1);
        txtDOB = createField();
        addField(formCard, gbc, txtDOB, 3, 1);

        // Row 2: PIN | Nationality
        addLabel(formCard, gbc, "PIN", 0, 2);
        txtPin = new JPasswordField(15);
        styleInput(txtPin);
        addField(formCard, gbc, txtPin, 1, 2);
        addLabel(formCard, gbc, "Nationality", 2, 2);
        cmbNationality = new JComboBox<>(new String[]{
                "-- Select --", "Nepali", "Indian", "Chinese", "American",
                "British", "Australian", "Canadian", "Japanese", "German",
                "French", "Brazilian", "South Korean", "Pakistani",
                "Bangladeshi", "Sri Lankan", "Bhutanese", "Tibetan", "Other"
        });
        styleCombo(cmbNationality);
        addField(formCard, gbc, cmbNationality, 3, 2);

        // Row 3: Account Type | Caste
        addLabel(formCard, gbc, "Account Type", 0, 3);
        cmbAccountType = new JComboBox<>(new String[]{
                "-- Select --", "Savings", "Current", "Fixed Deposit", "Recurring"
        });
        styleCombo(cmbAccountType);
        addField(formCard, gbc, cmbAccountType, 1, 3);
        addLabel(formCard, gbc, "Caste", 2, 3);
        txtCaste = createField();
        addField(formCard, gbc, txtCaste, 3, 3);

        // Row 4: Gender | Mobile
        addLabel(formCard, gbc, "Gender", 0, 4);
        cmbGender = new JComboBox<>(new String[]{
                "-- Select --", "Male", "Female", "Other"
        });
        styleCombo(cmbGender);
        addField(formCard, gbc, cmbGender, 1, 4);
        addLabel(formCard, gbc, "Mobile No.", 2, 4);
        txtMobile = createField();
        addField(formCard, gbc, txtMobile, 3, 4);

        // Row 5: Address (JTextArea) | Answer
        addLabel(formCard, gbc, "Address", 0, 5);
        txtAddress = new JTextArea(3, 15);
        txtAddress.setFont(inputFont);
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
        txtAddress.setBackground(bgInput);
        txtAddress.setForeground(Color.BLACK);
        JScrollPane addressScroll = new JScrollPane(txtAddress);
        addressScroll.setBorder(BorderFactory.createLineBorder(borderClr, 1));
        addressScroll.setPreferredSize(new Dimension(0, 65));
        GridBagConstraints gcAddr = (GridBagConstraints) gbc.clone();
        gcAddr.gridx = 1; gcAddr.gridy = 5; gcAddr.weightx = 0.35;
        gcAddr.fill = GridBagConstraints.BOTH;
        formCard.add(addressScroll, gcAddr);

        addLabel(formCard, gbc, "Answer", 2, 5);
        txtAnswer = createField();
        GridBagConstraints gcAns = (GridBagConstraints) gbc.clone();
        gcAns.gridx = 3; gcAns.gridy = 5; gcAns.weightx = 0.35;
        gcAns.anchor = GridBagConstraints.NORTH;
        formCard.add(txtAnswer, gcAns);

        // Row 6: Security Question (spans 3 cols)
        addLabel(formCard, gbc, "Security Question", 0, 6);
        cmbSecurityQ = new JComboBox<>(new String[]{
                "-- Select a Question --",
                "What is your mother's maiden name?",
                "What was the name of your first pet?",
                "What was the name of your primary school?",
                "What is your favourite childhood friend's name?",
                "What street did you grow up on?",
                "What was your childhood nickname?",
                "What is the name of the city where you were born?",
                "What is your oldest sibling's middle name?",
                "What was the make of your first car?",
                "What is your favourite movie?"
        });
        styleCombo(cmbSecurityQ);
        GridBagConstraints gc6 = (GridBagConstraints) gbc.clone();
        gc6.gridx = 1; gc6.gridy = 6; gc6.gridwidth = 3; gc6.weightx = 0.85;
        formCard.add(cmbSecurityQ, gc6);

        // ── Button Panel ──────────────────────────────────────────
        JPanel btnBar = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 12));
        btnBar.setBackground(btnPanel);
        btnBar.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, borderClr));

        btnCreate = makeButton("  Create  ", new Color(34, 130, 60),  Color.WHITE);
        btnClear  = makeButton("  Clear   ", new Color(30,  100, 190), Color.WHITE);
        btnClose  = makeButton("  Close   ", new Color(190, 35,  40),  Color.WHITE);

        btnCreate.addActionListener(this);
        btnClear.addActionListener(this);
        btnClose.addActionListener(this);

        btnBar.add(btnCreate);
        btnBar.add(btnClear);
        btnBar.add(btnClose);

        // ── Wrap form in scroll + padding ────────────────────────
        JPanel centerWrap = new JPanel(new BorderLayout());
        centerWrap.setBackground(bgMain);
        centerWrap.add(formCard, BorderLayout.CENTER);

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(centerWrap,  BorderLayout.CENTER);
        mainPanel.add(btnBar,      BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setVisible(true);
    }

    // ── Helpers ───────────────────────────────────────────────────

    private void addLabel(JPanel p, GridBagConstraints g, String text, int col, int row) {
        JLabel lbl = new JLabel(text + " :");
        lbl.setFont(labelFont);
        lbl.setForeground(labelClr);
        GridBagConstraints gc = (GridBagConstraints) g.clone();
        gc.gridx = col; gc.gridy = row; gc.weightx = 0.15;
        p.add(lbl, gc);
    }

    private void addField(JPanel p, GridBagConstraints g, JComponent c, int col, int row) {
        GridBagConstraints gc = (GridBagConstraints) g.clone();
        gc.gridx = col; gc.gridy = row; gc.weightx = 0.35;
        p.add(c, gc);
    }

    private JTextField createField() {
        JTextField f = new JTextField(15);
        styleInput(f);
        return f;
    }

    private void styleInput(JComponent f) {
        f.setBackground(bgInput);
        f.setForeground(Color.BLACK);
        f.setFont(inputFont);
        f.setBorder(new CompoundBorder(
                BorderFactory.createLineBorder(borderClr, 1),
                new EmptyBorder(4, 6, 4, 6)
        ));
        f.setPreferredSize(new Dimension(0, 30));
    }

    private void styleCombo(JComboBox<String> cb) {
        cb.setBackground(bgInput);
        cb.setForeground(Color.BLACK);
        cb.setFont(inputFont);
        cb.setPreferredSize(new Dimension(0, 30));
    }

    private JButton makeButton(String text, Color bg, Color fg) {
        JButton b = new JButton(text);
        b.setFont(buttonFont);
        b.setPreferredSize(new Dimension(120, 36));
        b.setBackground(bg);
        b.setForeground(fg);
        b.setOpaque(true);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return b;
    }

    // ── Action Handler ────────────────────────────────────────────

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btnCreate) {
            if (txtAccountNo.getText().trim().isEmpty()           ||
                    txtBankCode.getText().trim().isEmpty()            ||
                    new String(txtPin.getPassword()).trim().isEmpty() ||
                    txtName.getText().trim().isEmpty()                ||
                    cmbAccountType.getSelectedIndex() == 0           ||
                    cmbGender.getSelectedIndex() == 0                ||
                    cmbNationality.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this,
                        "Please fill in all required fields.",
                        "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String masked  = "*".repeat(new String(txtPin.getPassword()).length());
            String address = txtAddress.getText().trim().replace("\n", " ");

            String info =
                    "===== ACCOUNT REGISTRATION SUMMARY =====\n\n" +
                            "  Account No.     : " + txtAccountNo.getText()           + "\n" +
                            "  Name            : " + txtName.getText()                + "\n" +
                            "  Bank Code No.   : " + txtBankCode.getText()            + "\n" +
                            "  Date of Birth   : " + txtDOB.getText()                 + "\n" +
                            "  PIN             : " + masked                           + "\n" +
                            "  Nationality     : " + cmbNationality.getSelectedItem() + "\n" +
                            "  Account Type    : " + cmbAccountType.getSelectedItem() + "\n" +
                            "  Caste           : " + txtCaste.getText()               + "\n" +
                            "  Gender          : " + cmbGender.getSelectedItem()      + "\n" +
                            "  Mobile No.      : " + txtMobile.getText()              + "\n" +
                            "  Address         : " + address                          + "\n" +
                            "  Security Q.     : " + cmbSecurityQ.getSelectedItem()   + "\n" +
                            "  Answer          : " + txtAnswer.getText()              + "\n\n" +
                            "  Account created successfully!";

            showSummaryDialog(masked, address);

        } else if (src == btnClear) {
            txtAccountNo.setText("");
            txtBankCode.setText("");
            txtPin.setText("");
            txtName.setText("");
            txtDOB.setText("");
            txtCaste.setText("");
            txtMobile.setText("");
            txtAddress.setText("");
            txtAnswer.setText("");
            cmbSecurityQ.setSelectedIndex(0);
            cmbNationality.setSelectedIndex(0);
            cmbAccountType.setSelectedIndex(0);
            cmbGender.setSelectedIndex(0);
            txtAccountNo.requestFocus();

        } else if (src == btnClose) {
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to close?", "Confirm",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) System.exit(0);
        }
    }


    // ── Summary Dialog ────────────────────────────────────────────
    private void showSummaryDialog(String masked, String address) {
        JDialog dialog = new JDialog(this, "Account Registration Summary", true);
        dialog.setSize(520, 560);
        dialog.setLocationRelativeTo(this);
        dialog.setResizable(false);
        dialog.setLayout(new BorderLayout());

        // -- Success banner
        JPanel banner = new JPanel(new BorderLayout());
        banner.setBackground(new Color(34, 130, 60));
        banner.setBorder(new EmptyBorder(14, 20, 14, 20));
        JLabel bannerIcon = new JLabel("✔  Account Created Successfully!", SwingConstants.CENTER);
        bannerIcon.setFont(new Font("Arial", Font.BOLD, 16));
        bannerIcon.setForeground(Color.WHITE);
        banner.add(bannerIcon, BorderLayout.CENTER);

        // -- Details panel
        JPanel detailsPanel = new JPanel(new GridBagLayout());
        detailsPanel.setBackground(Color.WHITE);
        detailsPanel.setBorder(new EmptyBorder(18, 24, 18, 24));

        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(5, 8, 5, 8);
        g.fill = GridBagConstraints.HORIZONTAL;

        Font lf = new Font("Arial", Font.BOLD,  12);
        Font vf = new Font("Arial", Font.PLAIN, 12);
        Color lc = new Color(25, 60, 130);
        Color vc = new Color(40, 40, 40);

        String[][] rows = {
                {"Account No.",   txtAccountNo.getText()},
                {"Full Name",     txtName.getText()},
                {"Bank Code No.", txtBankCode.getText()},
                {"Date of Birth", txtDOB.getText()},
                {"PIN",           masked},
                {"Nationality",   cmbNationality.getSelectedItem().toString()},
                {"Account Type",  cmbAccountType.getSelectedItem().toString()},
                {"Caste",         txtCaste.getText()},
                {"Gender",        cmbGender.getSelectedItem().toString()},
                {"Mobile No.",    txtMobile.getText()},
                {"Address",       address},
                {"Security Q.",   cmbSecurityQ.getSelectedItem().toString()},
                {"Answer",        txtAnswer.getText()}
        };

        int row = 0;
        for (String[] pair : rows) {
            // separator line every row
            if (row > 0) {
                JSeparator sep = new JSeparator();
                sep.setForeground(new Color(220, 228, 240));
                GridBagConstraints sg = new GridBagConstraints();
                sg.gridx = 0; sg.gridy = row * 2 - 1;
                sg.gridwidth = 2; sg.fill = GridBagConstraints.HORIZONTAL;
                sg.insets = new Insets(0, 8, 0, 8);
                detailsPanel.add(sep, sg);
            }

            JLabel keyLbl = new JLabel(pair[0] + " :");
            keyLbl.setFont(lf);
            keyLbl.setForeground(lc);
            GridBagConstraints kg = new GridBagConstraints();
            kg.gridx = 0; kg.gridy = row * 2;
            kg.anchor = GridBagConstraints.WEST;
            kg.weightx = 0.3;
            kg.insets = new Insets(4, 8, 4, 8);
            detailsPanel.add(keyLbl, kg);

            JLabel valLbl = new JLabel(pair[1].isEmpty() ? "-" : pair[1]);
            valLbl.setFont(vf);
            valLbl.setForeground(vc);
            GridBagConstraints vg = new GridBagConstraints();
            vg.gridx = 1; vg.gridy = row * 2;
            vg.anchor = GridBagConstraints.WEST;
            vg.weightx = 0.7; vg.fill = GridBagConstraints.HORIZONTAL;
            vg.insets = new Insets(4, 8, 4, 8);
            detailsPanel.add(valLbl, vg);

            row++;
        }

        JScrollPane scroll = new JScrollPane(detailsPanel);
        scroll.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(210, 220, 235)));
        scroll.getVerticalScrollBar().setUnitIncrement(12);

        // -- Close button
        JPanel btnBar = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 12));
        btnBar.setBackground(new Color(240, 245, 255));
        btnBar.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(200, 215, 235)));
        JButton closeBtn = new JButton("   OK   ");
        closeBtn.setFont(new Font("Arial", Font.BOLD, 13));
        closeBtn.setBackground(new Color(25, 60, 130));
        closeBtn.setForeground(Color.WHITE);
        closeBtn.setOpaque(true);
        closeBtn.setBorderPainted(false);
        closeBtn.setFocusPainted(false);
        closeBtn.setPreferredSize(new Dimension(110, 34));
        closeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        closeBtn.addActionListener(ev -> dialog.dispose());
        btnBar.add(closeBtn);

        dialog.add(banner,  BorderLayout.NORTH);
        dialog.add(scroll,  BorderLayout.CENTER);
        dialog.add(btnBar,  BorderLayout.SOUTH);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        SwingUtilities.invokeLater(CreateAccount::new);
    }
}