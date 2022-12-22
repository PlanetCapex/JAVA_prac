package ru.mirea.lab17.n2;

public class EmployeeView {
    public String printEmployeeDetails(Employee emp) {
        return "Name: " + emp.getName() +
                " Salary: " + emp.getSalary() + "\n";
    }
}
