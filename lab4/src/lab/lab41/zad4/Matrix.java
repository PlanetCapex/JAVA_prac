package lab.lab41.zad4;
import java.util.Scanner;

public class Matrix {
    private int[][] matrix = new int[10][10];
    private int col;
    private int row;

    public Matrix(int c, int r) {
        Scanner sc = new Scanner(System.in);
        int num;
        this.col = c;
        this.row = r;
        System.out.println("Введите матрицу");
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                num = sc.nextInt();
                matrix[i][j] = num;
            }
        }
    }

    public void input_matrix() {
        System.out.println("Введите матрицу");
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                num = sc.nextInt();
                matrix[i][j] = num;
            }
        }
    }

    public void output_matrix() {
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void matrix_sum(Matrix mt) {
        if (this.col == mt.col && this.row == mt.row){
            for (int i = 0; i < this.col; i++) {
                for (int j = 0; j < this.row; j++) {
                    this.matrix[i][j] += mt.matrix[i][j];
                }
            }
        }
        else {
            System.out.println("Размерности матриц не равны!!\n");
        }
    }

    public void matrix_multiplication(int num) {
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }
}
