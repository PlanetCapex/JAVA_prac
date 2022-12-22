package ru.mirea.lab17.n2;

public class Employee {
    private String name;
    private int hours;
    private int rate;
    private int salary;
    public Employee(String name, int hours, int rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getHours() { return hours; }

    public void setHours(int hours) { this.hours = hours; }

    public int getRate() { return rate; }

    public void setRate(int rate) { this.rate = rate; }

    public int getSalary() { return this.salary; }

    public void countSalary() { this.salary = this.hours * this.rate; }
}
