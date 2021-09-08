package design.patterns.behavioral.template;
/**
 * @author nayanava
 */

import java.io.*;

public abstract class Game {
    protected int currentPlayer;
    protected int numberOfPlayers;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void run() {
        start();
        while(!haveWinner()) {
            takeTurns();
        }
        System.out.println("Player " + getWinningPlayer() + " wins");
    }

    protected abstract int getWinningPlayer();
    protected abstract boolean haveWinner();
    protected abstract void start();
    protected abstract void takeTurns();
}
