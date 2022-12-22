package zad2;

import java.util.Scanner;

public class Main {
    public static void output(int n, int j){
        if(n != j){
            System.out.println(j);
            output(n, j+1);
        }
        else {return;}
    }
    public static void main(String[] args) {
        System.out.println("Вывод чисел от 1 до n");
        System.out.println("Введите n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        output(n, 1);
    }
}
