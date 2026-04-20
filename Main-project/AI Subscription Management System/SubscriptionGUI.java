/**
 * Main GUI class for the AI Subscription Management System.
 * Run from the terminal:
 * <pre>
 *   javac SubscriptionGUI.java
 *   java  SubscriptionGUI
 * </pre>
 *
 * <p>Uses a dark-theme design with gradient panels, colour-coded buttons,
 * and a card-based layout. All plans are stored in an {@code ArrayList<AIModel>}.</p>
 *
 * @author  Pawan Poudel
 * @version 2.1
 * @see     AIModel
 * @see     PersonalPlan
 * @see     ProPlan
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;


public class SubscriptionGUI extends JFrame implements ActionListener {

    // ---------------------------------------------------------------
    // Colour Palette — Dark Modern Theme
    // ---------------------------------------------------------------

    private static final Color BG_DARK     = new Color(10, 10, 26);    // main window background
    private static final Color BG_CARD     = new Color(20, 20, 45);    // card / panel background
    private static final Color BG_INPUT    = new Color(15, 15, 35);    // input field background
    private static final Color BORDER_COL  = new Color(50, 50, 100);   // card and field borders
    private static final Color TEXT_WHITE  = new Color(230, 230, 255); // primary text
    private static final Color TEXT_MUTED  = new Color(140, 140, 180); // labels and placeholders
    private static final Color ACCENT_CYAN = new Color(0, 210, 220);   // Personal Plan
    private static final Color ACCENT_PURP = new Color(160, 90, 255);  // Pro Plan
    private static final Color ACCENT_GRN  = new Color(50, 210, 130);  // success / display
    private static final Color ACCENT_ORG  = new Color(255, 160, 50);  // file operations
    private static final Color ACCENT_RED  = new Color(255, 80, 110);  // clear / danger
    private static final Color ACCENT_TEAL = new Color(0, 180, 160);   // prompt operations


    // ---------------------------------------------------------------
    // Fonts
    // ---------------------------------------------------------------

    private static final Font FONT_TITLE  = new Font("Segoe UI", Font.BOLD,  22);
    private static final Font FONT_LABEL  = new Font("Segoe UI", Font.BOLD,  12);
    private static final Font FONT_INPUT  = new Font("Segoe UI", Font.PLAIN, 12);
    private static final Font FONT_MONO   = new Font("Consolas", Font.PLAIN, 12);//everycharacter takes equal width
    private static final Font FONT_SMALL  = new Font("Segoe UI", Font.PLAIN, 11);
    private static final Font FONT_BTN    = new Font("Segoe UI", Font.BOLD,  11);
    private static final Font FONT_ICON   = new Font("Segoe UI", Font.PLAIN, 10);


    // ---------------------------------------------------------------
    // Data Store
    // ---------------------------------------------------------------

    /**
     * Holds all subscription plans polymorphically as {@link AIModel} references.
     * Contains both {@link PersonalPlan} and {@link ProPlan} instances.
     */
    private ArrayList<AIModel> plans = new ArrayList<>();


    // ---------------------------------------------------------------
    // Text Fields
    // ---------------------------------------------------------------

    private JTextField txtModelName;      // Field 1 — AI model name
    private JTextField txtPrice;          // Field 2 — price per 1L tokens in NPR
    private JTextField txtParams;         // Field 3 — parameter count in billions
    private JTextField txtContext;        // Field 4 — context window size
    private JTextField txtPromptQuota;    // Field 5 — initial quota / extra prompts to buy
    private JTextField txtTeamSlots;      // Field 6 — team member slot count
    private JTextField txtPromptText;     // Field 7 — prompt text to submit
    private JTextField txtResponseLength; // Field 8 — expected response length in tokens
    private JTextField txtMemberName;     // Field 9 — team member name for add/remove
    private JTextField txtIndex;          // Field 10 — ArrayList index of the target plan


    // ---------------------------------------------------------------
    // Buttons
    // ---------------------------------------------------------------

    private JButton btnAddPersonal;
    private JButton btnAddPro;
    private JButton btnDisplayAll;
    private JButton btnClear;
    private JButton btnGivePrompt;
    private JButton btnPurchasePrompts;
    private JButton btnAddMember;
    private JButton btnRemoveMember;
    private JButton btnCheckType;
    private JButton btnExport;
    private JButton btnLoad;


    // ---------------------------------------------------------------
    // Output Area
    // ---------------------------------------------------------------

    /** Read-only terminal-style area for displaying results. */
    private JTextArea displayArea;


    // ---------------------------------------------------------------
    // Header Badge
    // ---------------------------------------------------------------

    /** Badge in the header showing the current plan count. Kept as a field for direct updates. */
    private JLabel planBadge;


    // ---------------------------------------------------------------
    // Inner Class — GradientPanel
    // ---------------------------------------------------------------

    /**
     * Custom {@link JPanel} that paints a smooth vertical gradient background.
     * Used in the header section.
     */
    private static class GradientPanel extends JPanel {

        private final Color topColor;
        private final Color bottomColor;

        /**
         * @param topColor    colour at the top of the gradient
         * @param bottomColor colour at the bottom of the gradient
         */
        public GradientPanel(Color topColor, Color bottomColor) {
            this.topColor    = topColor;
            this.bottomColor = bottomColor;
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                                 RenderingHints.VALUE_RENDER_QUALITY);
            GradientPaint gp = new GradientPaint(
                    0, 0, topColor,
                    0, getHeight(), bottomColor);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }


    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------
    /**
     * Builds and displays the main SubscriptionGUI window.
     *
     * <p>Layout: {@code NORTH} = gradient header;
     * {@code CENTER} = left input column + right output terminal.</p>
     */
    public SubscriptionGUI() {
        setTitle("AI Subscription Manager");
        setSize(1100, 780);
        setMinimumSize(new Dimension(1000, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(BG_DARK);
        getContentPane().setBackground(BG_DARK);
        setLayout(new BorderLayout(0, 0));

        add(buildHeader(),    BorderLayout.NORTH);
        add(buildSplitBody(), BorderLayout.CENTER);

        setVisible(true);
    }


    // ---------------------------------------------------------------
    // Builder Methods
    // ---------------------------------------------------------------

    /**
     * Builds the gradient header with the app title, subtitle, and plan count badge.
     *
     * @return configured {@link GradientPanel}
     */
    private JPanel buildHeader() {

        GradientPanel header = new GradientPanel(
                new Color(10, 10, 30),
                new Color(25, 10, 60));
        header.setLayout(new BorderLayout());
        header.setBorder(BorderFactory.createEmptyBorder(14, 24, 14, 24));

        JLabel title = new JLabel("⚡  AI Subscription Manager");
        title.setFont(FONT_TITLE);
        title.setForeground(TEXT_WHITE);

        JLabel subtitle = new JLabel(
                "Manage Personal & Pro AI Plans · Itahari Technology Solutions");
        subtitle.setFont(FONT_SMALL);
        subtitle.setForeground(TEXT_MUTED);

        JPanel textStack = new JPanel();
        textStack.setOpaque(false);
        textStack.setLayout(new BoxLayout(textStack, BoxLayout.Y_AXIS));
        textStack.add(title);
        textStack.add(Box.createVerticalStrut(3));
        textStack.add(subtitle);

        // Stored as an instance field so updateBadge() can reference it directly
        planBadge = new JLabel("Plans: 0");
        planBadge.setFont(new Font("Segoe UI", Font.BOLD, 13));
        planBadge.setForeground(ACCENT_CYAN);
        planBadge.setHorizontalAlignment(SwingConstants.RIGHT);

        header.add(textStack, BorderLayout.WEST);
        header.add(planBadge, BorderLayout.EAST);

        header.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, ACCENT_CYAN),
                BorderFactory.createEmptyBorder(14, 24, 12, 24)));

        return header;
    }


    /**
     * Builds the main body: scrollable input column on the left,
     * full-height output terminal on the right.
     *
     * @return {@link JPanel} with left and right columns
     */
    private JPanel buildSplitBody() {

        JPanel body = new JPanel(new BorderLayout(8, 0));
        body.setBackground(BG_DARK);
        body.setBorder(BorderFactory.createEmptyBorder(8, 10, 8, 10));

        JPanel leftColumn = buildLeftColumn();
        JScrollPane leftScroll = new JScrollPane(leftColumn);
        leftScroll.setBorder(BorderFactory.createEmptyBorder());
        leftScroll.setBackground(BG_DARK);
        leftScroll.getViewport().setBackground(BG_DARK);
        leftScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        leftScroll.setPreferredSize(new Dimension(540, 0));

        JPanel rightColumn = buildOutputPanel();

        body.add(leftScroll,  BorderLayout.WEST);
        body.add(rightColumn, BorderLayout.CENTER);

        return body;
    }


    /**
     * Assembles all four input/button sections into the left column.
     * Sections are ordered: Add Plans → Personal → Pro → Utilities.
     *
     * @return fully populated dark {@link JPanel}
     */
    private JPanel buildLeftColumn() {

        JPanel col = new JPanel();
        col.setBackground(BG_DARK);
        col.setLayout(new BoxLayout(col, BoxLayout.Y_AXIS));
        col.setBorder(BorderFactory.createEmptyBorder(6, 0, 6, 6));

        col.add(buildAddPlansSection());
        col.add(Box.createVerticalStrut(8));
        col.add(buildPersonalSection());
        col.add(Box.createVerticalStrut(8));
        col.add(buildProSection());
        col.add(Box.createVerticalStrut(8));
        col.add(buildUtilitySection());

        return col;
    }


    /**
     * Section 1 — core model fields (name, price, params, context)
     * plus prompt quota / team slots row and Add Plan buttons.
     *
     * @return styled section card
     */
    private JPanel buildAddPlansSection() {

        JPanel card = makeSectionCard("   Add Plan — Model Details", ACCENT_CYAN);

        JPanel fields = new JPanel(new GridLayout(4, 2, 6, 5));
        fields.setOpaque(false);

        fields.add(makeLabel("Model Name"));
        txtModelName = makeField("e.g. GPT-4");
        fields.add(txtModelName);

        fields.add(makeLabel("Price (NPR / 1L tokens)"));
        txtPrice = makeField("e.g. 250.00");
        fields.add(txtPrice);

        fields.add(makeLabel("Parameters (Billions)"));
        txtParams = makeField("e.g. 70");
        fields.add(txtParams);

        fields.add(makeLabel("Context Window"));
        txtContext = makeField("e.g. 128K");
        fields.add(txtContext);

        JPanel quotaRow = new JPanel(new GridLayout(1, 4, 6, 0));
        quotaRow.setOpaque(false);
        quotaRow.add(makeLabel("Prompt Quota"));
        txtPromptQuota = makeField("e.g. 500");
        quotaRow.add(txtPromptQuota);
        quotaRow.add(makeLabel("Team Slots"));
        txtTeamSlots = makeField("e.g. 10");
        quotaRow.add(txtTeamSlots);

        JPanel btnRow = new JPanel(new GridLayout(1, 2, 6, 0));
        btnRow.setOpaque(false);
        btnAddPersonal = makeActionButton("👤  Add Personal Plan", ACCENT_CYAN);
        btnAddPro      = makeActionButton("👥  Add Pro Plan",      ACCENT_PURP);
        btnRow.add(btnAddPersonal);
        btnRow.add(btnAddPro);

        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.add(fields);
        card.add(Box.createVerticalStrut(5));
        card.add(quotaRow);
        card.add(Box.createVerticalStrut(6));
        card.add(btnRow);

        return card;
    }


    /**
     * Section 2 — prompt text, response length, and Personal Plan action buttons.
     *
     * @return styled section card
     */
    private JPanel buildPersonalSection() {

        JPanel card = makeSectionCard("    Personal Plan Operations", ACCENT_TEAL);

        JPanel promptRow = new JPanel(new GridLayout(1, 2, 6, 0));
        promptRow.setOpaque(false);
        promptRow.add(makeLabel("Prompt Text"));
        txtPromptText = makeField("Enter your prompt...");
        promptRow.add(txtPromptText);

        JPanel lenRow = new JPanel(new GridLayout(1, 2, 6, 0));
        lenRow.setOpaque(false);
        lenRow.add(makeLabel("Response Length (tokens)"));
        txtResponseLength = makeField("e.g. 1024");
        lenRow.add(txtResponseLength);

        JPanel btnRow = new JPanel(new GridLayout(1, 2, 6, 0));
        btnRow.setOpaque(false);
        btnGivePrompt      = makeActionButton("▶  Give Prompt", ACCENT_TEAL);
        btnPurchasePrompts = makeActionButton("＄  Buy Prompts", ACCENT_GRN);
        btnRow.add(btnGivePrompt);
        btnRow.add(btnPurchasePrompts);

        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.add(promptRow);
        card.add(Box.createVerticalStrut(5));
        card.add(lenRow);
        card.add(Box.createVerticalStrut(6));
        card.add(btnRow);

        return card;
    }


    /**
     * Section 3 — team member name field and Pro Plan action buttons.
     *
     * @return styled section card
     */
    private JPanel buildProSection() {

        JPanel card = makeSectionCard("  👥  Pro Plan — Team Operations", ACCENT_PURP);

        JPanel nameRow = new JPanel(new GridLayout(1, 2, 6, 0));
        nameRow.setOpaque(false);
        nameRow.add(makeLabel("Team Member Name"));
        txtMemberName = makeField("e.g. Sita Rai");
        nameRow.add(txtMemberName);

        JPanel btnRow = new JPanel(new GridLayout(1, 2, 6, 0));
        btnRow.setOpaque(false);
        btnAddMember    = makeActionButton("＋  Add Member",    ACCENT_PURP);
        btnRemoveMember = makeActionButton("✕  Remove Member",  ACCENT_RED);
        btnRow.add(btnAddMember);
        btnRow.add(btnRemoveMember);

        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.add(nameRow);
        card.add(Box.createVerticalStrut(6));
        card.add(btnRow);

        return card;
    }


    /**
     * Section 4 — index field and utility buttons (Display All, Check Type,
     * Export, Load, Clear).
     *
     * @return styled section card
     */
    private JPanel buildUtilitySection() {

        JPanel card = makeSectionCard("  ⚙  Index & Utilities", ACCENT_GRN);

        JPanel idxRow = new JPanel(new GridLayout(1, 2, 6, 0));
        idxRow.setOpaque(false);
        idxRow.add(makeLabel("Index Number"));
        txtIndex = makeField("0, 1, 2 ...");
        txtIndex.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 3, 0, 0, ACCENT_CYAN),
                BorderFactory.createEmptyBorder(5, 10, 5, 8)));
        idxRow.add(txtIndex);

        JPanel btnRow1 = new JPanel(new GridLayout(1, 3, 6, 0));
        btnRow1.setOpaque(false);
        btnDisplayAll = makeActionButton("☰  Display All",  ACCENT_GRN);
        btnCheckType  = makeActionButton("?  Check Type",   ACCENT_CYAN);
        btnClear      = makeActionButton("🗑  Clear Fields", ACCENT_RED);
        btnRow1.add(btnDisplayAll);
        btnRow1.add(btnCheckType);
        btnRow1.add(btnClear);

        JPanel btnRow2 = new JPanel(new GridLayout(1, 2, 6, 0));
        btnRow2.setOpaque(false);
        btnExport = makeActionButton("↑  Export to File", ACCENT_ORG);
        btnLoad   = makeActionButton("↓  Load from File", ACCENT_ORG);
        btnRow2.add(btnExport);
        btnRow2.add(btnLoad);

        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.add(idxRow);
        card.add(Box.createVerticalStrut(6));
        card.add(btnRow1);
        card.add(Box.createVerticalStrut(5));
        card.add(btnRow2);

        return card;
    }


    /**
     * Builds the terminal-style output panel occupying the full right half.
     * Dark background with soft green monospaced text.
     *
     * @return styled panel containing the output {@link JTextArea} in a {@link JScrollPane}
     */
    private JPanel buildOutputPanel() {

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(BG_CARD);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 2, 0, 0, ACCENT_CYAN),
                BorderFactory.createEmptyBorder(0, 0, 0, 0)));

        /* Terminal title bar */
        JPanel titleBar = new JPanel(new BorderLayout());
        titleBar.setBackground(new Color(5, 5, 20));
        titleBar.setBorder(BorderFactory.createEmptyBorder(7, 14, 7, 14));

        JLabel outLabel = new JLabel("  OUTPUT  /  RESULTS");
        outLabel.setFont(new Font("Consolas", Font.BOLD, 11));
        outLabel.setForeground(ACCENT_CYAN);

        JLabel hint = new JLabel("Read-only terminal  ");
        hint.setFont(FONT_SMALL);
        hint.setForeground(TEXT_MUTED);

        titleBar.add(outLabel, BorderLayout.WEST);
        titleBar.add(hint,     BorderLayout.EAST);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(FONT_MONO);
        displayArea.setBackground(new Color(8, 8, 20));
        displayArea.setForeground(new Color(180, 240, 180));
        displayArea.setCaretColor(ACCENT_CYAN);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        displayArea.setBorder(BorderFactory.createEmptyBorder(12, 16, 12, 16));
        displayArea.setText(
            "  System ready.\n" +
            "  ─────────────────────────────────\n" +
            "  Fill the fields on the left and\n" +
            "  click a button to get started.\n");

        JScrollPane scroll = new JScrollPane(displayArea);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.setBackground(new Color(8, 8, 20));
        scroll.getViewport().setBackground(new Color(8, 8, 20));

        panel.add(titleBar, BorderLayout.NORTH);
        panel.add(scroll,   BorderLayout.CENTER);

        return panel;
    }


    // ---------------------------------------------------------------
    // Factory Helpers
    // ---------------------------------------------------------------

    /**
     * Creates a styled dark section card with a coloured left accent border
     * and a titled header. Used as the container for all four input sections.
     *
     * @param title       section title
     * @param accentColor left-border accent colour
     * @return configured section card {@link JPanel}
     */
    private JPanel makeSectionCard(String title, Color accentColor) {

        JPanel card = new JPanel();
        card.setBackground(BG_CARD);
        card.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createMatteBorder(0, 4, 0, 0, accentColor),
                        BorderFactory.createLineBorder(BORDER_COL, 1)),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createTitledBorder(
                                BorderFactory.createEmptyBorder(),
                                title,
                                TitledBorder.LEFT,
                                TitledBorder.TOP,
                                FONT_LABEL,
                                TEXT_MUTED),
                        BorderFactory.createEmptyBorder(2, 10, 10, 10))));

        return card;
    }


    /**
     * Creates a styled dark card panel with a coloured left accent border and title.
     *
     * @param title section title
     * @return configured card {@link JPanel}
     */
    private JPanel makeCard(String title) {

        JPanel card = new JPanel();
        card.setBackground(BG_CARD);
        card.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createMatteBorder(0, 3, 0, 0, ACCENT_CYAN),
                        BorderFactory.createLineBorder(BORDER_COL, 1)),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createTitledBorder(
                                BorderFactory.createEmptyBorder(),
                                title,
                                TitledBorder.LEFT,
                                TitledBorder.TOP,
                                FONT_LABEL,
                                TEXT_MUTED),
                        BorderFactory.createEmptyBorder(2, 10, 10, 10))));

        return card;
    }


    /**
     * Creates a styled dark input field with placeholder text.
     * The placeholder clears on focus and restores on blur if left empty.
     *
     * @param placeholder hint text shown when the field is empty
     * @return configured {@link JTextField}
     */
    private JTextField makeField(String placeholder) {

        JTextField field = new JTextField();
        field.setFont(FONT_INPUT);
        field.setBackground(BG_INPUT);
        field.setForeground(TEXT_WHITE);
        field.setCaretColor(ACCENT_CYAN);
        field.setSelectionColor(new Color(0, 120, 130));
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER_COL, 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 8)));

        field.setText(placeholder);
        field.setForeground(TEXT_MUTED);

        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (field.getForeground().equals(TEXT_MUTED)) {
                    field.setText("");
                    field.setForeground(TEXT_WHITE);
                }
            }
            @Override
            public void focusLost(FocusEvent fe) {
                if (field.getText().trim().isEmpty()) {
                    field.setText(placeholder);
                    field.setForeground(TEXT_MUTED);
                }
            }
        });

        return field;
    }


    /**
     * Creates a styled label for use alongside input fields.
     *
     * @param text label text
     * @return configured {@link JLabel}
     */
    private JLabel makeLabel(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(TEXT_MUTED);
        return lbl;
    }


    /**
     * Creates a compact colour-accented action button with hover and press effects.
     * Registers {@code this} as the {@link ActionListener}.
     *
     * @param text        button label (may include a leading symbol)
     * @param accentColor dominant accent colour
     * @return fully styled {@link JButton}
     */
    private JButton makeActionButton(String text, Color accentColor) {

        Color bgNormal = new Color(
                Math.min(accentColor.getRed()   / 6, 45),
                Math.min(accentColor.getGreen() / 6, 45),
                Math.min(accentColor.getBlue()  / 6, 45));

        Color bgHover = new Color(
                Math.min(accentColor.getRed()   / 3, 80),
                Math.min(accentColor.getGreen() / 3, 80),
                Math.min(accentColor.getBlue()  / 3, 80));

        JButton btn = new JButton(text);
        btn.setFont(FONT_BTN);
        btn.setForeground(accentColor);
        btn.setBackground(bgNormal);
        btn.setOpaque(true);
        btn.setFocusPainted(false);
        btn.setBorderPainted(true);
        btn.setHorizontalAlignment(SwingConstants.CENTER);
        btn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(accentColor.getRed(),
                                  accentColor.getGreen(),
                                  accentColor.getBlue(), 180), 1),
                BorderFactory.createEmptyBorder(7, 12, 7, 12)));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent me)  { btn.setBackground(bgHover);  btn.setForeground(Color.WHITE); }
            @Override public void mouseExited(MouseEvent me)   { btn.setBackground(bgNormal); btn.setForeground(accentColor); }
            @Override public void mousePressed(MouseEvent me)  { btn.setBackground(BG_INPUT); }
            @Override public void mouseReleased(MouseEvent me) { btn.setBackground(bgHover);  }
        });

        btn.addActionListener(this);
        return btn;
    }


    /**
     * Creates a colour-accented action button with hover and press effects.
     *
     * @param text        button label
     * @param accentColor dominant accent colour
     * @return fully styled {@link JButton}
     */
    private JButton makeButton(String text, Color accentColor) {

        Color bgNormal = new Color(
                Math.min(accentColor.getRed()   / 5, 60),
                Math.min(accentColor.getGreen() / 5, 60),
                Math.min(accentColor.getBlue()  / 5, 60));

        Color bgHover = new Color(
                Math.min(accentColor.getRed()   / 3, 90),
                Math.min(accentColor.getGreen() / 3, 90),
                Math.min(accentColor.getBlue()  / 3, 90));

        JButton btn = new JButton(text);
        btn.setFont(FONT_LABEL);
        btn.setForeground(accentColor);
        btn.setBackground(bgNormal);
        btn.setOpaque(true);
        btn.setFocusPainted(false);
        btn.setBorderPainted(true);
        btn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(accentColor.getRed(),
                                  accentColor.getGreen(),
                                  accentColor.getBlue(), 160), 1),
                BorderFactory.createEmptyBorder(8, 14, 8, 14)));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent me)  { btn.setBackground(bgHover);  btn.setForeground(Color.WHITE); }
            @Override public void mouseExited(MouseEvent me)   { btn.setBackground(bgNormal); btn.setForeground(accentColor); }
            @Override public void mousePressed(MouseEvent me)  { btn.setBackground(BG_INPUT); }
            @Override public void mouseReleased(MouseEvent me) { btn.setBackground(bgHover);  }
        });

        btn.addActionListener(this);
        return btn;
    }


    /**
     * Creates a uniform grid-cell action button with accent colour,
     * hover glow, and press feedback.
     *
     * @param text        button label
     * @param accentColor dominant accent colour
     * @return grid-ready styled {@link JButton}
     */
    private JButton makeGridButton(String text, Color accentColor) {

        Color bgNormal = new Color(
                Math.min(accentColor.getRed()   / 6, 45),
                Math.min(accentColor.getGreen() / 6, 45),
                Math.min(accentColor.getBlue()  / 6, 45));

        Color bgHover  = new Color(
                Math.min(accentColor.getRed()   / 3, 80),
                Math.min(accentColor.getGreen() / 3, 80),
                Math.min(accentColor.getBlue()  / 3, 80));

        JButton btn = new JButton(text);
        btn.setFont(FONT_BTN);
        btn.setForeground(accentColor);
        btn.setBackground(bgNormal);
        btn.setOpaque(true);
        btn.setFocusPainted(false);
        btn.setBorderPainted(true);
        btn.setHorizontalAlignment(SwingConstants.CENTER);

        btn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(accentColor.getRed(),
                                  accentColor.getGreen(),
                                  accentColor.getBlue(), 180), 1),
                BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new MouseAdapter() {
            @Override public void mouseEntered(MouseEvent me)  { btn.setBackground(bgHover);  btn.setForeground(Color.WHITE); }
            @Override public void mouseExited(MouseEvent me)   { btn.setBackground(bgNormal); btn.setForeground(accentColor); }
            @Override public void mousePressed(MouseEvent me)  { btn.setBackground(BG_INPUT); }
            @Override public void mouseReleased(MouseEvent me) { btn.setBackground(bgHover);  }
        });

        btn.addActionListener(this);
        return btn;
    }


    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    /**
     * Safely reads a text field, returning {@code ""} if the field
     * holds placeholder text or has been left blank.
     *
     * @param field the {@link JTextField} to read
     * @return trimmed field text, or {@code ""} if empty or showing placeholder
     */
    private String safeRead(JTextField field) {
        if (field.getForeground().equals(TEXT_MUTED)) return "";
        return field.getText().trim();
    }


    /** Updates the header plan count badge to match the current {@link #plans} size. */
    private void updateBadge() {
        planBadge.setText("Plans: " + plans.size());
    }


    /**
     * Reads and validates {@code txtIndex}, returning a safe ArrayList index.
     * Shows an error dialog for out-of-range or non-integer input.
     *
     * @return valid zero-based index, or {@code -1} if invalid
     */
    private int getDisplayNumber() {

        int displayNumber = -1; // -1 = invalid / not set

        try {
            int inputValue = Integer.parseInt(safeRead(txtIndex));

            if (inputValue >= 0 && inputValue < plans.size()) {
                displayNumber = inputValue;
            } else {
                JOptionPane.showMessageDialog(this,
                        "⚠  Index out of range!\n"
                        + "Enter a value between 0 and "
                        + (plans.size() - 1) + ".",
                        "Invalid Index", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "⚠  Invalid input!\nPlease enter a whole number for the index.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        return displayNumber;
    }


    /**
     * Uses {@code instanceof} to identify whether the plan at {@code index}
     * is a {@link PersonalPlan} or {@link ProPlan}, then shows the result
     * in an information dialog.
     *
     * @param index validated ArrayList index
     */
    private void checkPlanType(int index) {

        AIModel selected = plans.get(index);

        if (selected instanceof PersonalPlan) {
            JOptionPane.showMessageDialog(this,
                    "Plan at index " + index + " is a:\n\n  PERSONAL PLAN",
                    "Plan Type", JOptionPane.INFORMATION_MESSAGE);

        } else if (selected instanceof ProPlan) {
            JOptionPane.showMessageDialog(this,
                    "Plan at index " + index + " is a:\n\n  PRO PLAN",
                    "Plan Type", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this,
                    "Plan at index " + index + " is of an unknown type.",
                    "Plan Type", JOptionPane.WARNING_MESSAGE);
        }
    }


    // ---------------------------------------------------------------
    // Event Handler
    // ---------------------------------------------------------------

    /**
     * Central dispatcher for all button events.
     * Routes each click via an if-else chain on {@code e.getSource()}.
     *
     * @param e the {@link ActionEvent} fired by a button click
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();

        // ===========================================================
        // Add Personal Plan
        // ===========================================================
        if (src == btnAddPersonal) {

            try {
                String name    = safeRead(txtModelName);
                double price   = Double.parseDouble(safeRead(txtPrice));
                int    params  = Integer.parseInt(safeRead(txtParams));
                String context = safeRead(txtContext);
                int    quota   = Integer.parseInt(safeRead(txtPromptQuota));

                if (name.isEmpty() || context.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "⚠  Model Name and Context Window cannot be empty.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                PersonalPlan plan = new PersonalPlan(name, price, params, context, quota);
                plans.add(plan);
                updateBadge();

                displayArea.setText(
                        "    Personal Plan added at index: " + (plans.size() - 1) + "\n\n"
                        + plan.display());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "⚠  Price, Parameters, and Quota must be valid numbers.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }

        // ===========================================================
        // Add Pro Plan
        // ===========================================================
        } else if (src == btnAddPro) {

            try {
                String name    = safeRead(txtModelName);
                double price   = Double.parseDouble(safeRead(txtPrice));
                int    params  = Integer.parseInt(safeRead(txtParams));
                String context = safeRead(txtContext);
                int    slots   = Integer.parseInt(safeRead(txtTeamSlots));

                if (name.isEmpty() || context.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "⚠  Model Name and Context Window cannot be empty.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ProPlan plan = new ProPlan(name, price, params, context, slots);
                plans.add(plan);
                updateBadge();

                displayArea.setText(
                        "    Pro Plan added at index: " + (plans.size() - 1) + "\n\n"
                        + plan.display());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "⚠  Price, Parameters, and Team Slots must be valid numbers.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }

        // ===========================================================
        // Display All  (polymorphic display() call)
        // ===========================================================
        } else if (src == btnDisplayAll) {

            if (plans.isEmpty()) {
                displayArea.setText("  ℹ  No plans found. Add a plan first.");
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("  ===== All Subscription Plans =====\n\n");

            for (int i = 0; i < plans.size(); i++) {
                sb.append("  ── [ Index: ").append(i).append(" ] ──\n");
                sb.append(plans.get(i).display());
                sb.append("\n\n");
            }

            displayArea.setText(sb.toString());

        // ===========================================================
        // Clear All Fields
        // ===========================================================
        } else if (src == btnClear) {

            clearField(txtModelName,      "e.g. GPT-4");
            clearField(txtPrice,          "e.g. 250.00");
            clearField(txtParams,         "e.g. 70");
            clearField(txtContext,        "e.g. 128K");
            clearField(txtPromptQuota,    "e.g. 500");
            clearField(txtTeamSlots,      "e.g. 10");
            clearField(txtPromptText,     "Enter your prompt here...");
            clearField(txtResponseLength, "e.g. 1024");
            clearField(txtMemberName,     "e.g. Sita Rai");
            clearField(txtIndex,          "0, 1, 2 ...");
            displayArea.setText("  🗑  Fields cleared.\n");

        // ===========================================================
        // Give a Prompt  (PersonalPlan only)
        // ===========================================================
        } else if (src == btnGivePrompt) {

            int index = getDisplayNumber();

            if (index != -1) {
                AIModel selected = plans.get(index);

                if (selected instanceof PersonalPlan) {
                    try {
                        PersonalPlan pp  = (PersonalPlan) selected;
                        String promptTxt = safeRead(txtPromptText);
                        int    respLen   = Integer.parseInt(safeRead(txtResponseLength));

                        if (promptTxt.isEmpty()) {
                            JOptionPane.showMessageDialog(this,
                                    "⚠  Prompt Text cannot be empty.",
                                    "Input Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        displayArea.setText("  " + pp.enterPrompt(promptTxt, respLen));

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this,
                                "⚠  Response length must be a valid integer.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "⚠  Give a Prompt is only for Personal Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

        // ===========================================================
        // Purchase Prompts  (PersonalPlan only)
        // ===========================================================
        } else if (src == btnPurchasePrompts) {

            int index = getDisplayNumber();

            if (index != -1) {
                AIModel selected = plans.get(index);

                if (selected instanceof PersonalPlan) {
                    try {
                        PersonalPlan pp = (PersonalPlan) selected;
                        int extra       = Integer.parseInt(safeRead(txtPromptQuota));
                        displayArea.setText("  " + pp.purchasePrompts(extra));

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this,
                                "⚠  Enter a valid number in the Prompt Quota field.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "⚠  Purchase Prompts is only for Personal Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

        // ===========================================================
        // Add Team Member  (ProPlan only)
        // ===========================================================
        } else if (src == btnAddMember) {

            int index = getDisplayNumber();

            if (index != -1) {
                AIModel selected = plans.get(index);

                if (selected instanceof ProPlan) {
                    String name = safeRead(txtMemberName);
                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(this,
                                "⚠  Team Member Name cannot be empty.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    ProPlan pp = (ProPlan) selected;
                    displayArea.setText("  " + pp.addTeamMember(name));

                } else {
                    JOptionPane.showMessageDialog(this,
                            "⚠  Add Team Member is only for Pro Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

        // ===========================================================
        // Remove Team Member  (ProPlan only)
        // ===========================================================
        } else if (src == btnRemoveMember) {

            int index = getDisplayNumber();

            if (index != -1) {
                AIModel selected = plans.get(index);

                if (selected instanceof ProPlan) {
                    String name = safeRead(txtMemberName);
                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(this,
                                "⚠  Team Member Name cannot be empty.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    ProPlan pp = (ProPlan) selected;
                    displayArea.setText("  " + pp.removeTeamMember(name));

                } else {
                    JOptionPane.showMessageDialog(this,
                            "⚠  Remove Team Member is only for Pro Plan subscriptions.",
                            "Wrong Plan Type", JOptionPane.ERROR_MESSAGE);
                }
            }

        // ===========================================================
        // Check Plan Type  (instanceof)
        // ===========================================================
        } else if (src == btnCheckType) {

            int index = getDisplayNumber();
            if (index != -1) {
                checkPlanType(index);
            }

        // ===========================================================
        // Export to File  (BufferedWriter)
        // ===========================================================
        } else if (src == btnExport) {

            if (plans.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "⚠  No plans to export. Add plans first.",
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
                    bw.newLine(); bw.newLine();

                    for (int i = 0; i < plans.size(); i++) {
                        bw.write("[ Index: " + i + " ]");
                        bw.newLine();
                        bw.write(plans.get(i).display());
                        bw.newLine(); bw.newLine();
                    }

                    displayArea.setText("    Exported successfully to:\n  "
                            + f.getAbsolutePath());
                    JOptionPane.showMessageDialog(this, " Export successful!",
                            "Export", JOptionPane.INFORMATION_MESSAGE);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "⚠  File write error: " + ex.getMessage(),
                            "Export Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        // ===========================================================
        // Load from File  (BufferedReader + separate viewer JFrame)
        // ===========================================================
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

                    displayArea.setText(sb.toString());

                    /* Open content in a separate styled viewer window */
                    JFrame loadFrame = new JFrame("  Loaded: " + f.getName());
                    loadFrame.setSize(620, 520);
                    loadFrame.getContentPane().setBackground(BG_DARK);
                    loadFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JTextArea ta = new JTextArea(sb.toString());
                    ta.setEditable(false);
                    ta.setFont(FONT_MONO);
                    ta.setBackground(new Color(8, 8, 20));
                    ta.setForeground(new Color(180, 240, 180));
                    ta.setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14));

                    JScrollPane sp = new JScrollPane(ta);
                    sp.setBorder(BorderFactory.createLineBorder(ACCENT_CYAN, 2));
                    loadFrame.add(sp);
                    loadFrame.setVisible(true);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "⚠  File read error: " + ex.getMessage(),
                            "Load Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }


    // ---------------------------------------------------------------
    // Utility
    // ---------------------------------------------------------------

    /**
     * Resets a text field to its placeholder state (muted colour).
     * Used by the Clear button to restore all fields without triggering the FocusAdapter.
     *
     * @param field       field to reset
     * @param placeholder placeholder text to restore
     */
    private void clearField(JTextField field, String placeholder) {
        field.setText(placeholder);
        field.setForeground(TEXT_MUTED);
    }


    // ---------------------------------------------------------------
    // Entry Point
    // ---------------------------------------------------------------

    /**
     * Launches the application on the Swing Event Dispatch Thread.
     * Applies the Nimbus Look and Feel with dark-theme overrides if available.
     *
     * <p>Run from terminal:</p>
     * <pre>
     *   javac SubscriptionGUI.java
     *   java  SubscriptionGUI
     * </pre>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo lf : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(lf.getName())) {
                    UIManager.setLookAndFeel(lf.getClassName());
                    UIManager.put("control",               BG_CARD);
                    UIManager.put("info",                  BG_DARK);
                    UIManager.put("nimbusBase",            BG_DARK);
                    UIManager.put("nimbusBlueGrey",        BORDER_COL);
                    UIManager.put("nimbusLightBackground", BG_INPUT);
                    UIManager.put("text",                  TEXT_WHITE);
                    break;
                }
            }
        } catch (Exception ex) {
            // Nimbus unavailable — fall back to system default
        }

        SwingUtilities.invokeLater(() -> new SubscriptionGUI());
    }

}