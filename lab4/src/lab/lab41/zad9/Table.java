package lab.lab41.zad9;

public class Table extends Furniture{
    private int size;

    public Table() {}

    public Table(int size) {
        this.size = size;
    }

    public Table(String material, int price, int size) {
        super(material, price);
        this.size = size;
    }

    public int getPrice() {
        return this.price * size;
    }

    @Override
    public String toString() {
        return "Стол: сделан из " + this.material + "; Цена - "
                + this.price + "; Размер - " + this.size
                + "; Полная стоимость - " + (this.price * this.size);
    }
}
