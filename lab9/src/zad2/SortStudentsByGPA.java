package zad2;
import zad1.Student;
import java.util.Comparator;

public class SortStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGPA() > s2.getGPA()) {
            return -1;
        } else if (s1.getGPA() < s2.getGPA()) {
            return 1;
        } else {
            return 0;
        }
    }
}
