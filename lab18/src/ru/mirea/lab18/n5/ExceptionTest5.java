package ru.mirea.lab18.n5;

public class ExceptionTest5 {
    public void getDetails(String key) {
        try {
            int n = Integer.parseInt(key);
        }
        catch(NumberFormatException e) {
            throw new NullPointerException("null key in getDetails");
        }

    }

    public static void main(String[] args) {
        ExceptionTest5 ex = new ExceptionTest5();
        ex.getDetails(null);
    }
}
