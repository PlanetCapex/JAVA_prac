package ru.mirea.lab15.n4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UltraCalculator extends JFrame {
    private double doubleValue1;
    private double doubleValue2;
    private double doubleAnswer;

    private int intValue1;
    private int intValue2;
    private int intAnswer;

    private boolean plusActionFlag = false;
    private boolean minusActionFlag = false;
    private boolean multiActionFlag = false;
    private boolean divActionFlag = false;
    private boolean isDouble = false;
    private String inputData;

    UltraCalculator() {
        super("Ultra Calculator");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new FlowLayout());

        JTextArea inputWindow = new JTextArea(10, 22);

        JPanel keys = new JPanel();
        keys.setSize(20, 400);
        keys.setLayout(new GridLayout(4, 4));

        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton point = new JButton(".");
        JButton equal = new JButton("=");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multi = new JButton("*");
        JButton div = new JButton("/");

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("0");
                inputData += "0";
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("1");
                inputData += "1";
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("2");
                inputData += "2";
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("3");
                inputData += "3";
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("4");
                inputData += "4";
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("5");
                inputData += "5";
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("6");
                inputData += "6";
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("7");
                inputData += "7";
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("8");
                inputData += "8";
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append("9");
                inputData += "9";
            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputWindow.append(".");
                inputData += ".";
                isDouble = true;
            }
        });

        equal.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (inputWindow.getText().contains(".")) { isDouble = true; }
               if(isDouble) {
                   try{
                       doubleValue2 = Double.parseDouble(inputWindow.getText().trim());
                   }
                   catch (Exception exc){
                       JOptionPane.showMessageDialog(
                               null,
                               "Numbers error",
                               "alert",
                               JOptionPane.ERROR_MESSAGE);
                   }

                   if (plusActionFlag && !(minusActionFlag && multiActionFlag && divActionFlag)) {
                       doubleAnswer = doubleValue1 + doubleValue2;
                   }
                   if (minusActionFlag && !(plusActionFlag && multiActionFlag && divActionFlag)){
                       doubleAnswer = doubleValue1 - doubleValue2;
                   }
                   if (multiActionFlag && !(plusActionFlag && minusActionFlag && divActionFlag)){
                       doubleAnswer = doubleValue1 * doubleValue2;
                   }
                   if (divActionFlag && !(plusActionFlag && minusActionFlag && multiActionFlag)){
                       doubleAnswer = doubleValue1 / doubleValue2;
                   }

                   inputWindow.setText(Double.toString(doubleAnswer));
                   inputData = Double.toString(doubleAnswer);
               }
               else {
                   try{
                       intValue2 = Integer.parseInt(inputWindow.getText().trim());
                   }
                   catch (Exception exc){
                       JOptionPane.showMessageDialog(
                               null,
                               "Numbers error",
                               "alert",
                               JOptionPane.ERROR_MESSAGE);
                   }

                   if (plusActionFlag && !(minusActionFlag && multiActionFlag && divActionFlag)) {
                       intAnswer = intValue1 + intValue2;
                   }
                   if (minusActionFlag && !(plusActionFlag && multiActionFlag && divActionFlag)){
                       intAnswer = intValue1 - intValue2;
                   }
                   if (multiActionFlag && !(plusActionFlag && minusActionFlag && divActionFlag)){
                       intAnswer = intValue1 * intValue2;
                   }
                   if (divActionFlag && !(plusActionFlag && minusActionFlag && multiActionFlag)){
                       intAnswer = intValue1 / intValue2;
                   }
                   inputWindow.setText(Integer.toString(intAnswer));
                   inputData = Integer.toString(intAnswer);

               }
               plusActionFlag = false;
               minusActionFlag = false;
               multiActionFlag = false;
               divActionFlag = false;
               isDouble = false;
           }
        });

        plus.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (!(plusActionFlag && minusActionFlag && multiActionFlag && divActionFlag)) {
                   plusActionFlag = true;
                   if (inputWindow.getText().contains(".")) { isDouble = true; }
                   if (isDouble) {
                       doubleValue1 = Double.parseDouble(inputWindow.getText().trim());
                   }
                   else {
                       intValue1 = Integer.parseInt(inputWindow.getText().trim());
                   }
                   inputWindow.setText("");
               }
               else {
                   JOptionPane.showMessageDialog(
                           null,
                           "FLAGS ERROR",
                           "alert",
                           JOptionPane.ERROR_MESSAGE);
               }

           }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(plusActionFlag && minusActionFlag && multiActionFlag && divActionFlag)) {
                    minusActionFlag = true;
                    if (inputWindow.getText().contains(".")) { isDouble = true; }
                    if (isDouble) {
                        doubleValue1 = Double.parseDouble(inputWindow.getText().trim());
                    }
                    else {
                        intValue1 = Integer.parseInt(inputWindow.getText().trim());
                    }
                    inputWindow.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(
                            null,
                            "FLAGS ERROR",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(plusActionFlag && minusActionFlag && multiActionFlag && divActionFlag)) {
                    multiActionFlag = true;
                    if (inputWindow.getText().contains(".")) { isDouble = true; }
                    if (isDouble) {
                        doubleValue1 = Double.parseDouble(inputWindow.getText().trim());
                    }
                    else {
                        intValue1 = Integer.parseInt(inputWindow.getText().trim());
                    }
                    inputWindow.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(
                            null,
                            "FLAGS ERROR",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(plusActionFlag && minusActionFlag && multiActionFlag && divActionFlag)) {
                    divActionFlag = true;
                    if (inputWindow.getText().contains(".")) { isDouble = true; }
                    if (isDouble) {
                        doubleValue1 = Double.parseDouble(inputWindow.getText().trim());
                    }
                    else {
                        intValue1 = Integer.parseInt(inputWindow.getText().trim());
                    }
                    inputWindow.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(
                            null,
                            "FLAGS ERROR",
                            "alert",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        keys.add(seven);
        keys.add(eight);
        keys.add(nine);
        keys.add(div);
        keys.add(four);
        keys.add(five);
        keys.add(six);
        keys.add(multi);
        keys.add(one);
        keys.add(two);
        keys.add(three);
        keys.add(minus);
        keys.add(zero);
        keys.add(point);
        keys.add(equal);
        keys.add(plus);

        add(inputWindow);
        add(keys);
        inputWindow.setVisible(true);
        keys.setVisible(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UltraCalculator();
    }
}
