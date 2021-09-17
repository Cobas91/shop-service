package model;

import repo.ProductRepo;
import java.util.Objects;

public class Order {
    private int orderNumber;
    private ProductRepo allProducts;

    public Order(ProductRepo allProducts, int orderNumber){
        this.allProducts = allProducts;
        this.orderNumber = orderNumber;
    }

    public void add(Product product){
        this.allProducts.add(product);
    }

    public ProductRepo getAllProducts() {
        return allProducts;
    }

    public int getOrderNumber(){
        return this.orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }

    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        return
                "Bestellnummer: "+this.orderNumber+ newLine +
                        "Produkte: "+newLine+this.allProducts+ newLine;
    }
}
