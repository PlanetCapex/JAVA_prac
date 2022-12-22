package zad2;

import java.awt.*;

public class Oval extends Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
