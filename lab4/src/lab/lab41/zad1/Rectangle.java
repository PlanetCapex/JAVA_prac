package lab.lab41.zad1;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getArea() {
        return this.a * this.b;
    }

    public double getPerimeter() {
        return 2 * (this.a + this.b);
    }

    public String toString() {
        return this.getType() + "; Area: " + this.getArea() + "; Per: " + this.getPerimeter();
    }
}
