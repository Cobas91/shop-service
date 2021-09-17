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
        return "";
    }

    public Product findProduct(String name){
        return products.getProduct("Banane");
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
