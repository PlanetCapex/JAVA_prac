package ru.mirea.lab6.n4;

public class Car implements Priceable{
    private int price;
    Car(int Price) { this.price = Price; }
    public int getPrice() { return this.price; }
}
