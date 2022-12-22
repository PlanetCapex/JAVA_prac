package ru.mirea.lab15.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Menu extends JFrame {

    Menu() {
        super("Menu items");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container content = getContentPane();
        setLayout(new FlowLayout());
        setSize(750, 500);

        String[] items = {
                "Choose...",
                "Australia",
                "China",
                "England",
                "Russia"};


        JComboBox menu = new JComboBox(items);
        JTextPane infoLabel = new JTextPane();
        infoLabel.setText("Choose country in menu");

        add(menu);
        add(infoLabel);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String select = Objects.requireNonNull(menu.getSelectedItem()).toString();
                switch (select) {
                    case("Choose...") -> {
                        infoLabel.setText("Choose country in menu");
                    }
                    case ("Australia") -> {
                        infoLabel.setText("""
                                Австралия - государство в Южном полушарии,\s
                                занимающее одноимённый материк, остров Тасмания и несколько\s
                                других островов Индийского и Тихого океанов; является шестым\s
                                государством по площади в мире.""");
                    }
                    case ("China") -> {
                        infoLabel.setText("""
                                Китай - государство в Восточной Азии. Занимает третье место в\s
                                мире по территории (9 598 962 км2), уступая России и Канаде, а по\s
                                численности населения — 1 415 515 674 жителей — второе, уступая Индии.\s""");
                    }
                    case ("England") -> {
                        infoLabel.setText("""
                                Англия - страна, являющаяся крупнейшей административно-политической\s
                                частью Соединённого Королевства Великобритании и Северной Ирландии. Население\s
                                Англии составляет 84 % от общего числа населения Великобритании. Столица — Лондон,\s
                                крупнейший город Великобритании.\s""");
                    }
                    case ("Russia") -> {
                        infoLabel.setText("""
                                Россия - государство в Восточной Европе и Северной Азии. Россия —\s
                                крупнейшее государство в мире, её территория составляет 17 125 191 км²\s
                                Население страны в тех же границах составляет 147 182 123 чел.""");
                    }
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Menu();
    }

}
