package lab.lab41.zad1;

public class Circle extends Shape{
    private double radius;

    public Circle(int _r) {
        this.radius = _r;
    }

    public String getType() {
        return "Circle";
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return this.getType() + "; Area: " + this.getArea() + "; Per: " + this.getPerimeter();
    }
}
