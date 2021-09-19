package model;

import interfaces.Product;

import java.util.Objects;

public class Vegetables implements Product {
    private String description;
    private int productNumber;
    private double price;
    private String country;

    public Vegetables(int productNumber, String description, double price, String country){
        this.productNumber = productNumber;
        this.description = description;
        this.price = price;
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String country(){
        return this.country;
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

    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        return
                "Name: "+this.description+ newLine +
                        "Produktnummer: "+this.productNumber + newLine+
                        "Preis: "+this.price+ newLine +
                        "___________"+newLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetables that = (Vegetables) o;
        return productNumber == that.productNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNumber);
    }
}
