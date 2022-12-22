package Shell.zad1;

public class Main {
    public static void main(String[] args) {
        Double x = Double.valueOf(100);
        Double y = Double.valueOf("1");
        String num = "36";
        x = Double.parseDouble(num);
        byte test1 = x.byteValue();
        short test2 = x.shortValue();
        int test3 = x.intValue();
        long test4 = x.longValue();
        float test5 = x.floatValue();
        double test6 = x.doubleValue();
        char test7 = (char)(x.doubleValue());
        boolean test8 = y.doubleValue()!=0.0;
        System.out.println("Значение объекта Double: " + x);
        System.out.println("Значение объекта Double переведенное в byte: " + test1);
        System.out.println("Значение объекта Double переведенное в short: " + test2);
        System.out.println("Значение объекта Double переведенное в int: " + test3);
        System.out.println("Значение объекта Double переведенное в long: " + test4);
        System.out.println("Значение объекта Double переведенное в float: " + test5);
        System.out.println("Значение объекта Double переведенное в double: " + test6);
        System.out.println("Значение объекта Double переведенное в char: " + test7);
        System.out.println("Значение объекта Double переведенное в boolean: " + test8);
        String d = Double.toString(3.14);
        double z = Double.parseDouble(d);
        System.out.println("Значение d к литералу double: " + z);

    }
}
