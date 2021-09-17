package model;

import java.util.Objects;

public class Product {
    private int productNumber;
    private String productDiscription;

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productDiscription='" + productDiscription + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productNumber == product.productNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNumber);
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price;


}
