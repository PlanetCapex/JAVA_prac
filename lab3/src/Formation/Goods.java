package Formation;

public class Goods {
    private String name;
    private double price;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    @Override
    public String toString() {

        return " Товар \nНазвание - " + this.name + "\nОписание - " + this.description;
    }
}
