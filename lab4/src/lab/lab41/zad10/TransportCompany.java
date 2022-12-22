package lab.lab41.zad10;
import java.util.ArrayList;
import java.util.Scanner;

public class TransportCompany {

    static void get_info(String transport,  Vehicle trans, int personsAmount, int cargoWeight, int kilometers){
        System.out.println(transport + ": Цена за пассажиров: " + trans.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + trans.countPricePerKG(cargoWeight) +
                "; Время в пути: " + trans.countTime(kilometers));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle auto = new Auto(100, 50, 100);
        Vehicle plain = new Plain(3500, 150, 1500);
        Vehicle train = new Train(1000, 100, 220);
        Vehicle ship = new Ship(1500, 75, 45);

        System.out.println("Введите количество пассажиров");
        int personsAmount = sc.nextInt();
        System.out.println("Введите вес груза в килограммах");
        int cargoWeight = sc.nextInt();
        System.out.println("Введите километраж пути");
        int kilometers = sc.nextInt();

        get_info("Автомобиль", auto, personsAmount, cargoWeight, kilometers);
        get_info("Самолет", plain, personsAmount, cargoWeight, kilometers);
        get_info("Поезд", train, personsAmount, cargoWeight, kilometers);
        get_info("Корабль", ship, personsAmount, cargoWeight, kilometers);
    }
}
