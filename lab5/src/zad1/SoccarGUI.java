package zad1;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class SoccarGUI {

    public static String who_win(HashMap<String, Integer> commandsAndCout){
        if(commandsAndCout.get("AC Milan") > commandsAndCout.get("Real Madrid")){
            return "AC Milan";
        } else if (commandsAndCout.get("AC Milan") < commandsAndCout.get("Real Madrid")) {
            return "Real Madrid";
        }
        return  "DRAW";
    }
    public static void main(String[] args) {
        HashMap<String, Integer> commandsAndCount = new HashMap<>();
        commandsAndCount.put("AC Milan", 0);
        commandsAndCount.put("Real Madrid", 0);
        JFrame frame = new JFrame("Результаты матча");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 100));
        panel.setBounds(0,0,300,150);
        JButton command1 = new JButton("AC Milan");
        JButton command2 = new JButton("Real Madrid");
        JLabel result = new JLabel("Result: " + commandsAndCount.get("AC Milan") + "X" +commandsAndCount.get("Real Madrid"), JLabel.CENTER);
        JLabel last_soccer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel winner = new JLabel("Winner: DRAW", JLabel.CENTER);
        command1.addActionListener( e -> {
            commandsAndCount.put("AC Milan", commandsAndCount.get("AC Milan") + 1);
            result.setText("Result: " + commandsAndCount.get("AC Milan") + "X" +commandsAndCount.get("Real Madrid"));
            last_soccer.setText("Last Scorer: AC Milan");
            winner.setText("Winner: " + who_win(commandsAndCount));
        });
        command2.addActionListener( e -> {
            commandsAndCount.put("Real Madrid", commandsAndCount.get("Real Madrid") + 1);
            result.setText("Result: " + commandsAndCount.get("AC Milan") + "X" +commandsAndCount.get("Real Madrid"));
            last_soccer.setText("Last Scorer: Real Madrid");
            winner.setText("Winner: " + who_win(commandsAndCount));
        });
        panel.add(command1);
        panel.add(command2);
        panel.add(result);
        panel.add(last_soccer);
        panel.add(winner);
        frame.setSize(300,300);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
