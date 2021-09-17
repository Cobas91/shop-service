package service;

import model.Order;
import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;

public class ShopService {
    private ProductRepo products;
    private OrderRepo orders = new OrderRepo();

    public ShopService(int productRepoAmount){
        this.products = new ProductRepo(productRepoAmount);
    }

    public String listAllProducts(){
        return this.products.toString();
    }

    public Product findProduct(int id){
        return products.getProduct(id);
    }

    public void addNewProduct(){
        // Add Product to product repo.
    }

    //TODO COULD BE NULL
    public String listAllOrders(){
        return this.orders.toString();
    }

    public void addOrder(ProductRepo products){
        int orderNumber = orders.list().size();
        Order order = new Order(products,orderNumber);
        orders.add(order);
    }

    public Order getOrderByID(int id){
        return orders.getOrderByID(id);
    }


}
