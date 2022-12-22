package lab26;

import java.util.HashMap;
import java.util.Map;

public class HashTab<T, V> {
    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Олег Курикорич Сыромятова");
        passportsAndNames.put(162348, "Иван Аркадиевич Огурцов");
        passportsAndNames.put(8082771, "Джон Бушеч Трамп");

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);

        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

    }
}
