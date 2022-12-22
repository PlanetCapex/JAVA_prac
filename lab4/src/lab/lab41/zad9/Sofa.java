package lab.lab41.zad9;

public class Sofa extends Furniture{
    private int seatPlaces;

    public Sofa() {}

    public Sofa(int seatPlaces) { this.seatPlaces = seatPlaces; }

    public Sofa (String material, int price, int seatPlaces){
        super(material, price);
        this.seatPlaces = seatPlaces;
    }

    public int getPrice() {
        return this.price * seatPlaces;
    }

    @Override
    public String toString() {
        return "Дива: сделан из " + this.material + " Цена - "
                + this.price + " Посадочных мест - " + this.seatPlaces
                + "; Полная стоимость - " + (this.price * this.seatPlaces);
    }

}
