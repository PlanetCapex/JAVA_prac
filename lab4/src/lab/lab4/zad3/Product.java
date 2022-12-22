package lab.lab4.zad3;

public class Product {
    private String name;
    private String color;
    private int price;
    private int ID;

    Product(String name, String color, int price, int id) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.ID = id;
    }

    public int getID() {
        return this.ID;
    }

    @Override
    public String toString(){
        return "№ = " + this.ID + ": Название - " + this.name + " Цвет - " + this.color + " Цена - " + this.price;
    }
}
