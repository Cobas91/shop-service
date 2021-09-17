package repo;

import static org.junit.jupiter.api.Assertions.*;

import model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {

    @Test
    public void TestAddMethod(){
        // GIVE

        // WHEN

        // THEN
    }
    @Test
    public void TestListMethod(){
        // Give
        ProductRepo allProducts = new ProductRepo();

        // WHEN

        // THEN
    }

    private ProductRepo generateTestData(){
        ProductRepo products = new ProductRepo();
        products.add(new Product(""));
    }

}