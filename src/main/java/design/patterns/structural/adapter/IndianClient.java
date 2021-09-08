package design.patterns.structural.adapter;
/**
 * @author nayanava
 */

import design.patterns.structural.adapter.adapter.IAdapter;
import design.patterns.structural.adapter.adapter.impl.AdapterImpl;

import java.io.*;

public class IndianClient {
    public static void main(String[] args) {
        IAdapter adapter = new AdapterImpl();
        System.out.println(adapter.weatherReportInCelsius());
    }
}
