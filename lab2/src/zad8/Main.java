package zad8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите количестов элементов массива\n");
        n = sc.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            strings[i] = sc.next();
        }

        String tmp;
        for (int i = 0; i < (n / 2); i++) {
            tmp = strings[i];
            strings[i] = strings[n - i - 1];
            strings[n - i - 1] = tmp;
        }
        System.out.print("Перевернутый массив \n");
        for (int i = 0; i < n; i++) {
            System.out.print(strings[i] + " ");
        }

    }
}
