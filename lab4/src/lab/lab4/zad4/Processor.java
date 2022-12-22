package lab.lab4.zad4;

public class Processor {
    private String name;
    private int coresAmount;
    private int freq;

    Processor(String name, int cores, int freq) {
        this.name = name;
        this.coresAmount = cores;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Название - " + this.name + "; " + this.coresAmount + " ядер на частоте " + this.freq;
    }
}
