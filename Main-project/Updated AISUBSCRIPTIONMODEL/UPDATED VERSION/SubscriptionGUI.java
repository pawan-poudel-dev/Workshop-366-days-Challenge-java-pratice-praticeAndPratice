import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Main GUI class for the AI Subscription Management System.
 *
 * <p>
 * Run from the terminal:
 * </p>
 * 
 * <pre>
 *   javac SubscriptionGUI.java
 *   java  SubscriptionGUI
 * </pre>
 *
 * <p>
 * Natural dark slate / teal theme with warm amber output text.
 * All plans are stored in an {@code ArrayList<AIModel>}.
 * </p>
 *
 * @author Pawan Poudel
 * @version 3.0
 * @see AIModel
 * @see PersonalPlan
 * @see ProPlan
 */
public class SubscriptionGUI extends JFrame implements ActionListener {

    // -------------------------------------------------------------------
    // Palette — natural dark slate / teal theme
    // -------------------------------------------------------------------

    /** Main window background — deep slate grey-blue. */
    private static final Color C0 = new Color(28, 35, 42);
    /** Card / panel background — warm dark slate. */
    private static final Color C1 = new Color(36, 44, 52);
    /** Input field background — slightly lighter slate. */
    private static final Color C2 = new Color(44, 54, 63);
    /** Border lines — muted steel blue. */
    private static final Color CB = new Color(70, 130, 150);
    /** Accent — soft teal used on titles, borders, badges. */
    private static final Color CA = new Color(56, 200, 180);
    /** Button normal background — dark teal-slate. */
    private static final Color CD = new Color(38, 90, 100);
    /** Button hover background — brighter teal. */
    private static final Color CH = new Color(50, 130, 140);
    /** Primary text — warm off-white. */
    private static final Color TW = new Color(220, 230, 228);
    /** Muted text — cool grey for labels and placeholders. */
    private static final Color TM = new Color(110, 140, 145);
    /** Output area text colour — warm amber for easy reading. */
    private static final Color OT = new Color(255, 210, 120);

    // -------------------------------------------------------------------
    // Fonts
    // -------------------------------------------------------------------

    private static final Font F_TITLE = new Font("Segoe UI", Font.BOLD, 20);
    private static final Font F_SUB = new Font("Segoe UI", Font.PLAIN, 11);
    private static final Font F_SEC = new Font("Segoe UI", Font.BOLD, 11);
    private static final Font F_LBL = new Font("Segoe UI", Font.BOLD, 11);
    private static final Font F_IN = new Font("Segoe UI", Font.PLAIN, 12);
    private static final Font F_BTN = new Font("Segoe UI", Font.BOLD, 11);
    private static final Font F_MONO = new Font("Consolas", Font.PLAIN, 12);

    // -------------------------------------------------------------------
    // Data store
    // -------------------------------------------------------------------

    /**
     * Holds all subscription plans polymorphically as {@link AIModel}
     * references.
     */
    private ArrayList<AIModel> plans = new ArrayList<>();

    // -------------------------------------------------------------------
    // Text fields (10 per coursework spec)
    // -------------------------------------------------------------------

    private JTextField txtModelName; // Field 1 model name
    private JTextField txtPrice; // Field 2 price per 1L tokens
    private JTextField txtParams; // Field 3 parameter count
    private JTextField txtContext; // Field 4 context window
    private JTextField txtPromptQuota; // Field 5 prompt quota / extra prompts
    private JTextField txtTeamSlots; // Field 6 team slots
    private JTextField txtPromptText; // Field 7 prompt text
    private JTextField txtResponseLen; // Field 8 response length
    private JTextField txtMemberName; // Field 9 team member name
    private JTextField txtIndex; // Field 10 array list index

    // -------------------------------------------------------------------
    // Buttons
    // -------------------------------------------------------------------

