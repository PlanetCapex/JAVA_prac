package ru.mirea.lab7.n7_n8;

public class Book implements Printable{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public void print() {
        System.out.println("Book " + this.name + " written by " + this.author);
    }

    @Override
    public String toString() {
        return "Book " + this.name + " written by " + this.author;
    }

    static public void printBooks(Printable[] print) {
        for (Printable obj : print) {
            if (obj instanceof Book) {
                System.out.println(obj.toString());
            }
        }
    }
}
