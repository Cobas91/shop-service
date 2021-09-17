package repo;

import static org.junit.jupiter.api.Assertions.*;

import model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {

    @Test
    public void TestAList(){
        // GIVE
        ProductRepo products = generateTestData();
        // WHEN
        ArrayList<Product> actual = products.list();
        // THEN
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(new Product(532, "Kirsche"));
        expected.add(new Product(134, "Apfel"));
        expected.add(new Product(12, "Banane"));
        assertEquals(expected, actual);
    }
    @Test
    public void TestAddMethod(){
        // GIVE
        ProductRepo products = generateTestData();
        Product productToAdd = new Product(10, "Zitrone");
        // WHEN
        products.add(productToAdd);
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
        products.add(new Product(134, "Apfel"));
        products.add(new Product(12, "Banane"));
        products.add(new Product(532, "Kirsche"));
        return products;
    }

}