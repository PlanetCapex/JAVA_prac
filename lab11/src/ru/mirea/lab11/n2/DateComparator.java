package ru.mirea.lab11.n2;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class DateComparator {
    public static Date dateCompare(Date d1, Date d2) {
        if (d1.getTime() > d2.getTime()) return d1;
        return d2;

    }

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy-HH.mm.ss");
        System.out.println("Введите первую дату в формате dd.MM.yyyy-HH.mm.ss");
        String STRdate1 = sc.next();
        System.out.println("Введите вторую дату в формате dd.MM.yyyy-HH.mm.ss");
        String STRdate2 = sc.next();
        Date d1 = sdf.parse(STRdate1);
        Date d2 = sdf.parse(STRdate2);
        System.out.println(
                d1.getTime() > d2.getTime() ?
                        sdf.format(d1) + " больше, чем " + sdf.format(d2) :
                        sdf.format(d2) + " больше, чем " + sdf.format(d1)
        );
    }
}
