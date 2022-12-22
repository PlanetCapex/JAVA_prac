package zad1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Game theGame = new Game();
        theGame.newGame();
        theGame.setSize(new Dimension(450,300));
        theGame.setVisible(true);
    }
}
