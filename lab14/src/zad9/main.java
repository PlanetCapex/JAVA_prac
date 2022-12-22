package zad9;

import java.util.Dictionary;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    static void Dictionary(String text){
        text = text.toLowerCase();

        int[] result = new int['z' - 'a' + 1];
        String regex = "[a-zA-Z \\\\u0400-\\\\u04FF]";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(text);
        int i = 0;
        while (m.find()) {
            result[text.charAt(i) - 'a']++;
            i++;
        }

        for(i = 0; i < result.length; i++){
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Dictionary(text);


    }
}
