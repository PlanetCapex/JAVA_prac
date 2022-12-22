package MathandRandom.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void out_array(ArrayList<Double> numbers){
        System.out.println("Неотсортированный массив: ");
        numbers.forEach((num)-> print(num));
        System.out.println("\nОтсортированный массив: ");
        Collections.sort(numbers);
        numbers.forEach((num)-> print(num));
    }
    public static void print(double num){
        System.out.println(num + " ");
    }
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        int n = (int)(Math.random()*10);
        for (int i = 0; i < n; i++){
            numbers.add(Math.random()*100);
        }
        out_array(numbers);
        Random random = new Random();
        numbers.clear();
        for (int i = 0; i < n; i++){
            numbers.add(random.nextDouble()*100);
        }
        System.out.println("-----------------");
        out_array(numbers);
        
    }
}
