package zad4;

public class Stud implements Comparable<Stud> {
    private String name;
    private  String surname;
    private  Integer iDNumber;

    private int GPA;

    public Stud(String name, String surname, int iDNumber, int GPA) {
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
    public int compareTo(Stud o) {
        int result = this.name.compareTo(o.name);


        if (result == 0) {
            result = this.iDNumber.compareTo(o.iDNumber);
        }
        return result;
    }

    @Override
    public String toString() {
        return "№ " + this.iDNumber + " Студент: " + this.name + " " + this.surname + " Баллы = " +this.GPA;
    }
}
