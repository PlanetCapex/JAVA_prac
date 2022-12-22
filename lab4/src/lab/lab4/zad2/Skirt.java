package lab.lab4.zad2;

public class Skirt extends Clothes implements WomanClothes{
    public void dressWoman(){
        System.out.println("Юбка: Цена = " + this.getPrice() + "; Цвет = " + this.getColor() + "; Размер = " + this.getEuroSize());
    }
    public Skirt(String size, int price, String color) {
        super(size, price, color);
    }
}
