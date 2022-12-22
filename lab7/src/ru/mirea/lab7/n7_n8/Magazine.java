package ru.mirea.lab7.n7_n8;

public class Magazine implements Printable{
    private String name;
    private String type;
    Magazine(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void print() {
        System.out.println("Magazine: " + this.name + "; Type: " + this.type);
    }

    @Override
    public String toString() {
        return "Magazine: " + this.name + "; Type: " + this.type;
    }

    static public void printMagazines(Printable[] print) {
        for (Printable obj : print) {
            if (obj instanceof Magazine) {
                System.out.println(obj.toString());
            }
        }
    }
}