    private JButton btnAddPersonal;
    private JButton btnAddPro;
    private JButton btnDisplayAll;
    private JButton btnClear;
    private JButton btnGivePrompt;
    private JButton btnBuyPrompts;
    private JButton btnAddMember;
    private JButton btnRemoveMember;
    private JButton btnCheckType;
    private JButton btnExport;
    private JButton btnLoad;

    // -------------------------------------------------------------------
    // Output + badge
    // -------------------------------------------------------------------

    private JTextArea displayArea;
    private JLabel planBadge;

    // -------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------

    /**
     * Builds and shows the main window.
     */
    public SubscriptionGUI() {
        setTitle("AI Subscription Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(C0);
        setLayout(new BorderLayout(0, 0));

        add(buildHeader(), BorderLayout.NORTH);
        add(buildBody(), BorderLayout.CENTER);

        setSize(1120, 790);
        setMinimumSize(new Dimension(980, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // -------------------------------------------------------------------
    // Layout builders
    // -------------------------------------------------------------------

    /**
     * Builds the header bar with title and plan-count badge.
     * A silver 1 px bottom line separates it from the body.
     *
     * @return configured header panel
     */
    private JPanel buildHeader() {
        JPanel h = new JPanel(new BorderLayout());
        h.setBackground(new Color(32, 40, 48));
        h.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, CB),
                BorderFactory.createEmptyBorder(13, 20, 13, 20)));

        JLabel title = new JLabel("\u25A0  AI Subscription Manager");
        title.setFont(F_TITLE);
        title.setForeground(TW);

        planBadge = new JLabel("Plans: 0");
        planBadge.setFont(new Font("Segoe UI", Font.BOLD, 12));
        planBadge.setForeground(CA);
        planBadge.setHorizontalAlignment(SwingConstants.RIGHT);

        h.add(title, BorderLayout.WEST);
        h.add(planBadge, BorderLayout.EAST);
        return h;
    }

    /**
     * Builds the body: left scrollable input column + right output panel.
     * Uniform 6 px outer margin on ALL four sides keeps both panels
     * equally inset from the window edge.
     *
     * @return body panel
     */
    private JPanel buildBody() {
        JPanel body = new JPanel(new BorderLayout(8, 0));
        body.setBackground(C0);
        body.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));

        JScrollPane lScroll = new JScrollPane(buildLeftColumn());
        lScroll.setBorder(BorderFactory.createLineBorder(CB, 1));
        lScroll.setBackground(C1);
        lScroll.getViewport().setBackground(C1);
        lScroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        lScroll.setPreferredSize(new Dimension(510, 0));

