package zad13;

public class Main {
    public static void even() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int m = sc.nextInt();
            System.out.println(n);
            if (m > 0) {
                even();
            }
        }
    }
    public static void main(String[] args) {
        even();
    }
}
