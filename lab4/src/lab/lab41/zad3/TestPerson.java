package lab.lab41.zad3;
import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        Person pers1 = new Person();
        System.out.println("Введите имя и возраст первого человека: ");
        name = sc.next();
        age = sc.nextInt();
        pers1.setFullName(name);
        pers1.setAge(age);
        pers1.move();
        pers1.talk();

        System.out.println("Введите имя и возраст второго человека: ");
        name = sc.next();
        age = sc.nextInt();
        Person pers2 = new Person(name, age);
        pers2.move();
        pers2.talk();
    }
}
