package zad2;

import java.awt.Color;

public class ColorItem {
    private String name;
    private Color color;

    public ColorItem(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name;
    }
}


