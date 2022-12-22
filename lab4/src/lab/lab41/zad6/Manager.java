package lab.lab41.zad6;

public class Manager extends Employer{
    private double averageSum;

    public Manager(String firstName, String lastName, int salary, double averageSum) {
        super(firstName, lastName, salary);
        this.averageSum = averageSum;
    }

    public double getSalary() {
        return super.getSalary() + this.averageSum;
    }
}
