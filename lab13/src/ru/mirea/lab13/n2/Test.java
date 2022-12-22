package ru.mirea.lab13.n2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String fio;
        Scanner sc = new Scanner(System.in);
        fio = sc.nextLine();
        Person pers = new Person(fio);
        System.out.println(pers.getFIO());
    }
}
