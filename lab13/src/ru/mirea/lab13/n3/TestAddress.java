package ru.mirea.lab13.n3;
import java.util.Scanner;

public class TestAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите разедлитель: ");
        String sep = sc.nextLine();
        System.out.println("Введите строку адреса с указанными разделителями: ");
        String fullAddress = sc.nextLine();
        Address adr = new Address(fullAddress, sep);
        System.out.println(adr.getCountry());
        System.out.println(adr.getDistrict());
        System.out.println(adr.getCity());
        System.out.println(adr.getStreet());
        System.out.println(adr.getHouse());
        System.out.println(adr.getBuilding());
        System.out.println(adr.getFlat());
    }
}
