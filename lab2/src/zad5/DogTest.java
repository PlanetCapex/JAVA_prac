package zad5;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        int n = -1;
        Scanner scanner = new Scanner(System.in);
        while(n != 0) {
            System.out.println("Введите номер команды:" +
                    "\n 1 - добавить собачку" +
                    "\n 2 - перевести возраст собаки в человеческий" +
                    "\n 3 - вывести имена и возраст собак питомника" +
                    "\n 0 - выход");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    kennel.add_dog();
                    break;
                case 2:
                    System.out.println("Введите кличку собаки, возраст которой хотите перевести в человеческий");
                    Dog dog = kennel.find_dog();
                    System.out.println("Человеческий возраст: " + dog.convert_ages());
                    break;
                case 3:
                    kennel.show_dogs();
                    break;
            }
        }
    }
}
