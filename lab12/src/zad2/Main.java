package zad2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ваше изображение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JPanel image_panel = new JPanel();
        JLabel img = new JLabel( new ImageIcon(args [0]));
        image_panel.add(img);
        frame.getContentPane().add(image_panel);
        frame.pack();
        frame.setVisible(true);

    }
}
