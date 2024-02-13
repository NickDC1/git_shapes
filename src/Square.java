import java.awt.Color;
import java.awt.Graphics;

public class Square implements Drawable {
    private double side;
    private Color color;
    private int x, y;

    public Square(double side, Color color, int x, int y) {
        this.side = side;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, (int)side, (int)side);
    }

    @Override
    public String describe() {
        return "Square at (" + x + ", " + y + ") with side " + side + " and color " + color;
    }

    // Additional methods (getters, setters) can be implemented as needed.
}
