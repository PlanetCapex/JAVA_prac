package ru.mirea.lab6.n6_7_8_9;

public class Book implements Printable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public void print() {
        System.out.println("Book " + this.name + " written by " + this.author);
    }
}
