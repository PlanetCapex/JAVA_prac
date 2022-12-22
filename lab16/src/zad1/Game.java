package zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class Game extends JFrame {
    private JTextField txtGuess;
    private JLabel lblOutput;
    private JLabel lblCounter;
    private int theNumber;
    private int try_cnt = 3;
    public void checkGuess() {
        if (try_cnt > 1) {
            String guessText = txtGuess.getText();
            String message = "";
            try {
                int guess = Integer.parseInt(guessText);
                if (guess < theNumber) {

                    message +=  random_word() + " Это мало.";
                } else if (guess > theNumber) {
                    message +=  random_word() + " Это много.";
                } else {
                    message +=  " Это правильно. Действительн так!";
                    lblOutput.setText(message);
                    winGame();
                }
                try_cnt--;

            } catch (Exception e) {
                message = "Введите целое число от 0 до 20.";
            } finally {
                lblOutput.setText(message);
                lblCounter.setText("У тебя осталось попыток: " + try_cnt);
                txtGuess.requestFocus();
                txtGuess.selectAll();
            }
        }
        else {
            try_cnt--;
            lblCounter.setText("У тебя осталось попыток: " + try_cnt);
            loseGame();
        }
    }
    public String random_word(){
        int words = (int) (Math.random() * 5);
        switch (words){
            case 0:
                return " Удивительно, но ты не угадал)";
            case 1:
                return " Что человечек не можешь выйграть?";
            case 2:
                return " Чем ты занимаешься иди работай!";
            case 3:
                return " Биб-биб я непобедимый";
            case 4:
                return " Eще попытку, если они остались?";
            case 5:
                return " Ахахах, 'машинный смех'";

        }
        return " ";
    }
    public void newGame() {
        theNumber = (int) (Math.random() * 20);
    }
    public void winGame(){
        showMessageDialog(null, "В это сложно поверить но человечество оказалось сильнее,ты победил");
        System.exit(0);
    }
    public void loseGame() {
        showMessageDialog(null, "Ты проиграл компьютеру какая досада, попробуй еще разок");
        System.exit(0);
    }
    public Game() {
        setBackground(new Color(240, 240, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Угадай число");
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Угадай число");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(80, 11, 287, 14);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("<html>Введите число  от 0 до 20, чтобы обыграть глупый компьютер</html>");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(80, 52, 282, 50);
        getContentPane().add(lblNewLabel_1);

        txtGuess = new JTextField();
        txtGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
        txtGuess.setBounds(177, 95, 86, 20);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        JButton btnNewButton = new JButton("Попытка");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        btnNewButton.setBounds(177, 126, 86, 23);
        getContentPane().add(btnNewButton);

        lblOutput = new JLabel("Давай пробуй, тебе не угадать *()*");
        lblOutput.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(10, 151, 414, 16);
        getContentPane().add(lblOutput);

        lblCounter = new JLabel("У тебя осталось попыток: " + try_cnt);
        lblCounter.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCounter.setHorizontalAlignment(SwingConstants.CENTER);
        lblCounter.setBounds(10, 171, 414, 16);
        getContentPane().add(lblCounter);
    }



}