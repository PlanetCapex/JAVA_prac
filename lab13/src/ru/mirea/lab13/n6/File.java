package ru.mirea.lab13.n6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

public class File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Введите имя файла: ");
//        String inputFileName = sc.next();

//        String inputSTR = "";
//        char [] i = new char[100];
//        try (FileReader inputFile = new FileReader("/Users/petr/Documents/3 семестр/ JAVA/lab13/src/ru/mirea/lab13/n6/text.txt")) {
//            inputFile.read(i);
//        }
//        catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        String inputSTR = "щщщ abcd bcda dcab cabd ппп";
        String[] inputSTRArr = inputSTR.split(" ");
        ArrayList<String> newArr = new ArrayList<>();

        for (String el : inputSTRArr) {
            if (newArr.isEmpty()) { newArr.add(el); }
            else {
                for (int i = 0; i < newArr.size(); i++) {
                    if (newArr.get(i).charAt(newArr.get(i).length() - 1) == el.charAt(0)) {
                        newArr.add(i + 1, el);
                        break;
                    }
                    else if (newArr.get(i).charAt(0) == el.charAt(el.length() - 1)) {
                        newArr.add(i, el);
                        break;
                    }
                }
            }

        }

        StringBuilder newSTR = new StringBuilder();

        for (String str : newArr) { newSTR.append(str + " "); }

        System.out.println(newSTR.toString());

    }
}
