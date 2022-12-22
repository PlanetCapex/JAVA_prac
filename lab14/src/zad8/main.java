package zad8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {

    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {
        String array[] =
                new String[]{"1rewf ", "Aezakmi123", "Hesoyam12",  "1"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher m = pattern.matcher(o.toString());
                return m.find();
            }
        });
        Arrays.stream(newArray).forEach(System.out::println);
    }
}