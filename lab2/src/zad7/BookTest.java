package zad7;

import java.util.Scanner;

public class BookTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String _name = sc.next();
        String _author = sc.next();
        int _id = sc.nextInt();
        int _year = sc.nextInt();

        Book bk = new Book(_name, _author, _id, _year);
        System.out.print(bk.toString());
    }
}
