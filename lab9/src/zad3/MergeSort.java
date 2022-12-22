package zad3;

import zad1.Student;

import java.util.Comparator;

class MergeSort {

    public Student[] sort(Student[] a1,Student[] a2, Comparator<Student> comp) {
        Student[] input = new Student[a1.length + a2.length];
        System.arraycopy(a1, 0, input, 0, a1.length);
        System.arraycopy(a2, 0, input, a1.length, a2.length);
        mergeSort(input, 0, input.length - 1, comp);
        return input;
    }


    private  void mergeSort(Student[] a, int from, int to, Comparator<Student> comp) {
        if (from == to)
            return;
        int mid = (from + to) / 2;

        mergeSort(a, from, mid, comp);
        mergeSort(a, mid + 1, to, comp);
        merge(a, from, mid, to, comp);
    }

    private  void merge(Student[] a, int from, int mid, int to, Comparator<Student> comp) {
        int n = to - from + 1;
        Object[] values = new Object[n];

        int fromValue = from;

        int middleValue = mid + 1;

        int index = 0;

        while (fromValue <= mid && middleValue <= to) {
            if (comp.compare(a[fromValue], a[middleValue]) < 0) {
                values[index] = a[fromValue];
                fromValue++;
            } else {
                values[index] = a[middleValue];
                middleValue++;
            }
            index++;
        }

        while (fromValue <= mid) {
            values[index] = a[fromValue];
            fromValue++;
            index++;
        }
        while (middleValue <= to) {
            values[index] = a[middleValue];
            middleValue++;
            index++;
        }

        for (index = 0; index < n; index++)
            a[from + index] = (Student) values[index];
    }
}
