package prak1;

public class hrmnc
{
    public static void main (String args[])
    {
        int num = 10;
        double res = 0.0;
        System.out.print("The harmonic series is: ");
        while (num > 0) {
            res = res + (double)1 / num;
            num--;
            System.out.printf("%f, ", res);
        }
    }
}
