package zad3;


import javax.swing.*;
import java.awt.*;

public class GUITools
{

    public static void createRecommendedMargin(JButton[] buttons)
    {
        for (int i = 0; i < buttons.length; i++) {
            // Объект Insets хранит расстояние от текста до границ кнопки
            Insets margin = buttons[i].getMargin();
            margin.left = 12;
            margin.right = 12;
            buttons[i].setMargin(margin);
        }
    }
    public static void makeSameSize(JComponent[] components)
    {
        int[] array = new int[components.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = components[i].getPreferredSize().width;
        }
        int maxSizePos = maximumElementPosition(array);
        Dimension maxSize = components[maxSizePos].getPreferredSize();
        for (int i=0; i<components.length; i++) {
            components[i].setPreferredSize(maxSize);
            components[i].setMinimumSize(maxSize);
            components[i].setMaximumSize(maxSize);
        }
    }
    public static void fixTextFieldSize(JTextField field)
    {
        Dimension size = field.getPreferredSize();
        size.width = field.getMaximumSize().width;
        field.setMaximumSize(size);
    }
    private static int maximumElementPosition(int[] array)
    {
        int maxPos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array [maxPos])
                maxPos = i;
        }
        return maxPos;
    }
}