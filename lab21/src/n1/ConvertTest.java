package n1;

public class ConvertTest {
    public static void main(String[] args) {
        Convert<String> strConvert = new Convert<String>(new String[]{"fdt", "fvc", "ffdsadadsadare"}, 3);
        strConvert.Convertation();
        strConvert.showList();

        Convert<Integer> intConvert = new Convert<Integer>(new Integer[] {1, 2, 3, 4, 7}, 5);
        intConvert.Convertation();
        intConvert.showList();
    }
}
