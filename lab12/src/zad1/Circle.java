package zad1;
import java.awt.*;
class Circle extends Shape {
    @Override
    public void randomFill() {
        super.randomFill();
        this.width = this.height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
