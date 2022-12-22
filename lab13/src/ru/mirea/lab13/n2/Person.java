package ru.mirea.lab13.n2;

public class Person {
    private String name;
    private String surname;
    private String patronymic; //Отчество

    Person(String fio) {
        this.surname = fio.substring(0, fio.indexOf(' '));
        this.name = fio.substring(fio.indexOf(' ') + 1, fio.lastIndexOf(' '));
        this.patronymic = fio.substring(fio.lastIndexOf(' ') + 1);
    }

    public String getFIO() {
        return this.surname + " " + this.name.charAt(0) + ". " + this.patronymic.charAt(0) + ".";
    }
}
