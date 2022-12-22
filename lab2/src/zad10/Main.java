package zad10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int count = 0;
        System.out.print("Введите несколько слов: \n");
        s = sc.nextLine();

        for(int i = 0; i < s.length() - 1; i++) {
            if (i != 0 && s.charAt(i) == ' '){
                count++;
            }
        }
        if (s != null){
            count++;
        }
        System.out.printf("Вы ввели %s слов", count);
    }
}
