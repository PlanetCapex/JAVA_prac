package zad11;

import java.util.Scanner;

public class Main {
    static public int how_much() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            int m = sc.nextInt();
            if (m == 1) {
                return how_much() + 2;
            } else if (m == 0) {
                int k = sc.nextInt();
                if (k == 1) {
                    return how_much() + 2;
                } else if (k == 0) {
                    return 1;
                }
            }
        } else {
            int m = sc.nextInt();
            if (m == 1) {
                return how_much() + 1;
            } else if (m == 0) {
                return 0;
            }
        }
        return how_much();
    }
    public static void main(String[] args) {
        System.out.println(how_much());
    }
}