        body.add(lScroll, BorderLayout.WEST);
        body.add(buildOutputPanel(), BorderLayout.CENTER);
        return body;
    }

    /**
     * Stacks the four input sections into the left column.
     *
     * @return populated left panel
     */
    private JPanel buildLeftColumn() {
        JPanel col = new JPanel();
        col.setBackground(C1);
        col.setLayout(new BoxLayout(col, BoxLayout.Y_AXIS));
        col.setBorder(BorderFactory.createEmptyBorder(6, 8, 8, 8));

        col.add(buildAddPlansSection());
        col.add(vgap(8));
        col.add(buildPersonalSection());
        col.add(vgap(8));
        col.add(buildProSection());
        col.add(vgap(8));
        col.add(buildUtilitySection());
        col.add(Box.createVerticalGlue());
        return col;
    }

    // ---- Section 1 ----

    /**
     * Section 1: shared model fields, quota/slots row, Add Plan buttons.
     *
     * @return section card
     */
    private JPanel buildAddPlansSection() {
        JPanel card = makeCard("  Add Plan \u2014 Model Details");

        JPanel grid = new JPanel(new GridLayout(4, 2, 6, 5));
        grid.setOpaque(false);
        grid.add(lbl("Model Name"));
        txtModelName = field("e.g. GPT-4o");
        grid.add(txtModelName);
        grid.add(lbl("Price (NPR / 1 Lakh tokens)"));
        txtPrice = field("e.g. 250.00");
        grid.add(txtPrice);
        grid.add(lbl("Parameters (Billions)"));
        txtParams = field("e.g. 70");
        grid.add(txtParams);
        grid.add(lbl("Context Window (K tokens)"));
        txtContext = field("e.g. 128");
        grid.add(txtContext);

        JPanel qRow = new JPanel(new GridLayout(1, 4, 6, 0));
        qRow.setOpaque(false);
        qRow.add(lbl("Prompt Quota"));
        txtPromptQuota = field("e.g. 500");
        qRow.add(txtPromptQuota);
        qRow.add(lbl("Team Slots"));
        txtTeamSlots = field("e.g. 10");
        qRow.add(txtTeamSlots);

        JPanel btns = new JPanel(new GridLayout(1, 2, 6, 0));
        btns.setOpaque(false);
        btnAddPersonal = btn("\u2795  Add Personal Plan");
        btnAddPro = btn("\u2795  Add Pro Plan");
        btns.add(btnAddPersonal);
        btns.add(btnAddPro);

        card.add(grid);
        card.add(vgap(5));
        card.add(qRow);
        card.add(vgap(8));
        card.add(btns);
        return card;
    }

    // ---- Section 2 ----

    /**
     * Section 2: prompt text, response length, Personal Plan buttons.
     *
     * @return section card
     */
    private JPanel buildPersonalSection() {
        JPanel card = makeCard("  Personal Plan Operations");

        JPanel btns = new JPanel(new GridLayout(1, 2, 6, 0));
        btns.setOpaque(false);
        btnGivePrompt = btn("\u25B6  Give Prompt");
        btnBuyPrompts = btn("\u2295  Buy Prompts");
        btns.add(btnGivePrompt);
        btns.add(btnBuyPrompts);

        card.add(row2("Prompt Text", txtPromptText = field("Enter your prompt here...")));
        card.add(vgap(5));
        card.add(row2("Response Length (tokens)", txtResponseLen = field("e.g. 1024")));
        card.add(vgap(8));
        card.add(btns);
        return card;
    }

    // ---- Section 3 ----

    /**
     * Section 3: team member name, Pro Plan buttons.
     *
     * @return section card
     */
    private JPanel buildProSection() {
        JPanel card = makeCard("  Pro Plan \u2014 Team Operations");

        JPanel btns = new JPanel(new GridLayout(1, 2, 6, 0));
        btns.setOpaque(false);
        btnAddMember = btn("\u2795  Add Member");
        btnRemoveMember = btn("\u2796  Remove Member");
        btns.add(btnAddMember);
        btns.add(btnRemoveMember);

        card.add(row2("Team Member Name", txtMemberName = field("e.g. Sita Rai")));
        card.add(vgap(8));
        card.add(btns);
        return card;
    }

    // ---- Section 4 ----

    /**
     * Section 4: index field and utility buttons.
     *
     * @return section card
     */
    private JPanel buildUtilitySection() {
        JPanel card = makeCard("  Index & Utilities");

        JPanel idxRow = new JPanel(new GridLayout(1, 2, 6, 0));
        idxRow.setOpaque(false);
        idxRow.add(lbl("Plan Index Number"));
        txtIndex = field("0, 1, 2 ...");
        txtIndex.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 2, 0, 0, CA),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(CB, 1),
                        BorderFactory.createEmptyBorder(5, 10, 5, 8))));
        idxRow.add(txtIndex);

        JPanel r1 = new JPanel(new GridLayout(1, 3, 6, 0));
        r1.setOpaque(false);
        btnDisplayAll = btn("\u2630  Display All");
        btnCheckType = btn("?  Check Type");
        btnClear = btn("\u2715  Clear Fields");
        r1.add(btnDisplayAll);
        r1.add(btnCheckType);
        r1.add(btnClear);

        JPanel r2 = new JPanel(new GridLayout(1, 2, 6, 0));
        r2.setOpaque(false);
        btnExport = btn("\u2191  Export to File");
        btnLoad = btn("\u2193  Load from File");
        r2.add(btnExport);
        r2.add(btnLoad);

        card.add(idxRow);
        card.add(vgap(6));
        card.add(r1);
        card.add(vgap(5));
        card.add(r2);
        return card;
    }

    // ---- Output panel ----

    /**
     * Builds the right-side output terminal.
     *
     * <p>
     * Placed in {@code BorderLayout.CENTER} of the body so it fills
     * all remaining width and height. A 1 px {@code CB} border on all
     * four sides matches the left scroll pane exactly.
     * </p>
     *
     * @return output panel
     */
    private JPanel buildOutputPanel() {
        JPanel panel = new JPanel(new BorderLayout(0, 0));
        panel.setBackground(C0);
        /* Bright cyan 3 px border on all four sides */
        panel.setBorder(BorderFactory.createLineBorder(CA, 3));

        JPanel bar = new JPanel(new BorderLayout());
        bar.setBackground(new Color(32, 40, 48));
        bar.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, CB),
                BorderFactory.createEmptyBorder(7, 14, 7, 14)));

        JLabel barTitle = new JLabel("  OUTPUT / RESULTS");
        barTitle.setFont(new Font("Consolas", Font.BOLD, 11));
        barTitle.setForeground(CA);

        JLabel barHint = new JLabel("read-only  ");
        barHint.setFont(F_SUB);
        barHint.setForeground(TM);
        bar.add(barTitle, BorderLayout.WEST);
        bar.add(barHint, BorderLayout.EAST);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(F_MONO);
        displayArea.setBackground(C0);
        displayArea.setForeground(OT);
        displayArea.setCaretColor(CA);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        displayArea.setBorder(BorderFactory.createEmptyBorder(12, 16, 12, 16));
        displayArea.setText(
                "  System ready.\n" +
                        "  \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500" +
                        "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n" +
                        "  Fill the fields on the left\n" +
                        "  and click a button to get started.\n");

        JScrollPane scroll = new JScrollPane(displayArea);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.setBackground(C0);
        scroll.getViewport().setBackground(C0);

        panel.add(bar, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);
        return panel;
    }

    // -------------------------------------------------------------------
    // Factory helpers
    // -------------------------------------------------------------------

    /**
     * Creates a section card with a 2 px top cyan accent stripe,
     * 1 px outline, titled heading, and inner padding.
     *
     * @param title section heading text
     * @return configured section card
     */
    private JPanel makeCard(String title) {
        JPanel card = new JPanel();
        card.setBackground(C1);
        card.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(2, 0, 0, 0, CA),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(CB, 1),
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder(
                                        BorderFactory.createEmptyBorder(),
                                        title,
                                        TitledBorder.LEFT,
                                        TitledBorder.TOP,
                                        F_SEC, CA),
                                BorderFactory.createEmptyBorder(0, 10, 10, 10)))));
        return card;
    }

    /**
     * Convenience: two-column label + field row.
     *
     * @param labelText label string
     * @param textField the input field
     * @return row panel
     */
    private JPanel row2(String labelText, JTextField textField) {
        JPanel p = new JPanel(new GridLayout(1, 2, 6, 0));
        p.setOpaque(false);
        p.add(lbl(labelText));
        p.add(textField);
        return p;
    }

    /**
     * Creates a dark input field with placeholder behaviour.
     *
     * @param placeholder hint text shown when field is empty
     * @return configured {@link JTextField}
     */
    private JTextField field(String placeholder) {
        JTextField f = new JTextField();
        f.setFont(F_IN);
        f.setBackground(C2);
        f.setForeground(TW);
        f.setCaretColor(CA);
        f.setSelectionColor(new Color(55, 80, 90));
        f.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(CB, 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 8)));
        f.setText(placeholder);
        f.setForeground(TM);
        f.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (f.getForeground().equals(TM)) {
                    f.setText("");
                    f.setForeground(TW);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (f.getText().trim().isEmpty()) {
                    f.setText(placeholder);
                    f.setForeground(TM);
                }
            }
        });
        return f;
    }

    /**
     * Creates a muted bold label.
     *
     * @param text label text
     * @return configured {@link JLabel}
     */
    private JLabel lbl(String text) {
        JLabel l = new JLabel(text);
        l.setFont(F_LBL);
        l.setForeground(TM);
        return l;
    }

    /**
     * Creates a natural action button — all buttons share the same
     * indigo/violet palette; hover brightens, press darkens.
     * Registers {@code this} as the {@link ActionListener}.
     *
     * @param text button label text
     * @return configured {@link JButton}
     */
    private JButton btn(String text) {
        JButton b = new JButton(text);
        b.setFont(F_BTN);
        b.setForeground(TW);
        b.setBackground(CD);
        b.setOpaque(true);
        b.setFocusPainted(false);
        b.setBorderPainted(true);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(CB, 1),
                BorderFactory.createEmptyBorder(7, 12, 7, 12)));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b.setBackground(CH);
                b.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b.setBackground(CD);
                b.setForeground(TW);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                b.setBackground(C2);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                b.setBackground(CH);
            }
        });
        b.addActionListener(this);
        return b;
    }

    /** Fixed-height vertical spacer. */
    private Component vgap(int h) {
        return Box.createRigidArea(new Dimension(0, h));
    }

    // -------------------------------------------------------------------
    // Helpers
    // -------------------------------------------------------------------

    /**
     * Reads a field; returns {@code ""} if it shows placeholder text.
     *
     * @param f field to read
     * @return trimmed content or {@code ""}
     */
    private String safeRead(JTextField f) {
        if (f.getForeground().equals(TM))
            return "";
        return f.getText().trim();
    }

    /**
     * Resets a field to its placeholder state.
     *
     * @param f           field to reset
     * @param placeholder placeholder to restore
     */
    private void reset(JTextField f, String placeholder) {
        f.setText(placeholder);
        f.setForeground(TM);
    }

    /** Updates the header plan-count badge. */
    private void updateBadge() {
        planBadge.setText("Plans: " + plans.size());
    }

    /**
     * Reads and validates {@code txtIndex}.
     * Initialises {@code displayNumber} to {@code -1}.
     * Uses try/catch for {@link NumberFormatException}.
     * Verifies the value is within {@code [0, plans.size()-1]}.
     * Shows a message dialog for every error case.
     * Returns {@code -1} on any error; the valid index otherwise.
     *
     * @return valid index or {@code -1}
     */
    private int getDisplayNumber() {
        int displayNumber = -1;
        if (plans.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No plans in the list yet.\nAdd a Personal or Pro Plan first.",
                    "Empty List", JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        try {
            int v = Integer.parseInt(safeRead(txtIndex));
            if (v >= 0 && v < plans.size()) {
                displayNumber = v;
            } else {
                JOptionPane.showMessageDialog(this,
                        "Index out of range!\nValid range: 0 \u2013 "
                                + (plans.size() - 1) + ".",
                        "Invalid Index", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid input!\nPlease enter a whole number for the index.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        return displayNumber;
    }

    /**
     * Uses {@code instanceof} to display the type of plan at {@code index}.
     *
     * @param index validated index (not {@code -1})
     */
    private void checkPlanType(int index) {
        AIModel m = plans.get(index);
        if (m instanceof PersonalPlan) {
            JOptionPane.showMessageDialog(this,
                    "Plan at index " + index + ":\n\n  PERSONAL PLAN",
                    "Plan Type", JOptionPane.INFORMATION_MESSAGE);
        } else if (m instanceof ProPlan) {
            JOptionPane.showMessageDialog(this,
                    "Plan at index " + index + ":\n\n  PRO PLAN",
                    "Plan Type", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Plan at index " + index + " is of an unknown type.",
                    "Plan Type", JOptionPane.WARNING_MESSAGE);
        }
    }

    // -------------------------------------------------------------------
    // Event handler
    // -------------------------------------------------------------------

    /**
     * Central dispatcher — routes all button clicks via an if-else chain.
     *
     * @param e the {@link ActionEvent} from a button click
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Add Personal Plan
        if (src == btnAddPersonal) {
            try {
                String name = safeRead(txtModelName);
                double price = Double.parseDouble(safeRead(txtPrice));
                int params = Integer.parseInt(safeRead(txtParams));
                int context = Integer.parseInt(safeRead(txtContext));
                int quota = Integer.parseInt(safeRead(txtPromptQuota));
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Model Name cannot be empty.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (price <= 0 || params <= 0 || context <= 0 || quota <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "Price, Parameters, Context Window and Quota must be positive (> 0).",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                PersonalPlan plan = new PersonalPlan(name, price, params, context, quota);
                plans.add(plan);
                updateBadge();
                displayArea.setText("  Personal Plan added at index: "
                        + (plans.size() - 1) + "\n\n" + plan.display());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Price, Parameters, Context Window and Quota must be valid numbers.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            // Add Pro Plan
        } else if (src == btnAddPro) {
            try {
                String name = safeRead(txtModelName);
                double price = Double.parseDouble(safeRead(txtPrice));
                int params = Integer.parseInt(safeRead(txtParams));
                int context = Integer.parseInt(safeRead(txtContext));
                int slots = Integer.parseInt(safeRead(txtTeamSlots));
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Model Name cannot be empty.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (price <= 0 || params <= 0 || context <= 0 || slots <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "Price, Parameters, Context Window and Team Slots must be positive (> 0).",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                ProPlan plan = new ProPlan(name, price, params, context, slots);
                plans.add(plan);
                updateBadge();
                displayArea.setText("  Pro Plan added at index: "
                        + (plans.size() - 1) + "\n\n" + plan.display());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Price, Parameters, Context Window and Team Slots must be valid numbers.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }

            // Display All
        } else if (src == btnDisplayAll) {
            if (plans.isEmpty()) {
                displayArea.setText("  No plans found. Add a plan first.");
                return;
            }
            StringBuilder sb = new StringBuilder("  ===== All Subscription Plans =====\n\n");
            for (int i = 0; i < plans.size(); i++) {
                sb.append("  \u2500\u2500 [ Index: ").append(i).append(" ] \u2500\u2500\n");
                sb.append(plans.get(i).display()).append("\n\n");
            }
            displayArea.setText(sb.toString());

            // Clear Fields
        } else if (src == btnClear) {
            reset(txtModelName, "e.g. GPT-4o");
            reset(txtPrice, "e.g. 250.00");
            reset(txtParams, "e.g. 70");
            reset(txtContext, "e.g. 128");
            reset(txtPromptQuota, "e.g. 500");
            reset(txtTeamSlots, "e.g. 10");
            reset(txtPromptText, "Enter your prompt here...");
            reset(txtResponseLen, "e.g. 1024");
            reset(txtMemberName, "e.g. Sita Rai");
            reset(txtIndex, "0, 1, 2 ...");
            displayArea.setText("  Fields cleared.\n");

            // Give a Prompt (PersonalPlan only)
        } else if (src == btnGivePrompt) {
            int idx = getDisplayNumber();
            if (idx != -1) {
                AIModel m = plans.get(idx);
                if (m instanceof PersonalPlan) {
                    try {
                        String prompt = safeRead(txtPromptText);
                        int len = Integer.parseInt(safeRead(txtResponseLen));
                        if (prompt.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Prompt Text cannot be empty.",
                                    "Input Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if (len <= 0) {
                            JOptionPane.showMessageDialog(this,
                                    "Response Length must be a positive integer.",
                                    "Input Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        displayArea.setText("  " + ((PersonalPlan) m).enterPrompt(prompt, len));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this,
                                "Response Length must be a valid integer.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Give Prompt is only available for Personal Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Buy Prompts (PersonalPlan only)
        } else if (src == btnBuyPrompts) {
            int idx = getDisplayNumber();
            if (idx != -1) {
                AIModel m = plans.get(idx);
                if (m instanceof PersonalPlan) {
                    try {
                        int extra = Integer.parseInt(safeRead(txtPromptQuota));
                        displayArea.setText("  " + ((PersonalPlan) m).purchasePrompts(extra));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this,
                                "Enter a valid number in the Prompt Quota field.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Buy Prompts is only available for Personal Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Add Team Member (ProPlan only)
        } else if (src == btnAddMember) {
            int idx = getDisplayNumber();
            if (idx != -1) {
                AIModel m = plans.get(idx);
                if (m instanceof ProPlan) {
                    String name = safeRead(txtMemberName);
                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Team Member Name cannot be empty.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    displayArea.setText("  " + ((ProPlan) m).addTeamMember(name));
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Add Team Member is only available for Pro Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Remove Team Member (ProPlan only)
        } else if (src == btnRemoveMember) {
            int idx = getDisplayNumber();
            if (idx != -1) {
                AIModel m = plans.get(idx);
                if (m instanceof ProPlan) {
                    String name = safeRead(txtMemberName);
                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Team Member Name cannot be empty.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    displayArea.setText("  " + ((ProPlan) m).removeTeamMember(name));
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Remove Team Member is only available for Pro Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Check Plan Type
        } else if (src == btnCheckType) {
            int idx = getDisplayNumber();
            if (idx != -1)
                checkPlanType(idx);

            // Export to File (BufferedWriter)
        } else if (src == btnExport) {
            if (plans.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No plans to export. Add plans first.",
                        "Export Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Save Subscription Data");
            if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                if (!f.getName().toLowerCase().endsWith(".txt"))
                    f = new File(f.getAbsolutePath() + ".txt");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                    bw.write("===== AI Subscription Export =====");
                    bw.newLine();
                    bw.newLine();
                    for (int i = 0; i < plans.size(); i++) {
                        bw.write("[ Index: " + i + " ]");
                        bw.newLine();
                        bw.write(plans.get(i).display());
                        bw.newLine();
                        bw.newLine();
                    }
                    displayArea.setText("  Exported successfully to:\n  " + f.getAbsolutePath());
                    JOptionPane.showMessageDialog(this,
                            "Export successful!\n" + f.getAbsolutePath(),
                            "Export", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "File write error: " + ex.getMessage(),
                            "Export Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Load from File (BufferedReader + separate viewer)
        } else if (src == btnLoad) {
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Load Subscription Data");
            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null)
                        sb.append(line).append("\n");
                    String content = sb.toString();
                    displayArea.setText(content);

                    JFrame viewer = new JFrame("Loaded: " + f.getName());
                    viewer.setSize(620, 520);
                    viewer.getContentPane().setBackground(C0);
                    viewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    viewer.setLocationRelativeTo(this);

                    JTextArea ta = new JTextArea(content);
                    ta.setEditable(false);
                    ta.setFont(F_MONO);
                    ta.setBackground(C0);
                    ta.setForeground(OT);
                    ta.setBorder(BorderFactory.createEmptyBorder(12, 16, 12, 16));

                    JScrollPane sp = new JScrollPane(ta);
                    sp.setBorder(BorderFactory.createLineBorder(CA, 3));
                    viewer.add(sp);
                    viewer.setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "File read error: " + ex.getMessage(),
                            "Load Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    // -------------------------------------------------------------------
    // Entry point
    // -------------------------------------------------------------------

    /**
     * Launches the application on the Swing EDT.
     * Applies Nimbus Look and Feel with dark overrides where available.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo lf : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(lf.getName())) {
                    UIManager.setLookAndFeel(lf.getClassName());
                    UIManager.put("control", C1);
                    UIManager.put("info", C0);
                    UIManager.put("nimbusBase", new Color(38, 90, 100));
                    UIManager.put("nimbusBlueGrey", CB);
                    UIManager.put("nimbusLightBackground", C2);
                    UIManager.put("text", TW);
                    break;
                }
            }
        } catch (Exception ex) {
            /* fallback to system default */ }
        SwingUtilities.invokeLater(SubscriptionGUI::new);
    }
}