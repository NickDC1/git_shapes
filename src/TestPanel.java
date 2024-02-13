import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

public class TestPanel extends JPanel {
    private ArrayList<Drawable> drawables;

    public TestPanel(ArrayList<Drawable> drawables) {
        this.drawables = drawables;
        this.setPreferredSize(new Dimension(1200, 300)); // Adjust size as necessary
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Drawable drawable : drawables) {
            drawable.draw(g, 0, 0); // This assumes your Drawable implementations handle their own positioning
        }
    }
}
