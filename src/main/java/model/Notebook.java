package model;

import interfaces.Hardware;
import interfaces.Product;

public class Notebook implements Hardware,Product {
    private String serialNumber;
    private String macAddress;
    private String description;
    private int productNumber;
    private double price;

    @Override
    public String getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public String getMacAddress() {
        return this.macAddress;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getProductNumber() {
        return this.productNumber;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
