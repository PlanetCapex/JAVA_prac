package ru.mirea.lab6.n3;

public class Laptop implements Nameable{
    private String name;

    public Laptop(String name) {
        this.name = name;
    }
    public String getName() { return this.name; }
}
