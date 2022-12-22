package zad3and6;

public class Circle {
    private int num;
    private Point point;
    private int radius;
    private double square;
    private double length;

    public Circle(Point p, int r) {
        this.point = p;
        this.radius = r;
    }

    public double countSquare() {
        this.square = Math.PI * this.radius * this.radius;
        return this.square;
    }

    public double countLength() {
        this.length = 2 * Math.PI * this.radius;
        return this.length;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle compare_circles_square(Circle c) {
        if(this.square > c.square) {
            return this;
        }
        else if (this.square < c.square) {
            return c;
        }
        else { return new Circle(new Point(0, 0), 0); }
    }

    public Circle compare_circles_length(Circle c) {
        if(this.length > c.length) {
            return this;
        }
        else if (this.length < c.length) {
            return c;
        }
        else { return new Circle(new Point(0, 0), 0); }
    }


}

