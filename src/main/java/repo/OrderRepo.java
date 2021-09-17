package repo;

import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    Map<Integer, Order> orders = new HashMap<>();

    public OrderRepo(Order order){
        this.orders.put(order.getOrderNumber(), order);
    }
    public OrderRepo(){

    }

    public void add(Order toAdd){
        this.orders.put(toAdd.getOrderNumber(), toAdd);
    }


    public void remove(Order toRemove){
        this.orders.remove(toRemove);
    }

    public Order getOrderByID(int id){
        return this.orders.get(id);
    }

    public ArrayList<Order> list(){
        ArrayList<Order> allOrdersArrayList = new ArrayList<>();
        this.orders.forEach((k,v) -> {
            allOrdersArrayList.add(v);
        });
        return allOrdersArrayList;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        this.orders.forEach((k,v) -> {
            list.append(v);
        });
        return list.toString();
    }
}
