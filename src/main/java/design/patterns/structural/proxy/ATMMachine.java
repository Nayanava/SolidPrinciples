package design.patterns.structural.proxy;
/**
 * @author nayanava
 */

import java.io.*;

public class ATMMachine {

    ProxyTransaction proxyTransaction;
    ATMMachine() {
        proxyTransaction = new ProxyTransaction();
    }

    void withdrawCash(String cardNumber, String accountNumber, double amount) {
        if (proxyTransaction.isCashAvailable(cardNumber, accountNumber, amount)) {
            if (proxyTransaction.withdrawCash(cardNumber, accountNumber, amount)) {
                System.out.println("Cash has been withdrawn successfully");
            }
        }
    }
}
