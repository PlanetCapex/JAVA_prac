package lab.lab4.zad1;
import java.util.Scanner;

public class timesOfYear {
    public enum Years {
        Summer(30, "Жара, солнце, море"),
        Autumn(15, "Снова в универ"),
        Winter(-20, "Новый год"),
        Spring(5, "Слякоть, расстаевший снег");

        private int averageTemp;
        private String description;

        Years(int temp, String desc) {
            this.averageTemp = temp;
            this.description = desc;
        }

        public int getAverageTemp() {
            return averageTemp;
        }

        public String getDescription() {
            return description;
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yearTime;
        System.out.print("Введите любимое время года\n");
        yearTime = sc.next();
        Years years = Years.valueOf(yearTime);
        switch (years) {
            case Summer -> System.out.println("Я люблю Лето!");
            case Autumn -> System.out.println("Я люблю Осень!");
            case Winter -> System.out.println("Я люблю Зиму!");
            case Spring -> System.out.println("Я люблю Весну!");
        }

        System.out.println("Все времена года: \n");
        for (Years times : years.values()){
            System.out.println(times + "; Температура = " + times.getAverageTemp() + "; " + times.getDescription());
        }

    }
}
