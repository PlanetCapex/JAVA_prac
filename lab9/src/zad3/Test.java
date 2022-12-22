package zad3;

import zad1.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students1 = new Student[]{new Student("Vasya","Impov",5, 95),
                new Student("IGOR","Razov",2, 70),
                new Student("Pete","Misov",3, 90)};



        Student[] students2 = new Student[]{new Student("Vasya","Zybrov",15, 10),
                new Student("Garen","Marov",13, 50),
                new Student("Pete","Brown",16, 60),
                new Student("Alex","Merser",11, 70)};

        MergeSort mergeSort = new MergeSort();
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.getGPA() > s2.getGPA()) {
                    return -1;
                } else if (s1.getGPA() < s2.getGPA()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Student[] output = mergeSort.sort(students1,students2, comp);

        for (Student s:
             output) {
            System.out.println(s);

        }
    }
}
