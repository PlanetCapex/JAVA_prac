package ru.mirea.lab6.n3;

public class TestNameable {
    public static void main(String[] args) {
        Nameable phone = new Phone("IPhone");
        Nameable laptop = new Laptop("MacBook");
        System.out.println(phone.getName());
        System.out.println(laptop.getName());
    }
}
