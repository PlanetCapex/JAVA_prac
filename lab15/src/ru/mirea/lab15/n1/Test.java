package ru.mirea.lab15.n1;


//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Test {
//    public static void main(String[] args) {
//        Frame f = new Frame("ActionListener Example");
//        final TextField tf = new TextField();
//        tf.setBounds(50,50, 150,20);
//        Button b = new Button("Click Here");
//        b.setBounds(100,100,100,50);
//        //второй шаг
//        b.addActionListener(new ActionListener() {
//            public void actionPerformed (ActionEvent e) {
//                tf.setText("Welcome");
//            }
//        });
//        f.add(b);
//        f.add(tf);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaExample extends JFrame{
    JTextArea jta1 = new JTextArea(10,25);
    JButton button = new JButton("Add some Text");
    public TextAreaExample(){
        super("Example"); setSize(300,300);
        setLayout(new FlowLayout()); add(jta1);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog (null,"Insert some text");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[]args){
        new TextAreaExample().setVisible(true);
    }
}
