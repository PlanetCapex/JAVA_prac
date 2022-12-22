package prak1;

public class factorial
{
    public static void main (String args[])
    {
        int f = 1;
        int fct = 5;
        for (int i = 1; i <= fct; i++)
        {
            f *= i;
        }
        System.out.println(f);
    }

}
