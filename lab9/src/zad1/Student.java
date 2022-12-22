package zad1;

public class Student {
    private String name;
    private  String surname;
    private  int iDNumber;

    private int GPA;

    public Student(String name, String surname, int iDNumber, int GPA) {
        this.name = name;
        this.surname = surname;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "№ " + this.iDNumber + " Студент: " + this.name + " " + this.surname + " Баллы = " +this.GPA;
    }
}
