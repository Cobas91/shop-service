package service;

import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;

public class ShopService {
    private ProductRepo products;
    private OrderRepo orders;

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

    public String listAllOrders(){
        return "";
    }

    public Product getProductByID(int id){
        return new Product(1, "", 5.5);
    }
}
