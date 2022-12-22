package ru.mirea.lab7.n4;
import java.util.Scanner;

public class TestCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число(double) и степень(int): ");
        double num = sc.nextDouble();
        int grad = sc.nextInt();
        MathFunc math = new MathFunc();
        System.out.println(math.pow(num, grad));
        System.out.println("Введите число(double) для получения модуля: ");
        num = sc.nextDouble();
        System.out.println(math.abs(num));
        System.out.println("Введите радиус(double) окружности для вычисления площади и длины: ");
        num = sc.nextDouble();
        System.out.println(math.PI() * math.pow(num, 2));
        System.out.println(2 * math.PI() * num);
    }
}
