package lab.lab4.zad4;

public class Computer {
    private Processor proc;
    private Memory mem;
    private Monitor mon;

    public Computer(Processor proc, Memory mem, Monitor mon) {
        this.proc = proc;
        this.mem = mem;
        this.mon = mon;
    }

    @Override
    public String toString() {
        return "Процессор: " + this.proc.toString() + "; Память: " + this.mem.toString() + "; Монитор: " + this.mon.toString() + "\n";
    }
}
