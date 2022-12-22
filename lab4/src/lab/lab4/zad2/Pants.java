package lab.lab4.zad2;

public class Pants extends Clothes implements MenClothes, WomanClothes {
    public void dressMan() {
        System.out.println("Брюки: Цена = " + this.getPrice() + "; Цвет = " + this.getColor() + "; Размер = " + this.getEuroSize());
    }
    public void  dressWoman(){
        System.out.println("Брюки: Цена = " + this.getPrice() + "; Цвет = " + this.getColor() + "; Размер = " + this.getEuroSize());
    }
    public Pants(String size, int price, String color) {
        super(size, price, color);
    }
}
