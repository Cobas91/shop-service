package model;

import repo.OrderRepo;
import repo.ProductRepo;

import java.util.Objects;

public class Order {
    private int orderNumber;
    private ProductRepo allProducts;

    public Order(ProductRepo allProducts, int orderNumber){
        this.allProducts = allProducts;
        this.orderNumber = orderNumber;
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
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", allProducts=" + allProducts +
                '}';
    }
}
