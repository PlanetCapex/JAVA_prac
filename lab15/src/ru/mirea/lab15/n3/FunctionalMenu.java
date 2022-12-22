package ru.mirea.lab15.n3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FunctionalMenu extends JFrame{
    public String copiedText = "";

    FunctionalMenu() {
        super("Functional Menu");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        JPanel[] panels = new JPanel[2];
//        panels[0] = new JPanel();
//        panels[1] = new JPanel();
//        panels[0].setSize(400, 50);
//        panels[1].setSize(400, 150);
        setLayout(new GridLayout(3,1));
        setSize(400, 400);
        JTextArea area = new JTextArea();
        JMenuBar bar = new JMenuBar();
        bar.add(createFileMenu());
        bar.add(createEditMenu(area));
        bar.add(createHelpMenu());
        setJMenuBar(bar);
//        panels[0].add(new JButton("Button 1"));
//        panels[0].add(new JButton("Button 2"));
//        panels[1].add(area);
//        panels[0].setVisible(true);
//        panels[1].setVisible(true);
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        btn1.setSize(50, 50);
        btn2.setSize(50, 50);
        add(btn1);
        add(btn2);
        add(area);
        setVisible(true);
        setVisible(true);
        setVisible(true);
    }

    public JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(save);
        fileMenu.addSeparator();
        fileMenu.add(exit);
        return fileMenu;
    }

    public JMenu createEditMenu(JTextArea editableText) {
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copiedText = editableText.getText();
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copiedText = editableText.getText();
                editableText.setText("");
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editableText.setText(copiedText);
            }
        });

        editMenu.add(copy);
        editMenu.addSeparator();
        editMenu.add(cut);
        editMenu.addSeparator();
        editMenu.add(paste);

        return editMenu;
    }

    public JMenu createHelpMenu() {
        JMenu helpMenu = new JMenu("Help");
        JMenuItem contactUs = new JMenuItem("Contact Us");
        helpMenu.add(contactUs);
        return helpMenu;
    }

    public static void main(String[] args) {
        new FunctionalMenu();
    }

}
