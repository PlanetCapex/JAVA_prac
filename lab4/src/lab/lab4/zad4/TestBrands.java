package lab.lab4.zad4;
import java.util.Scanner;

public class TestBrands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Католог компьютеров по имени бренда: ");
        String name = "1";
        while (name != "0") {
            System.out.println("Выбор бренда пк (ACER, HP, MSI): ");
            name = sc.next();
            Brands br = Brands.valueOf(name);
            System.out.println("Компьютерные бренды " + br);
            for (Computer cp : br.computers) {
                System.out.print(br + " " + cp.toString());
            }
        }
    }
}
