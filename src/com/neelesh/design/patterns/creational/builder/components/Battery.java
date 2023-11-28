package com.neelesh.design.patterns.creational.builder.components;

import com.neelesh.design.patterns.creational.builder.components.enums.BatteryHealth;
import com.neelesh.design.patterns.creational.builder.components.enums.BatteryTechnology;

public class Battery {
    private int capacitymAh;
    private int currentChargePercentage;
    private boolean isCharging;
    private BatteryHealth health;
    private String manufacturer;
    private double temperatureCelsius;
    private int cycleCount;
    private BatteryTechnology technology;
    private String serialNumber;

    public Battery(int capacitymAh, int currentChargePercentage, boolean isCharging,
                   BatteryHealth health, String manufacturer, double temperatureCelsius,
                   int cycleCount, BatteryTechnology technology, String serialNumber) {
        this.capacitymAh = capacitymAh;
        this.currentChargePercentage = currentChargePercentage;
        this.isCharging = isCharging;
        this.health = health;
        this.manufacturer = manufacturer;
        this.temperatureCelsius = temperatureCelsius;
        this.cycleCount = cycleCount;
        this.technology = technology;
        this.serialNumber = serialNumber;
    }

    public int getCapacitymAh() {
        return capacitymAh;
    }

    public void setCapacitymAh(int capacitymAh) {
        this.capacitymAh = capacitymAh;
    }

    public int getCurrentChargePercentage() {
        return currentChargePercentage;
    }

    public void setCurrentChargePercentage(int currentChargePercentage) {
        this.currentChargePercentage = currentChargePercentage;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }

    public BatteryHealth getHealth() {
        return health;
    }

    public void setHealth(BatteryHealth health) {
        this.health = health;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public int getCycleCount() {
        return cycleCount;
    }

    public void setCycleCount(int cycleCount) {
        this.cycleCount = cycleCount;
    }

    public BatteryTechnology getTechnology() {
        return technology;
    }

    public void setTechnology(BatteryTechnology technology) {
        this.technology = technology;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacitymAh=" + capacitymAh +
                ", currentChargePercentage=" + currentChargePercentage +
                ", isCharging=" + isCharging +
                ", health=" + health +
                ", manufacturer='" + manufacturer + '\'' +
                ", temperatureCelsius=" + temperatureCelsius +
                ", cycleCount=" + cycleCount +
                ", technology=" + technology +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
