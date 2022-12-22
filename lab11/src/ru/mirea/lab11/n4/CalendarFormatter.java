package ru.mirea.lab11.n4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarFormatter {
    public static Calendar getFormattedCalendar(String str) {
        int pointsCounter = 0;

        StringBuilder year = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder day = new StringBuilder();
        StringBuilder hours = new StringBuilder();
        StringBuilder minutes = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symb = str.charAt(i);
            switch(pointsCounter) {
                case(0):
                    if (str.charAt(i) == '.') pointsCounter++;
                    else year.append(symb);
                    break;
                case(1):
                    if (str.charAt(i) == '.') pointsCounter++;
                    else month.append(symb);
                    break;
                case(2):
                    if (str.charAt(i) == '.') pointsCounter++;
                    else day.append(symb);
                    break;
                case(3):
                    if (str.charAt(i) == '.') pointsCounter++;
                    else hours.append(symb);
                    break;
                case(4):
                    if (str.charAt(i) == '.') pointsCounter++;
                    else minutes.append(symb);
                    break;
                default:
                    System.out.println("Ошибка");
            }
            //            if (pointsCounter == 0) {
//                if (str.charAt(i) == '.') pointsCounter++;
//                else year.append(str.charAt(i));
//            }
//            if (pointsCounter == 1) {
//                if (str.charAt(i) == '.') pointsCounter++;
//                else month.append(str.charAt(i));
//            }
//            if (pointsCounter == 2) {
//                if (str.charAt(i) == '.') pointsCounter++;
//                else day.append(str.charAt(i));
//                break;
//            }
//            if (pointsCounter == 3) {
//                if (str.charAt(i) == '.') pointsCounter++;
//                else hours.append(str.charAt(i));
//
        }
        int yearInt = Integer.parseInt(String.valueOf(year));
        int monthInt = Integer.parseInt(String.valueOf(month));
        int dayInt = Integer.parseInt(String.valueOf(day));
        int hoursInt = Integer.parseInt(String.valueOf(hours));
        int minInt = Integer.parseInt(String.valueOf(minutes));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, yearInt);
        switch (monthInt) {
            case (1)-> { cal.set(Calendar.MONTH, Calendar.JANUARY); }
            case (2)-> { cal.set(Calendar.MONTH, Calendar.FEBRUARY); }
            case (3)-> { cal.set(Calendar.MONTH, Calendar.MARCH); }
            case (4)-> { cal.set(Calendar.MONTH, Calendar.APRIL); }
            case (5)-> { cal.set(Calendar.MONTH, Calendar.MAY); }
            case (6)-> { cal.set(Calendar.MONTH, Calendar.JUNE); }
            case (7)-> { cal.set(Calendar.MONTH, Calendar.JULY); }
            case (8)-> { cal.set(Calendar.MONTH, Calendar.AUGUST); }
            case (9)-> { cal.set(Calendar.MONTH, Calendar.SEPTEMBER); }
            case (10)-> { cal.set(Calendar.MONTH, Calendar.OCTOBER); }
            case (11)-> { cal.set(Calendar.MONTH, Calendar.NOVEMBER); }
            case (12)-> { cal.set(Calendar.MONTH, Calendar.DECEMBER); }
        }
        cal.set(Calendar.DAY_OF_MONTH, dayInt);
        cal.set(Calendar.HOUR, hoursInt);
        cal.set(Calendar.MINUTE, minInt);
        return cal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        System.out.println("Введите дату в формате Год.Месяц.Число.Часы.Минуты");
        String STRDate = "2000.02.23.09.34";
        Calendar cal = getFormattedCalendar(STRDate);
        System.out.println(sdf.format(cal.getTime()));
    }
}
