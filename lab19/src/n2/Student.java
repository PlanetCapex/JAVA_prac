package n2;

public class Student {
    private String name;
    private  String surname;
    private String specialize;
    private String group;
    private int curse;


    private int GPA;

    public Student(String name, String surname, String specialize, String group, int curse, int GPA) {
        this.name = name;
        this.surname = surname;
        this.specialize = specialize;
        this.group = group;
        this.curse = curse;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getCurse() {
        return curse;
    }

    public String getGroup() {
        return group;
    }

    public String getSpecialize() {
        return specialize;
    }

    public String getSurname() {
        return surname;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return  "Студент: " + this.name + " " + this.surname + " Группа = " + this.group + " Специальность = " + this.specialize + " Курс = " + this.curse + " Баллы = " + this.GPA;
    }
}
