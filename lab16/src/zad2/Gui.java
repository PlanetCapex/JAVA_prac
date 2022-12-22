package zad2;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JTextArea txtMain;
    private JComboBox txtColor;
    private JComboBox txtFont;

    public Gui() {
        setBackground(new Color(240, 240, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Задание 2");
        getContentPane().setLayout(null);

        txtMain = new JTextArea("Введите свой текст");
        txtMain.setFont(new Font("Times New Roman", Font.BOLD, 16));
        txtMain.setBounds(50, 20, 282, 50);
        getContentPane().add(txtMain);

        ColorItem[] colors = {
                new ColorItem("Красный", new Color(255, 0, 0)),
                new ColorItem("Синий", new Color(0, 0, 255)),
                new ColorItem("Черный", new Color(0, 0, 0))

        };
        DefaultComboBoxModel model = new DefaultComboBoxModel(colors);
        txtColor = new JComboBox<ColorItem>();
        txtColor.setBounds(50, 100, 120, 20);
        txtColor.setModel(model);
        txtColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                ColorItem item = (ColorItem) box.getSelectedItem();
                txtMain.setForeground(item.getColor());
            }
        });
        getContentPane().add(txtColor);

        String[] fonts = {
                "Times New Roman",
                "MS Sans Serif",
                "Courier New"
        };
        txtFont = new JComboBox<String>(fonts);
        txtFont.setBounds(200, 100, 120, 20);
        txtFont.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String) box.getSelectedItem();
                txtMain.setFont(new Font(item, Font.BOLD, 16));
            }
        });
        getContentPane().add(txtFont);

    }
}


