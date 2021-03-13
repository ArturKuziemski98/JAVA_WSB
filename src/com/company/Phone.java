package com.company;

public class Phone {
    final String producer;
    final String model;
    final String operatingSystem;
    final Double screenSize;

    public Phone(String producer, String model, String operatingSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion() {
        return "4.23.1";
    }
}
