package ru.mirea.lab13.n4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    Shirt(String str) {
        String[] info = str.split(",");
        this.id = info[0];
        this.name = info[1];
        this.color = info[2];
        this.size = info[3];
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name +
                "; color: " + this.color + "; size: " + this.size;
    }
}
