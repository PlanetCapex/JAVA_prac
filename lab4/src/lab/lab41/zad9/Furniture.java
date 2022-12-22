package lab.lab41.zad9;

public abstract class Furniture {
    protected String material;
    protected int price;
    public Furniture() {}

    public Furniture(String material, int price) {
        this.material = material;
        this.price = price;
    }

    abstract int getPrice();

    public String toString() {
        return this.material + " " + this.price;
    }
}
