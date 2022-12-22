package ru.mirea.lab11.n3;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private  String surname;
    private Date birthDate;
    private String specialize;
    private String group;
    private int curse;
    private int GPA;

    public Student(String name, String surname, Date birthDate, String specialize, String group, int curse, int GPA) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.specialize = specialize;
        this.group = group;
        this.curse = curse;
        this.GPA = GPA;
    }

    public String getName() { return name; }
    public Date getBirthDate() { return birthDate; }
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

    public String getFormattedBirthdayDate(String STRFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(STRFormat);
        return sdf.format(this.birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return  " Студент: " + this.name + " " + this.surname +
                " Дата рождения " +  sdf.format(this.birthDate) +
                " Группа = " +this.group +"Специальность = " + this.specialize +
                " Курс = " +this.curse +" Баллы = " +this.GPA;
    }
}
