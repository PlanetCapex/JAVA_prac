package lab.lab41.zad2;

public class Phone {
    private long number;
    private String model;
    private int weight = 0;


    public Phone(long num, String mod) {
        this.number = num;
        this.model = mod;
    }
    public Phone(long num, String mod, int weight) {
        this(num, mod);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Входящий звонок " + name);
    }

    public void receiveCall(String name, long num) {
        System.out.println("Звонит: " + name + " Номер: " + num);
    }

    public long getNumber() {
        return number;
    }

    public void sendMessage(long ... numbers) {
        for (long num : numbers) {
            System.out.println("Сообщение было отправлено на номер " + num);
        }
    }

    @Override
    public String toString() {
        return this.model + " " + this.number + " " + this.weight;
    }
}
