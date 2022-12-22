package n2_n3;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UniversalArray<T> {
    Scanner sc = new Scanner(System.in);
    private int size;
    private Object[] array;
    public UniversalArray(int size) throws Exception {
         this.size = size;
        this.array = new Object[size];
         System.out.println("Type " + this.size + " array elements: ");
         for (int i = 0; i < this.size; i++) {
             try{
                 this.array[i] = (T) sc.next();
             }
             catch (Exception e){
                 throw new Exception("Error while generic transform");
             }
         }
    }
    public void showArray() {
        for (Object tmp : this.array) {
            System.out.print(tmp + " ");
        }
    }

    public Object getElement(int index) {
        try {
            return this.array[index - 1];
        }
        catch (Exception e) {
            throw new IndexOutOfBoundsException("wrong index");
        }
    }

    public static void fillByCatalog(String path) {
        File f = new File(path);
        String[] fileArray = null;
        if (f.exists()||f.isDirectory()) fileArray = f.list(null);
        else System.out.print("Catalog not found");
        ArrayList<String> list = new ArrayList(Arrays.asList(fileArray));

        for (int i =0; i < list.size(); i++) {
            if(i<5) System.out.println(list.get(i));
        }
    }
}
