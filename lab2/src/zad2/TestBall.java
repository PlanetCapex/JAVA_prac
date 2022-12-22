package zad2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args){
        double x, y;
        int n = 1;
        System.out.println("Тестирование класса");
        Scanner source = new Scanner(System.in);
        System.out.println("Создание класса, введите x и y");
        x = source.nextDouble();
        y = source.nextDouble();
        Ball TestBall = new Ball(x,y);
        System.out.println("Тестирование класса");
        while(n != 0){
            System.out.println("Функционал класса \n 0. Выход \n 1. Получить значение x \n 2. Получить значение y\n" +
                    "3. Установить  значение x\n"+
                    "4. Установить  значение y\n"+
                    "5. Установить  значение x и y\n" +
                    "6. Передвижение мяча\n"+
                    "7. Вывод класса в строку\n");
            n = source.nextInt();
            switch (n){
                case 1:
                    System.out.println(TestBall.getX());
                    break;
                case 2:
                    System.out.println(TestBall.getY());
                    break;
                case 3:
                    System.out.println("Введите x");
                    x = source.nextDouble();
                    TestBall.setX(x);
                    break;
                case 4:
                    System.out.println("Введите y");
                    y = source.nextDouble();
                    TestBall.setY(y);
                    break;
                case 5:
                    System.out.println("Введите x & y");
                    x = source.nextDouble();
                    y = source.nextDouble();
                    TestBall.setXY(x,y);
                    break;
                case 6:
                    System.out.println("Введите коэфициент движения по x & y");
                    x = source.nextDouble();
                    y = source.nextDouble();
                    TestBall.move(x, y);
                    break;
                case 7:
                    System.out.println(TestBall.toString());
                    break;


            }
        }

    }
}
