package repo;


import model.Order;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    @DisplayName("Test list Method init the OrderRepo with one order in it")
    public void testListMethod(){
        // GIVE
        ProductRepo productList = new ProductRepo(5);

        Order order = new Order(productList, 1);

        OrderRepo orders = new OrderRepo(order);
        // WHEN
        int actual = orders.list().size();
        // THEN
        assertEquals(1,actual);

    }

    @Test
    @DisplayName("Test add Method with 1 order in the order list")
    public void testAddMethod(){
        // GIVE
        ProductRepo productList = new ProductRepo(5);
        ProductRepo productList2 = new ProductRepo(5);

        Order order = new Order(productList, 1);
        Order order2 = new Order(productList, 1);

        OrderRepo orders = new OrderRepo(order);
        // WHEN
        orders.add(order2);
        // THEN
        assertEquals(2,orders.getOrders().size());

    }

}