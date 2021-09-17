package model;

import java.util.Objects;

public class Product {
    private int productNumber;
    private String productDescription;
    private double price;

    public Product(int productNumber, String productDescription, double price){
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.price = price;
    }

    @Override
    public String toString(){
        String newLine = System.getProperty("line.separator");
        return
                "Produktnummer: "+this.productNumber+ newLine +
                        "Produktbeschreibung: "+this.productDescription + newLine+
                        "Preis: "+this.price+ newLine +
                        "___________"+newLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productDescription, product.productDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDescription);
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
