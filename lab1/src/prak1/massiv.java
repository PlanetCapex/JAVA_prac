package prak1;
import java.util.*;
public class massiv
{
    public static void main (String args[])
    {
        int[] array = { 1, 2, 3, 4, 5 };
        int n = 0;
        for (int i = 0; i < array.length; i++)
        {
            n+=array[i];
        }
        System.out.println(n);
        System.out.println(n/array.length);

    }
}
