package n1;
public class Main {
    public static void main(String[] args) {
        System.out.println(RPN_Calculator.ExpressionToRPN("3+6*2"));
        System.out.println(RPN_Calculator.RPNtoAnswer(RPN_Calculator.ExpressionToRPN("1+5*2")));
    }
}
