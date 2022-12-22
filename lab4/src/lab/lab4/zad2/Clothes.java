package lab.lab4.zad2;

import lab.lab4.zad1.timesOfYear;

public class Clothes {

    public enum Size {
        XXS(32) {
            public String getDescription() {
                return "Детский размер";
            }
        },
        XS(34), S(36), M(38), L(40);

        public final int euroSize;

        Size(int euroSize) {
            this.euroSize = euroSize;
        }
        public int getEuroSize(){
            return this.euroSize;
        }

        public String getDescription() {
            return "Взрослый размер";
        }

    }
    private int price;
    private String color;

    private String size;
    Clothes(String size, int price, String color) {
        this.price = price;
        this.color = color;
        this.size = size;
    }


    public String getEuroSize(){
        Size eurosize = Size.valueOf(this.size);

        return eurosize.getEuroSize() +" ("+eurosize.getDescription()+")";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void dressWoman(Clothes [] clothes){
        for(Clothes clothes1: clothes ){
            if( clothes1 instanceof WomanClothes){
                ((WomanClothes) clothes1).dressWoman();
            }
        }
    }
    public static void dressMan(Clothes [] clothes){
        for (Clothes clothesMAN: clothes){
            if( clothesMAN instanceof MenClothes){
                ((MenClothes) clothesMAN).dressMan();
            }
        }
    }
}
