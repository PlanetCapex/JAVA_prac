package zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {




    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Vasya","Impov",5, 10));
        students.add(new Student("Garen","Marov",3, 50));
        students.add(new Student("Pete","Brown",6, 60));
        students.add(new Student("Alex","Merser",1, 70));
        System.out.println("Массив до сортировки");
        for (Student s:
             students) {
            System.out.println(s.toString());
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getiDNumber() > s2.getiDNumber()){
                    return 1;
                }
                else if(s1.getiDNumber() < s2.getiDNumber()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println("Массив после сортировки");
        for (Student s:
                students) {
            System.out.println(s.toString());
        }

    }

}
