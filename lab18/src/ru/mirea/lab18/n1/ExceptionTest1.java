package ru.mirea.lab18.n1;

public class ExceptionTest1 {
    public void exceptionDemo() {
        try {
            System.out.println( 2 / 0 );
        }
        catch (ArithmeticException e) {
            System.out.println("Dib by zero");
        }

    }

    public static void main(String[] args) {
        ExceptionTest1 ex = new ExceptionTest1();
        ex.exceptionDemo();
    }
}
