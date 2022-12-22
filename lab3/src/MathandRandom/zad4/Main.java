package MathandRandom.zad4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (n <= 0){
            System.out.println("Введите число n: ");
            n = scanner.nextInt();
            if (n <= 0){
                System.out.println("Введите число больше нуля ");
            }
        }
        for(int i=0; i < n; i++){
            numbers.add((int)(Math.random()*n));
        }
        System.out.println("Сгеннерированный массив: ");
        numbers.forEach((num) -> System.out.print(num+" "));
        ArrayList<Integer> even_numbers = new ArrayList<>();
        for(int num:numbers){
            if (num % 2 == 0){
                even_numbers.add(num);
            }
        }
        System.out.println("\nТолько четные элементы массива: ");
        even_numbers.forEach((num) -> System.out.print(num+" "));
    }
}
