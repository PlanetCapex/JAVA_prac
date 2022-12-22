package zad3;

import java.util.Scanner;
import java.util.regex.*;

public class main {
    public static void main(String[] args) {
        String regex = "(\\d+\\.\\d{2} (USD|EUR|RUB))";
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
            while (m1.find()) {
                System.out.println("Список цен: " + m1.group());
            }
    }
}
