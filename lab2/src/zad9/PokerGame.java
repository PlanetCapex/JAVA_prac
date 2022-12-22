package zad9;

import java.util.Random;
import java.util.Scanner;

public class PokerGame {
    public static void main(String[] args) {
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♠", "♥", "♣", "♦"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков\n");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Player №" + (i + 1) + " cards: ");
            for(int j = 0; j < 5; j++) {
                String randcart = suits[random.nextInt(4)] + nums[random.nextInt(13)];
                System.out.print(randcart + " ");
            }
            System.out.println();
        }

    }
}
