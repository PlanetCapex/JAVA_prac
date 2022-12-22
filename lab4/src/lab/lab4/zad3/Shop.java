package lab.lab4.zad3;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Shop {

    public boolean Authorization() {
        System.out.println("Авторизация пользователя");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
            System.out.println("Введите имя пользователя: ");
            String log = sc.next();
            UsersBase user = UsersBase.valueOf(log);
            System.out.println("Введите пароль: ");
            String pass = sc.next();
            if (Objects.equals(user.getPassword(), pass)) {
                flag = true;
                System.out.println("C возвращением:  " + user);
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        Shop shop = new Shop();

        boolean authFlag = shop.Authorization();
        if (authFlag) {
            int inputProductID = 0;
            while (inputProductID == 0) {
                System.out.println("Доступные категории товаров\n");
                for (Catalog cat : Catalog.values()) {
                    System.out.println(cat);
                }
                System.out.println("Введите название нужной категории (переход в корзину введите MYCART): ");
                String catName = sc.next();
                if (!Objects.equals(catName, "MYCART")) {
                    Catalog targetCatalog = Catalog.valueOf(catName);
                    System.out.println("Категории:  " + targetCatalog);
                    targetCatalog.showCatalog();
                    System.out.print("\n\nВведите номер товара, чтобы добавить его в корзину или введите 0, чтобы вернуться к каталогам товаров ");
                    inputProductID = sc.nextInt();
                    if (inputProductID > 0) {
                        for (Product pr : targetCatalog.goods) {
                            if (pr.getID() == inputProductID) {
                                if(cart.contains(pr)){
                                    System.out.println("Товар уже в корзине!");
                                }
                                else {
                                    cart.add(pr);
                                    System.out.println("Товар добавлен в корзину!");
                                }
                                inputProductID = 0;
                            }
                        }
                    }
                }
                else {
                    if (cart.size() == 0) {
                        System.out.println("Пустая корзина!");
                        inputProductID = 0;
                    }
                    else {
                        for (Product pr : cart) {
                            System.out.println(pr.toString());
                        }
                        System.out.println("Введите BUY для оплаты товаров");
                        String word = sc.next();
                        if (Objects.equals(word, "BUY")) {
                            System.out.println("Введите номер банковской карты: ");
                            int cardNumber = sc.nextInt();
                            System.out.println("Введите срок действия карты: ");
                            String expiredDate = sc.next();
                            System.out.println("Введите CVV код: ");
                            int CVC = sc.nextInt();
                            System.out.println("Оплата успешна!!");
                            cart.clear();
                        }

                        else {
                            inputProductID = 0;
                        }
                    }
                }
            }
        }
    }
}
