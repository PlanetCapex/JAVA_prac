package lab.lab41.zad4;
import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количесвто столбцов и строк первой матрицы: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        Matrix m1 = new Matrix(col, row);
        System.out.println("Введите количесвто столбцов и строк первой матрицы: ");
        row = sc.nextInt();
        col = sc.nextInt();
        Matrix m2 = new Matrix(col, row);
        System.out.println("Сумма матриц");
        m1.matrix_sum(m2);
        m1.output_matrix();
        System.out.println("Умножение первой матрицы на 2");
        m1.matrix_multiplication(2);
        m1.output_matrix();
    }
}
