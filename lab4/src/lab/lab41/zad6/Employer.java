package lab.lab41.zad6;

public class Employer {
    private String firstName;
    private String lastName;
    private int salary;

    public Employer() {}

    public Employer(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
