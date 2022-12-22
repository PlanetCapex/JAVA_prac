package n1;
import java.util.Scanner;

public class TestCustomer {
    public boolean isCorrectNumberINN(String number) {
        return (number.charAt(0) != '0') && (number.length() == 16);
    }

    public static void main(String[] args) throws BadCustomerINN {
        Scanner sc = new Scanner(System.in);
        TestCustomer c = new TestCustomer();
        String name;
        String inn;
        name = sc.next();
        inn = sc.next();
        if (!c.isCorrectNumberINN(inn)) {
            throw new BadCustomerINN("error while reading INN number");
        }
        System.out.println("Data ok");
    }
}
