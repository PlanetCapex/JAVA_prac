package lab.lab4.zad2;

public class Atelier {
    public static void main(String[] args) {
        TShirt tshirt = new TShirt("XXS", 1600, "Желтый");
        Tie tie = new Tie("S", 2000, "Зеленый");
        Skirt skirt = new Skirt("M", 4500, "Белый");
        Pants pants = new Pants("L", 2500, "Черный");

        Clothes[] clothes = {tshirt, tie, skirt, pants};

        System.out.println("Перечень женской одежды : ");
        Clothes.dressWoman(clothes);
        System.out.println();
        System.out.println("Перечень мужской одежды : ");
        Clothes.dressMan(clothes);
    }
}
