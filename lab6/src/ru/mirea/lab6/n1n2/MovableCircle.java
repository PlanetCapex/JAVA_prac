package ru.mirea.lab6.n1n2;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp() { center.moveUp(); }
    public void moveLeft() { center.moveLeft(); }
    public void moveRight() { center.moveRight(); }
    public void moveDown() { center.moveDown(); }
}
