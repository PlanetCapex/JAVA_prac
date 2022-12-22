package ru.mirea.lab6.n3;

public class Phone implements Nameable{
    private String name;

    public Phone(String name) {
        this.name = name;
    }
    public String getName() { return this.name; }
}
