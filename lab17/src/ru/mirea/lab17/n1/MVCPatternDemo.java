package ru.mirea.lab17.n1;

public class MVCPatternDemo {
    public static Student retrieveStudentFromDatabase() {
        return new Student(354553, "demoStudent");
    }

    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Patric");
        System.out.println("After update: ");
        controller.updateView();
    }
}
