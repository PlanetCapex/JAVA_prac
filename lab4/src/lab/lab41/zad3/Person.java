package lab.lab41.zad3;

public class Person {
    private String fullName;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.fullName = name;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Человек " + this.fullName + " шагает");
    }

    public void talk() {
        System.out.println("Человек " + this.fullName + " разговаривает");
    }

    @Override
    public String toString() {
        return this.fullName + " " + this.age;
    }
}
