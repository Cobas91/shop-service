package repo;

import static org.junit.jupiter.api.Assertions.*;

import model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {

    @Test
    public void TestList(){
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

        ArrayList<Product> expected = new ArrayList<>();
        expected.add(new Product(532, "Kirsche"));
        expected.add(new Product(134, "Apfel"));
        expected.add(new Product(10, "Zitrone"));
        expected.add(new Product(12, "Banane"));

        // WHEN
        products.add(productToAdd);
        // THEN
        assertEquals(expected, products.list());

    }

    @Test
    public void TestRemoveMethod(){
        // GIVE
        ProductRepo products = generateTestData();
        Product productToDelete = new Product(532, "Kirsche");

        ArrayList<Product> expected = new ArrayList<>();
        expected.add(new Product(134, "Apfel"));
        expected.add(new Product(12, "Banane"));

        // WHEN
        products.remove(productToDelete);
        // THEN
        assertEquals(expected, products.list());
    }


    private ProductRepo generateTestData(){
        ProductRepo products = new ProductRepo();
        products.add(new Product(134, "Apfel"));
        products.add(new Product(12, "Banane"));
        products.add(new Product(532, "Kirsche"));
        return products;
    }

}