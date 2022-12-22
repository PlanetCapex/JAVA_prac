package zad7;

public class Book {
    private String name;
    private String author;
    private int id;
    private int year;

    public Book(String name, String author, int id, int year) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.year = year;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Книга: \nНомер: " + this.id + "\n" + this.name + " написанна " +
                this.author + " в " + this.year + "\n";
    }
}
