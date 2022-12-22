package zad4;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements ShopInterface {
        ArrayList<Computer> computers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public void add_computer() {
            System.out.println("Введите название компьютера и номер модели");
            String name = sc.next();
            int num = sc.nextInt();
            Computer computer = new Computer(num, name);
            computers.add(computer);
            System.out.println("Компьютер добавлен");
        }
        public void delete_computer() {
            System.out.println("Введите номер модели компьютера, который хотите удалить");
            int num = sc.nextInt();
            for (int i = 0; i < computers.size(); i++) {
                if (computers.get(i).getNum() == num) {
                    computers.remove(i);
                    System.out.println("Компьютер удален");
                }
            }
        }
        public void find_computer() {
            System.out.println("Введите номер компьютера, который хотите найти");
            int num = sc.nextInt();
            for (int i = 0; i < computers.size(); i++) {
                if (computers.get(i).getNum() == num) {
                    System.out.println("Найденый компьютер: " + computers.get(i).getNum() + "-" + computers.get(i).getName());
                }
            }
        }
        public void all_computers() {
            System.out.println("База компьютеров:");
            computers.forEach(System.out::print);
        }
    }
