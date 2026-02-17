import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class NepalFlagAccurate extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Colors
        Color crimson = new Color(220, 20, 60);
        Color deepBlue = new Color(0, 56, 168);

        // Coordinates for flag shape (approx)
        int[] xBorder = {50, 200, 50, 180, 50};
        int[] yBorder = {50, 150, 250, 250, 50};

        // Draw blue border
        g2.setColor(deepBlue);
        g2.fillPolygon(xBorder, yBorder, xBorder.length);

        // Red inner shape (inset)
        int[] xRed = {60, 190, 60, 170, 60};
        int[] yRed = {60, 150, 240, 240, 60};

        g2.setColor(crimson);
        g2.fillPolygon(xRed, yRed, xRed.length);

        // Draw moon crescent (upper part)
        g2.setColor(Color.WHITE);
        g2.fillOval(110, 80, 60, 60);  // full circle
        g2.setColor(crimson);
        g2.fillOval(125, 80, 60, 60);  // cut inner part

        // Draw sun (lower part)
        g2.setColor(Color.WHITE);
        int sunXCenter = 125;
        int sunYCenter = 185;
        int r = 30;
        g2.fill(new Ellipse2D.Double(sunXCenter - r, sunYCenter - r, 2 * r, 2 * r));
        // basic rays
        for (int i = 0; i < 12; i++) {
            double angle = Math.toRadians(i * 30);
            double x1 = sunXCenter + r * Math.cos(angle);
            double y1 = sunYCenter + r * Math.sin(angle);
            double x2 = sunXCenter + (r + 15) * Math.cos(angle);
            double y2 = sunYCenter + (r + 15) * Math.sin(angle);
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flag of Nepal 🇳🇵");
        frame.add(new NepalFlagAccurate());
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
