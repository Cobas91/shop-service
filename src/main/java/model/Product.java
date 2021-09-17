package model;

import java.util.Objects;

public class Product {
    private int productNumber;
    private String productDiscription;
    private double price;

    public Product(int productNumber, String productDiscription, double price){
        this.productNumber = productNumber;
        this.productDiscription = productDiscription;
        this.price = price;
    }
    @Override
    public String toString(){
        String newLine = System.getProperty("line.separator");
        return
                "Produktnummer: "+this.productNumber+ newLine +
                        "Produktbeschreibung: "+this.productDiscription+ newLine+
                        "Preis: "+this.price+ newLine +
                        "___________"+newLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productDiscription, product.productDiscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDiscription);
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductDiscription() {
        return productDiscription;
    }

    public void setProductDiscription(String productDiscription) {
        this.productDiscription = productDiscription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
