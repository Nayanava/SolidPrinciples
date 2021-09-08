package design.patterns.structural.proxy;
/**
 * @author nayanava
 */

import java.io.*;

public interface Transaction {
    boolean isPinValid(String cardNumber, int[] maskedPin);
    boolean isCashAvailable(String cardNumber, String accountNumber, double amountToWithdraw);
    boolean withdrawCash(String cardNumber, String accountNumber, double amountToWithdraw);
}
