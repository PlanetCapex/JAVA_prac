package ru.mirea.lab6.n4;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable car = new Car(3242500);
        Priceable house = new House(129345690);
        System.out.println(car.getPrice());
        System.out.println(house.getPrice());
    }
}
