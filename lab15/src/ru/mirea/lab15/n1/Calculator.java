package ru.mirea.lab15.n1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{

    int value1;
    int value2;
    JTextField field1 = new JTextField(10);
    JTextField field2 = new JTextField(10);

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multi = new JButton("*");
    JButton div = new JButton("/");

    Calculator() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500, 500);
        add(new JLabel("1st number"));
        add(field1);
        add(new JLabel("2nd number"));
        add(field2);
        add(plus);
        add(minus);
        add(multi);
        add(div);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    value1 = Integer.parseInt(field1.getText().trim());
                    value2 = Integer.parseInt(field2.getText().trim());
                    JOptionPane.showMessageDialog(
                            null,
                            "Result = " + (value1 + value2),
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
                catch (Exception exc){
                    JOptionPane.showMessageDialog(
                            null,
                            "Numbers error",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    value1 = Integer.parseInt(field1.getText().trim());
                    value2 = Integer.parseInt(field2.getText().trim());
                    JOptionPane.showMessageDialog(
                            null,
                            "Result = " + (value1 - value2),
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exp) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Numbers error",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    value1 = Integer.parseInt(field1.getText().trim());
                    value2 = Integer.parseInt(field2.getText().trim());
                    JOptionPane.showMessageDialog(
                            null,
                            "Result = " + (value1 * value2),
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exp) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Numbers error",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    value1 = Integer.parseInt(field1.getText().trim());
                    value2 = Integer.parseInt(field2.getText().trim());
                    JOptionPane.showMessageDialog(
                            null,
                            "Result = " + (value1 / value2),
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exp) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Numbers error",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
