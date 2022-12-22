package MathandRandom.zad2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Tester tester = new Tester();
        int n = 1;
        Scanner sc = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Введите номер команды:\n " +
                    "1 - найти наибольшую окружность\n " +
                    "2 - найти наименьшую окружность\n " +
                    "3 - упорядочить окружности\n " +
                    "4 - вывести все окружности\n " +
                    "0 - выход");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    Circle circle_max = tester.find_max();
                    System.out.println(circle_max.toString());
                    break;
                case 2:
                    Circle circle_min = tester.find_min();
                    System.out.println(circle_min.toString());
                    break;
                case 3:
                    tester.sort_circle();
                    break;
                case 4:
                    tester.all_circles();
                    break;
            }
        }
    }
}