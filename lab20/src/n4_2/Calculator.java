package n4_2;

public class Calculator {
    public Calculator() {}
    public static <A extends Number, B extends Number> void sum(A num1, B num2) {
        float res = num1.floatValue() + num2.floatValue();
        System.out.println(res);
    }
    public static <A extends Number, B extends Number> void subtraction(A num1, B num2) {
        float res = num1.floatValue() - num2.floatValue();
        System.out.println(res);
    }
    public static <A extends Number, B extends Number> void multiply(A num1, B num2) {
        float res = num1.floatValue() * num2.floatValue();
        System.out.println(res);
    }
    public static <A extends Number, B extends Number> void div(A num1, B num2) {
        try{
            float res = num1.floatValue() / num2.floatValue();
            System.out.println(res);
        }
        catch(Exception e) {
            throw new ArithmeticException("Zero div");
        }
    }
}
