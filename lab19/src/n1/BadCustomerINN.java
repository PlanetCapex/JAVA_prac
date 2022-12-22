package n1;

public class BadCustomerINN extends RuntimeException{
    public BadCustomerINN(String errorMessage) {
        super(errorMessage);
    }
}
