package design.patterns.structural.proxy;
/**
 * @author nayanava
 */

import java.io.*;

public class RealTransaction implements Transaction {
    @Override
    public boolean isPinValid(String cardNumber, int[] maskedPin) {
        return true;
    }

    @Override
    public boolean isCashAvailable(String cardNumber, String accountNumber, double amountToWithdraw) {
        return true;
    }

    @Override
    public boolean withdrawCash(String cardNumber, String accountNumber, double amountToWithdraw) {
        return true;
    }
}
