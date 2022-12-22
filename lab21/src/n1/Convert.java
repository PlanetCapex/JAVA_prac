package n1;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert <T> {
    private int n = 0; //inArr size
    private T[] inArr;
    private ArrayList<Object> outArr = new ArrayList<>();

    public Convert(T[] arr, int n) {
        this.inArr = arr;
        this.n = n;
    }

    public void Convertation() {
        outArr.addAll(Arrays.asList(inArr).subList(0, n));
    }

    public void showList() {
        for (Object elem : outArr) {
            System.out.print(elem +  " ");
        }
        System.out.println();
    }

}
