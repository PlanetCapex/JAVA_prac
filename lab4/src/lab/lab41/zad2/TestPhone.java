package lab.lab41.zad2;
import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = 1;
        String mark;
        String mod;
        int weight;
        while (number != 0) {
            System.out.println("Введите номер, марку (Huawei, Xiaomi, Honor), модель и вес телефона");
            number = sc.nextLong();
            if (number != 0) {
                mark = sc.next();
                mod = sc.next();
                weight = sc.nextInt();
                switch(mark) {
                    case ("Xiaomi") -> {
                        Xiaomi xiaomi = new Xiaomi(7, mod, weight);
                        System.out.println("Телефон " + mark + " " + xiaomi.toString());
                        xiaomi.receiveCall("Вассилий");
                        xiaomi.receiveCall("Иван", 423412543);
                        xiaomi.sendMessage(53453254, 4315251, 4315251, 324513124, 4365346, 53453254, 4315251);
                    }
                    case ("Huawei") -> {
                        Huawei huawei = new Huawei(number, mod, weight);
                        System.out.println("Телефон " + mark + " " + huawei.toString());
                        huawei.receiveCall("Влад");
                        huawei.receiveCall("Карпов", 423412543);
                        huawei.sendMessage(53453254, 4315251, 4315251, 324513124, 4365346, 53453254, 4315251);
                    }
                    case ("Honor") -> {
                        Honor honor = new Honor(number, mod, weight);
                        System.out.println("Телефон " + mark + " " + honor.toString());
                        honor.receiveCall("Неизвестно");
                        honor.receiveCall("Петр", 845131554);
                        honor.sendMessage(53453254, 4315251, 4315251, 324513124, 4365346, 53453254, 4315251);
                    }
                }
            }
        }
    }
}
