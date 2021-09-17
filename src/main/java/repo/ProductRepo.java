package repo;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    Map<Integer, Product> allProducts = new HashMap<>();

    public ProductRepo(){

    }

    public void add(Product toAdd){
        allProducts.put(toAdd.getProductNumber(), toAdd);
    }

    public void remove(Product toRemove){
        allProducts.remove(toRemove.getProductNumber());
    }

    public ArrayList<Product> list(){
        return new ArrayList<>();
    }
}
