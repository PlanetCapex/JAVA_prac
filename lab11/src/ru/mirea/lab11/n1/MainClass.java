package ru.mirea.lab11.n1;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию разработчика: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String surname = sc.next();
        System.out.println("Введите дату получения задания в формате dd.MM.yyyy");
        String start = sc.next();
        Date startDate = sdf.parse(start);
        Date endDate = new Date();

        System.out.println( startDate.getTime() <= endDate.getTime() ?
                "Разработчик " + surname + " получил задание " + sdf.format(startDate) + ", сдал его " + sdf.format(endDate) :
                "Ошибка даты");


    }
}
