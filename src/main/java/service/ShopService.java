package service;

import model.Order;
import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;

import java.util.Optional;

public class ShopService {
    private ProductRepo products;
    private OrderRepo orders = new OrderRepo();

    /**
     * Creating a Instance of a Shop System.
     * The prodcutRepoAmount argument can be set to get a random amount of Prodcuts based on that value.
     * <p>
     * @see #addOrder(ProductRepo)
     * @see #listAllOrders()
     * @see #getOrderByID(int)
     * @see #listAllProducts()
     * @see #findProduct(int)
     *
     * @param  productRepoAmount  the amount of automaticly generated Products.
     */
    public ShopService(int productRepoAmount){
        this.products = new ProductRepo(productRepoAmount);
    }
    public ShopService(){
        this.products = new ProductRepo();
    }

    public String listAllProducts(){
        return this.products.toString();
    }

    public Product findProduct(int id) throws RuntimeException{
        Optional<Product> product = this.products.getProduct(id);
        if(product.isPresent()){
            return product.get();
        }else{
            throw new RuntimeException("Can´t find Product with ID: "+id);
        }
    }

    public void addNewProduct(Product toAdd){
        this.products.add(toAdd);
    }

    //TODO COULD BE NULL
    public String listAllOrders(){
        return this.orders.toString();
    }
    /**
     * Add Order .
     * The prodcutRepoAmount argument can be set to get a random amount of Prodcuts based on that value.
     * <p>
     * @param products Typ ProductRepo
     */
    public void addOrder(ProductRepo products){
        int orderNumber = orders.list().size();
        Order order = new Order(products,orderNumber);
        orders.add(order);
    }

    public Order getOrderByID(int id){
        return orders.getOrderByID(id);
    }


}
