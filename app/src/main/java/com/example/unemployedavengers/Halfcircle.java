import javax.swing.*;
import java.awt.*;

public class HalfCircleDrawer extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int diameter = Math.min(width, height);
        int x = (width - diameter) / 2;
        int y = (height - diameter) / 2;


        g2d.fillArc(x, y, diameter, diameter, 0, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Half Circle Drawer");
        HalfCircleDrawer panel = new HalfCircleDrawer();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}