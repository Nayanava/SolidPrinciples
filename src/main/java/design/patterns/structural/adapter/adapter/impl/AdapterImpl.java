package design.patterns.structural.adapter.adapter.impl;
/**
 * @author nayanava
 */

import design.patterns.structural.adapter.WeatherReport;
import design.patterns.structural.adapter.adapter.IAdapter;

import java.io.*;

public class AdapterImpl implements IAdapter {
    WeatherReport weatherReport;
    public AdapterImpl() {
        this.weatherReport = new WeatherReport();
    }
    @Override
    public double weatherReportInCelsius() {
        double tempInFahrenheit = weatherReport.temperatureInFahrenheit();
        return (tempInFahrenheit - 32)*5/9;
    }
}
