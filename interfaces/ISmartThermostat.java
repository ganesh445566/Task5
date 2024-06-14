package org.interfaces;

public interface ISmartThermostat extends ISmartDevice {
    void setTemperature(double temperature);
    double getTemperature();
}
