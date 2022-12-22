package ru.mirea.lab6.n6_7_8_9;
import java.util.ArrayList;

public class TestPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(new Book("Childhood", "Tolstoy"));
        arr.add(new Book("Captain's Daughter", "Pushkin"));
        arr.add(new Shop("ZARA", "clothes"));
        arr.add(new Shop("Perekrestok", "food"));
        for (Printable obj : arr) { obj.print(); }
    }
}
