package ru.mirea.lab6.n1n2;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint() {}

    MovablePoint(int _x, int _y, int _xSpeed, int _ySpeed) {
        this.x = _x;
        this.y = _y;
        this.xSpeed = _xSpeed;
        this.ySpeed = _ySpeed;
    }

    public void moveUp() { this.y++; }
    public void moveLeft() { this.x--; }
    public void moveRight() { this.x++; }
    public void moveDown() { this.y--; }

    @Override
    public String toString() { return "X: " + this.x + "; Y: " + this.y; }
}
