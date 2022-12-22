package MathandRandom.zad2;


public class Circle {
    private Point point = new Point();
    private double radius;
    private double length;

    public void add_point(int x, int y){
        this.point.setX(x);
        this.point.setY(y);
    }

    public Circle() {
        this.radius = 1+Math.random()*100;
        this.length = this.radius*2*Math.PI;
    }

    public double getLength() {
        return length;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Окружность: \n"+
                "Кординаты точки x= "+ this.point.getX() +" y= " + this.point.getY() +
                "\nРадиус = " + this.radius +
                "\nДлина = " + this.length;
    }
}
