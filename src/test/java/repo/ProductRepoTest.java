package repo;
import interfaces.Product;
import model.Vegetables;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class ProductRepoTest {

    @Test
    public void TestList(){
        // GIVE
        ProductRepo products = generateTestData();
        // WHEN
        ArrayList<Product> actual = products.list();
        // THEN
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(new Vegetables(532, "Kirsche", 1.11, "DE"));
        expected.add(new Vegetables(134, "Apfel", 1.56, "DE"));
        expected.add(new Vegetables(12, "Banane", 0.98, "DE"));
        //assertEquals(expected, actual);
        assertThat(actual, is(expected));
    }

    @Test
    public void TestAddMethod(){
        // GIVE
        ProductRepo products = generateTestData();
        Product productToAdd = new Vegetables(10, "Zitrone", 1.90, "DE");

        ArrayList<Product> expected = new ArrayList<>();
        expected.add(new Vegetables(532, "Kirsche", 1.11, "DE"));
        expected.add(new Vegetables(134, "Apfel", 1.56, "DE"));
        expected.add(new Vegetables(10, "Zitrone", 1.90, "DE"));
        expected.add(new Vegetables(12, "Banane", 0.98, "DE"));

        // WHEN
        products.add(productToAdd);
        // THEN
        assertThat(products.list(), is(expected));

    }

    @Test
    public void TestRemoveMethod(){
        // GIVE
        ProductRepo products = generateTestData();
        Product productToDelete = new Vegetables(532, "Kirsche", 1.11, "DE");

        ArrayList<Product> expected = new ArrayList<>();
        expected.add(new Vegetables(134, "Apfel",1.56, "DE"));
        expected.add(new Vegetables(12, "Banane", 0.98, "DE"));

        // WHEN
        products.remove(productToDelete);
        // THEN
        assertThat(products.list(), is(expected));
    }


    private ProductRepo generateTestData(){
        ProductRepo products = new ProductRepo();
        products.add(new Vegetables(134, "Apfel", 1.56, "DE"));
        products.add(new Vegetables(12, "Banane", 0.98, "DE"));
        products.add(new Vegetables(532, "Kirsche", 1.11, "DE"));
        return products;
    }

}