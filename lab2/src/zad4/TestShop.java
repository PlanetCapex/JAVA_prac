package zad4;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args){
        Shop shop = new Shop();
        int n = 1;
        Scanner sc = new Scanner(System.in);
        while(n != 0) {
            System.out.println("Введите номер команды:\n" +
                    "1 - добавить новый компьютер\n " +
                    "2 - удалить компьютер\n " +
                    "3 - найти компьютер\n " +
                    "4 - вывести базу компьютеров\n " +
                    "0 - выход");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    shop.add_computer();
                    break;
                case 2:
                    shop.delete_computer();
                    break;
                case 3:
                    shop.find_computer();
                    break;
                case 4:
                    shop.all_computers();
                    break;
            }
        }
    }
}
