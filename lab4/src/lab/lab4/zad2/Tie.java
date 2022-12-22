package lab.lab4.zad2;

public class Tie extends Clothes implements MenClothes{
    public void dressMan() {
        System.out.println("Галстук: Цена = " + this.getPrice() + "; Цвет = " + this.getColor() + "; Размер = " + this.getEuroSize());
    }
    public Tie(String size, int price, String color) {
        super(size, price, color);
    }
}
