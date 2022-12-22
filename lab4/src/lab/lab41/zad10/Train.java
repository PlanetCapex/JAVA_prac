package lab.lab41.zad10;

public class Train extends Vehicle{

    public Train(int pricePerPerson, int pricePerKG, int kilometerPerHour) {
        super(pricePerPerson, pricePerKG, kilometerPerHour);
    }

    public int countPricePerPerson(int n) {
        return this.pricePerPerson * n;
    }

    public int countPricePerKG(int n) {
        return this.pricePerKG * n;
    }

    public double countTime(int kiloms) {
        return (kiloms + 5.0) / kilometerPerHour;
    }
}
