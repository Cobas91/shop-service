package repo;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    Map<Integer, Product> productRepo = new HashMap<>();

    public ProductRepo(){

    }

    public void add(Product toAdd){
        // Add Product
    }

    public void remove(Product toRemove){
        // Remove Product
    }

    public ArrayList<Product> list(){
        return new ArrayList<>();
    }
}
