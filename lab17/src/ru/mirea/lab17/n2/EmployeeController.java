package ru.mirea.lab17.n2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee m, EmployeeView v) {
        this.model = m;
        this.view = v;
    }

    public String getEmployeeName() { return model.getName(); }
    public void setEmployeeName(String name) { model.setName(name); }
    public int getEmployeeSalary() { return model.getSalary(); }
    public void setEmployeeHours(int h) { model.setHours(h); }
    public void setEmployeeRate(int r) {model.setRate(r); }
    public void countEmployeeSalary() { model.countSalary(); }
    public String updateView() { return view.printEmployeeDetails(model); }
}
