package lab.lab41.zad1;

public class Square extends Shape{
    private double a;

    public Square(int a) {
        this.a = a;
    }

    public String getType() {
        return "Square";
    }

    public double getArea() {
        return Math.pow(this.a, 2.0);
    }

    public double getPerimeter() {
        return 4 * this.a;
    }

    public String toString() {
        return this.getType() + "; Area: " + this.getArea() + "; Per: " + this.getPerimeter();
    }
}
