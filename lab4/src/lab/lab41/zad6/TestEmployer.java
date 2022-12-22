package lab.lab41.zad6;

public class TestEmployer {
    public static void main(String[] args) {
        Employer[] employers = new Employer[3];
        employers[0] = new Manager("Григорий", "Шапков", 13345, 1000);
        employers[1] = new Employer("Иван", "Иванов", 67000);
        employers[2] = new Manager("Василий", "Огурцов", 50000, 3500);

        for(Employer emp : employers) {
            System.out.println(emp.getSalary());
        }
    }
}
