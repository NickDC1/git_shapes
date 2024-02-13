import javax.swing.JFrame;
import java.awt.Color;
import java.util.ArrayList;

public class TesterNick {
    public static void main(String[] args) {
        ArrayList<Drawable> drawables = new ArrayList<>();

        // Add Circles and Squares to the list
        drawables.add(new Circle(50, Color.RED));
        drawables.add(new Square(60, Color.BLUE, 100, 100)); // Example positions
        // Continue adding as needed

        TestPanel testPanel = new TestPanel(drawables);

        JFrame frame = new JFrame("Drawable Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(testPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
