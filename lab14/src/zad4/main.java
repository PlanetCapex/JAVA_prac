package zad4;
import java.util.Scanner;
import java.util.regex.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String regex = "[0-9]+[ ]*[+]";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(s);
        if (m.find()) {
           System.out.println("Найдено");
        }
        else {
            System.out.println("Не найдено");
        }
    }
}
