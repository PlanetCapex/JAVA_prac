package ru.mirea.lab6.n10;

public class Processor {
    private String name;

    Processor(String _name) {
        this.name = _name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
