package zad3and6;

import java.util.Scanner;
import java.util.ArrayList;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество кругов");
        System.out.println();
        int num = sc.nextInt();
        int x;
        int y;
        int r;

        ArrayList<Circle> circles = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.print("Введите координаты центра (точка x и y) и радиус\n");

            x = sc.nextInt();
            y = sc.nextInt();
            r = sc.nextInt();

            Point p = new Point(x, y);
            Circle tmpC = new Circle(p, r);
            circles.add(tmpC);
        }

        System.out.print("Площади кругов \n");
        for (int i = 0; i < circles.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.print(circles.get(i).countSquare() + "\n");
        }

        System.out.print("Длины кругов \n");

        for (int i = 0; i < circles.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.print(circles.get(i).countLength() + "\n");
        }

        System.out.print("Введите номера кругов для сравнения \n");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print("Результат сравнения по длине \n");
        Circle biggerL = circles.get(n1 - 1).compare_circles_length(circles.get(n2 - 1));
        if (biggerL == circles.get(n1 - 1)) {
            System.out.print("=>" + n1 + " больше " + n2);
        }
        else if (biggerL == circles.get(n2 - 1)) {
            System.out.print("=>" + n2 + " больше " + n1);
        }
        else {
            System.out.print("=> Круги равны");
        }
        System.out.print("\nРезультат сравнения по площади\n");
        Circle biggerS = circles.get(n1 - 1).compare_circles_length(circles.get(n2 - 1));
        if (biggerS == circles.get(n1 - 1)) {
            System.out.print("=>" + n1 + " больше " + n2);
        }
        else if (biggerS == circles.get(n2 - 1)) {
            System.out.print("=>" + n2 + " больше " + n1);
        }
        else {
            System.out.print("=> Круги равны");
        }

    }
}
