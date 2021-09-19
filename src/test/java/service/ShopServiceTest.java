package service;

import interfaces.Product;
import model.Order;
import model.Vegetables;
import org.junit.jupiter.api.Test;
import repo.ProductRepo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShopServiceTest {
    @Test
    public void testListAllProducts(){
        // GIVEN
            ShopService shop = new ShopService();
            Product apfel = new Vegetables(1, "Apfel", 1.11, "DE");
            shop.addNewProduct(apfel);
        // WHEN
            String result = shop.listAllProducts();
        // THEN
        assertThat(result,is("Name: Apfel\n" +
                "Produktnummer: 1\n" +
                "Preis: 1.11\n" +
                "___________\n"));
    }

    @Test
    public void testFindProduct(){
        // GIVEN
        ShopService shop = new ShopService();
        Product apfel = new Vegetables(1, "Apfel", 1.11,"DE");
        Product birne = new Vegetables(2, "Birne", 1.11,"DE");
        shop.addNewProduct(apfel);
        shop.addNewProduct(birne);
        // WHEN
        Product result = shop.findProduct(1);
        // THEN
        assertThat(result,is(apfel));
    }

    @Test
    public void testListAllOrders(){
        // GIVEN
        ShopService shop = new ShopService();
        ProductRepo products = new ProductRepo();
        products.add(new Vegetables(1, "Banane", 1.1, "DE"));

        ProductRepo products2 = new ProductRepo();
        products2.add(new Vegetables(1, "Banane", 1.1, "DE"));
        products2.add(new Vegetables(2, "Kartoffel", 1.1, "DE"));


        shop.addOrder(products);
        shop.addOrder(products2);
        // WHEN
        String result = shop.listAllOrders();
        String expected = "Bestellnummer: 0\n" +
                "Produkte: \n" +
                "Name: Banane\n" +
                "Produktnummer: 1\n" +
                "Preis: 1.1\n" +
                "___________\n" +
                "\n" +
                "Bestellnummer: 1\n" +
                "Produkte: \n" +
                "Name: Banane\n" +
                "Produktnummer: 1\n" +
                "Preis: 1.1\n" +
                "___________\n" +
                "Name: Kartoffel\n" +
                "Produktnummer: 2\n" +
                "Preis: 1.1\n" +
                "___________\n\n";
        // THEN
        assertThat(result, is(expected));
    }

    @Test
    public void testGetOrderByID(){
        // GIVEN
        ShopService shop = new ShopService();
        ProductRepo products = new ProductRepo();
        products.add(new Vegetables(1, "Banane", 1.1,"DE"));

        ProductRepo products2 = new ProductRepo();
        products2.add(new Vegetables(1, "Banane", 1.1, "DE"));
        products2.add(new Vegetables(2, "Kartoffel", 1.1,"DE"));


        shop.addOrder(products);
        shop.addOrder(products2);
        // WHEN
        Order result = shop.getOrderByID(1);
        // THEN
        assertThat(result.getOrderNumber(), is(1));
    }
}