package repo;

import model.Order;

import java.util.ArrayList;

public class OrderRepo {
    ArrayList<Order> orders = new ArrayList<>();

    public OrderRepo(Order order){
        this.orders.add(order);
    }

    public ArrayList<Order> getOrders(){
        return this.orders;
    }

    public void add(Order toAdd){
        this.orders.add(toAdd);
    }

    public void remove(Order toRemove){
        this.orders.remove(toRemove);
    }

    public ArrayList<Order> list(){
        return this.orders;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
}
