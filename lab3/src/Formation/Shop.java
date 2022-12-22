package Formation;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Scanner;

public class Shop {
   private ArrayList<Goods> goods = new ArrayList<>();
   private ArrayList<Goods> cart = new ArrayList<>();

   private ArrayList<Employee> employees = new ArrayList<>(){{
       add(new Employee("Александр Огурцов", 40000));
       add(new Employee("Олег Повидлов", 30000));
       add(new Employee("Георгий Подлизов", 60000));
   }};
   CurrencyConvertor currencyConvertor = new CurrencyConvertor();
   Report report = new Report();
   Scanner scanner = new Scanner(System.in);

    public void add_goods(){
        System.out.println("Добавление товаров, введите количество добавляемых товаров: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Название -");
            String name = scanner.next();
            System.out.print("\nЦена (в рублях) -");
            double price = scanner.nextDouble();
            Goods good = new Goods(name, price);
            this.goods.add(good);
        }
    }

    public void add_to_cart(Goods good){
        this.cart.add(good);
        System.out.println("Товар успешно добавлен!");
    }

    public void out_goods_list(){
        int i = 1;
        for(Goods good:this.goods){
            System.out.print("№ " + i + good.toString() + "\nЦена - " + currencyConvertor.convert(good.getPrice()) +"\n");
            i++;
        }
    }
    public void show_cart(){
        int i = 1;
        for(Goods good:this.cart){
            System.out.print("№ " + i + good.toString() + "\nЦена - " + currencyConvertor.convert(good.getPrice()) +"\n");
            i++;
        }
    }

    public Goods find_good(int n){
        if(n <= this.goods.size() && n >= 0){
            return this.goods.get(n);
        }
        System.out.println("Товар не найден!!");
        return null;
    }

    public String check_out(){
        double sum = 0;
        for(Goods g: cart){
            sum += g.getPrice();
        }
        return currencyConvertor.convert(sum);
    }

    public void set_currency(String currency, int price_rel) {
        this.currencyConvertor.set_convertor(currency, price_rel);
    }

    public void get_report(){
        this.report.generateReport(this.employees);
    }
    public Shop(){

    }
}
