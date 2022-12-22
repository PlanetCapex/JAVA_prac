package ru.mirea.lab6.n11;
import java.util.Scanner;

public class TestConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        String type = sc.next();
        ConvertClass convert = new ConvertClass(temp, type);
        convert.convert();
        System.out.println(convert);
    }
}
