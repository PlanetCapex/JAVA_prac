package ru.mirea.lab18.n7;
import java.util.Scanner;

public class ExceptionTest7 {
    void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        //key = "";
        printDetails( key );
        System.out.println("printDetails() exception");
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ExceptionTest7 ex = new ExceptionTest7();
        ex.getKey();
    }
}

