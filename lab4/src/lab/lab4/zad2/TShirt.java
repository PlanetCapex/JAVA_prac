package lab.lab4.zad2;

public class TShirt extends Clothes implements MenClothes, WomanClothes {
    public void dressMan() {
        System.out.println("Футболка: Цена = " + this.getPrice() + "; Цвет = " + this.getColor() + "; Размер = " + this.getEuroSize());
    }
    public void  dressWoman(){
        System.out.println("Футболка: Цена = " + this.getPrice() + "; Цвет = " + this.getColor() + "; Размер = " + this.getEuroSize());
    }

    public TShirt(String size, int price, String color) {
        super(size, price, color);
    }
}
