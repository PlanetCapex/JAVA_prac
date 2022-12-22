package zad2;
import java.awt.*;
class Rect extends Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
