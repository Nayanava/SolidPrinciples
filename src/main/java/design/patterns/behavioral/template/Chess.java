package design.patterns.behavioral.template;
/**
 * @author nayanava
 */

import java.io.*;

public class Chess extends Game{

    public Chess() {
        super(2);
    }
    @Override
    protected int getWinningPlayer() {
        return 0;
    }

    @Override
    protected boolean haveWinner() {
        return false;
    }

    @Override
    protected void start() {
        System.out.println("A game of chess has been started");
    }

    @Override
    protected void takeTurns() {

    }
}
