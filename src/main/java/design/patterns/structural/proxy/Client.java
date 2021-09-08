package design.patterns.structural.proxy;
/**
 * @author nayanava
 */

import java.io.*;

public class Client {
    public static void main(String[] args) {
        ATMMachine machine = new ATMMachine();
        machine.withdrawCash("cardNumber", "accountNumber", 10000.00D);
    }
}
