package prak1;
import java.util.*;
public class massiv_user
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++)
        {
            arr[i] = sc.nextInt();

        }
        int s = 0;
        int i = 0;
        while(i<3)
        {
            s+=arr[i];
            i++;

        }
        System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).max());
        System.out.println(s);
    }
}
