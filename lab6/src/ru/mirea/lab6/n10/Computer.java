package ru.mirea.lab6.n10;

public class Computer {
    private int id;
    private Processor proc;
    private Memory mem;
    private Monitor mon;
    private Brands brand;

    public Computer(int id, Processor proc, Memory mem, Monitor mon, Brands br) {
        this.id = id;
        this.proc = proc;
        this.mem = mem;
        this.mon = mon;
        this.brand = br;
    }

    public int getID() { return this.id; }

    @Override
    public String toString() {
        return "Марка: " + this.brand + " Процессор: " +
                this.proc.toString() + "; Память: " + this.mem.toString() +
                "; Монитор: " + this.mon.toString() + "\n";
    }
}
