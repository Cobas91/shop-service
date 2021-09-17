package model;

import repo.ProductRepo;

import java.util.Objects;

public class Order {
    private int orderNumber;
    private ProductRepo allProducts;

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
