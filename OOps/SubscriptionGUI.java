import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * A very basic GUI that stores AIModel details in an ArrayList and displays them
 * in a text area.  This satisfies the coursework requirement to have a class
 * with a GUI, uses an ArrayList, and contains a main method.
 */
public class SubscriptionGUI {
	private JFrame frame;
	private JTextArea displayArea;
	private ArrayList<AiModel> models;

	public SubscriptionGUI() {
		models = new ArrayList<>();
		frame = new JFrame("AI Subscription Manager");
		displayArea = new JTextArea(15, 50);
		displayArea.setEditable(false);
		frame.getContentPane().add(new JScrollPane(displayArea), BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addModel(AiModel model) {
		models.add(model);
		refreshDisplay();
	}

	private void refreshDisplay() {
		StringBuilder sb = new StringBuilder();
		for (AiModel m : models) {
			sb.append(m.display()).append("\n---------------------\n");
		}
		displayArea.setText(sb.toString());
	}

	public static void main(String[] args) {
		// create GUI on event dispatch thread
		SwingUtilities.invokeLater(() -> {
			SubscriptionGUI gui = new SubscriptionGUI();
			// add a couple of sample plans
			gui.addModel(new PersonalPlan("GPT-3.5", 0.02, 175, "4K tokens", 5));
			gui.addModel(new ProPlan("GPT-4", 0.06, 540, "8K tokens", 10));
			gui.frame.setVisible(true);
		});
	}
}
