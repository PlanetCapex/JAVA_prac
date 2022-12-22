package lab.lab41.zad1;
import java.util.Objects;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "1";
        while (!Objects.equals(input, "0")) {
            System.out.println("Введите название фигуры (Circle, Square, Rectangle). Для выхода 0.");
            input = sc.next();
            switch (input) {
                case ("Circle") -> {
                    System.out.println("Введите радиус: ");
                    int r = sc.nextInt();
                    Circle circ = new Circle(r);
                    System.out.println(circ.toString() + "\n");
                }
                case ("Square") -> {
                    System.out.println("Введите сторону: ");
                    int a = sc.nextInt();
                    Square sq = new Square(a);
                    System.out.println(sq.toString() + "\n");
                }
                case ("Rectangle") -> {
                    System.out.println("Введите две стороны: ");
                    int c = sc.nextInt();
                    int b = sc.nextInt();
                    Rectangle rect = new Rectangle(c, b);
                    System.out.println(rect.toString() + "\n");
                }
                default -> {
                    System.out.println("Фигура не найдена\n");
                }
            }
        }
    }
}
