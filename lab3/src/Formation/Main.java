package Formation;

import MathandRandom.zad2.Circle;

import java.util.Scanner;

public class Main {
    static Shop shop = new Shop();
    static Scanner sc = new Scanner(System.in);

    public static void  set_shop(){
        System.out.println("Установите валюту для отображения цен: "+
                "\n1 - рубли" +
                "\n2 - доллар" +
                "\n3 - евро");
        int n = sc.nextInt();
        switch (n){
            case 1:
                shop.set_currency("RUB", 1);
                break;
            case 2:
                shop.set_currency("USD", 60);
                break;
            case 3:
                shop.set_currency("EUR", 60);
                break;
            default:
                shop.set_currency("RUB", 1);
        };
    }
    public static void main(String[] args) {
        set_shop();
        int n = 1;
        while (n != 0) {
            System.out.println("Введите номер команды:\n " +
                    "1 - Добавить товары в магазин\n " +
                    "2 - Посмотреть список товаров(и добавить их в корзину)\n " +
                    "3 - Посмотреть корзину\n " +
                    "4 - Установить регион для формирования цен\n " +
                    "5 - Подсчитать сумму корзины\n " +
                    "6 - Отчет о сотрудниках\n " +
                    "0 - Выход");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    shop.add_goods();
                    break;
                case 2:
                    shop.out_goods_list();
                    int x = 1;
                    while (x != 0){
                        System.out.println("Для добавления товара в корзину наберите его номер, для выхода введите 0: ");
                        x = sc.nextInt();
                        if(x > 0){
                            Goods adding_good = new Goods();
                            adding_good = shop.find_good(x-1);
                            if(adding_good != null){
                                shop.add_to_cart(adding_good);
                            }
                        }
                    }
                    break;
                case 3:
                    shop.show_cart();
                    break;
                case 4:
                    set_shop();
                    break;
                case 5:
                    System.out.println("Итоговая стоимость корзины: " + shop.check_out());
                    break;
                case 6:
                    shop.get_report();
                    break;
            }
        }
    }
}
