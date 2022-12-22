package ru.mirea.lab17.n2;

import ru.mirea.lab17.n1.MVCPatternDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class MVCPatternDemoGUI extends JFrame {
    Employee model = retrieveEmployeeFromDB();
    EmployeeView view = new EmployeeView();
    EmployeeController controller = new EmployeeController(model, view);

    JTextField nameField = new JTextField("Type name", 15);
    JTextField hoursField = new JTextField("Type hours per month", 15);
    JTextField rateField = new JTextField("Type rate per hour", 15);
    JButton addButton = new JButton("Add new record");
    JTextArea outputPane = new JTextArea();

    public MVCPatternDemoGUI() {
        super("Salary info");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 500);
        add(nameField);
        add(hoursField);
        add(rateField);
        add(addButton);
        add(outputPane);
        setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int hours = Integer.parseInt(hoursField.getText());
                int rate = Integer.parseInt(rateField.getText());
                if (!Objects.equals(name, "") && hours > 0 && rate > 0) {
                    controller.setEmployeeName(name);
                    controller.setEmployeeHours(hours);
                    controller.setEmployeeRate(rate);
                    controller.countEmployeeSalary();
                    outputPane.append(controller.updateView());
                }
            }
        });
    }

    public static void main(String[] args) {
        new MVCPatternDemoGUI();
    }

    public static Employee retrieveEmployeeFromDB() {
        return new Employee("demoEmployee", 160, 1500);
    }
}
