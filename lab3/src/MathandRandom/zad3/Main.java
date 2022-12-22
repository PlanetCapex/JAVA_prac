package MathandRandom.zad3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 4; i ++){
            numbers.add(10 + (int)(Math.random()*89));
        }
        numbers.forEach((num) -> System.out.print(num+" "));
        boolean flag = true;
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i)<=numbers.get(i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
