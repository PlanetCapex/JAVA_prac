package ru.mirea.lab6.n6_7_8_9;

public class Shop implements Printable{
    private String name;
    private String type;
    Shop(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void print() {
        System.out.println("Shop: " + this.name + "; Type: " + this.type);
    }
}
