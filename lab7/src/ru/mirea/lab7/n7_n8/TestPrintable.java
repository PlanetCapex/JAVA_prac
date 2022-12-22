package ru.mirea.lab7.n7_n8;
import java.util.ArrayList;

public class TestPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(new Book("Childhood", "Tolstoy"));
        arr.add(new Book("Captain's Daughter", "Pushkin"));
        arr.add(new Magazine("VOUGE", "woman magazine"));
        arr.add(new Magazine("FORBES", "men magazine"));
        for (Printable obj : arr) { obj.print(); }
    }
}
