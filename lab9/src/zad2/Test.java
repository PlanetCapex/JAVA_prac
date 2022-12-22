package zad2;

import zad1.Student;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Vasya","Impov",5, 45));
        students.add(new Student("IGOR","Razov",2, 70));
        students.add(new Student("Pete","Misov",3, 90));

        for (Student s: students) {
            System.out.println(s);
        }

        SortStudentsByGPA sortStudentsByGPA = new SortStudentsByGPA();
        students.sort(sortStudentsByGPA);

        System.out.println("Sorted: ");
        for (Student s: students) {
            System.out.println(s);
        }
    }

}
