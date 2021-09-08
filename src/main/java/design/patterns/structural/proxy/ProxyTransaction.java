package design.patterns.structural.proxy;
/**
 * @author nayanava
 */

import java.io.*;

public class ProxyTransaction implements Transaction {

    RealTransaction realTransaction;
    public ProxyTransaction() {
        realTransaction = new RealTransaction();
    }
    @Override
    public boolean isPinValid(String cardNumber, int[] maskedPin) {
        return realTransaction.isPinValid(cardNumber, maskedPin);
    }

    @Override
    public boolean isCashAvailable(String cardNumber, String accountNumber, double amountToWithdraw) {

        return realTransaction.isCashAvailable(cardNumber, accountNumber, amountToWithdraw);
    }

    @Override
    public boolean withdrawCash(String cardNumber, String accountNumber, double amountToWithdraw) {
        return realTransaction.withdrawCash(cardNumber, accountNumber, amountToWithdraw);
    }
}
