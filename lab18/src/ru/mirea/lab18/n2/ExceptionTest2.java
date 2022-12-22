package ru.mirea.lab18.n2;

import java.util.Scanner;

public class ExceptionTest2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic error");
            }

        }
        catch(NumberFormatException e) {
            System.out.println("Number format error");
        }
    }

    public static void main(String[] args) {
        ExceptionTest2 ex = new ExceptionTest2();
        ex.exceptionDemo();
    }
}
