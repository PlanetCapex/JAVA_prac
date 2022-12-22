package zad1;

import java.util.Scanner;

public class TestAuthor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmpName = sc.next();
        String tmpEmail = sc.next();
        char tmpGender = sc.next().charAt(0);

        Author atr = new Author(tmpName, tmpEmail, tmpGender);
        System.out.print(atr.toString());
    }
}
