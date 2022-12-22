package n1;

public class ConvertTest {
    public static void main(String[] args) {
        Convert<String> strConvert = new Convert<String>(new String[]{"tet", "vbcnvc", "ffdsvre"}, 3);
        strConvert.Convertation();
        strConvert.showList();

        Convert<Integer> intConvert = new Convert<Integer>(new Integer[] {3, 4, 5, 6, 7}, 5);
        intConvert.Convertation();
        intConvert.showList();
    }
}
