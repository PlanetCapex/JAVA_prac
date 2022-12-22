package ru.mirea.lab17.n1;

public class StudentController {
    public Student model;
    public StudentView view;

    public StudentController(Student m, StudentView v) {
        this.model = m;
        this.view = v;
    }

    public String getStudentName() { return model.getName(); }
    public void setStudentName(String name) { model.setName(name); }
    public int getStudentNumber() { return model.getRollNo(); }
    public void setStudentNumber(int num) { model.setRollNo(num); }
    public void updateView() {
        view.printStudentDetails(model.getRollNo(), model.getName());
    }
}
