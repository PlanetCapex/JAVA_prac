package ru.mirea.lab6.n4;

public class House implements Priceable{
    private int price;
    House(int price) { this.price = price; }
    public int getPrice() { return this.price; }
}
