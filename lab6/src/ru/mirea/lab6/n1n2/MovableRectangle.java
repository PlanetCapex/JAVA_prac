package ru.mirea.lab6.n1n2;

public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public String toString() {
        return "Rectangle: topLeft point: " + topLeft.toString() +
                "; bottomRight point: " + bottomRight.toString();
    }
}
