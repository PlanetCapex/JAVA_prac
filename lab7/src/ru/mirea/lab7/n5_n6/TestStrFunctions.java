package ru.mirea.lab7.n5_n6;
import java.util.Scanner;

public class TestStrFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ProcessString strFUNCTION = new ProcessString();
        System.out.println(strFUNCTION.countSymbols(str));
        System.out.println(strFUNCTION.reverseSTR(str));
        System.out.println(strFUNCTION.modifySTR(str));
    }
}
