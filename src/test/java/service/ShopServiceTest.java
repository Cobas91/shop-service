package service;

import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;
import repo.ProductRepo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    @Test
    public void testListAllProducts(){
        // GIVEN
            ShopService shop = new ShopService();
            Product apfel = new Product(1, "Apfel", 1.11);
            shop.addNewProduct(apfel);
        // WHEN
            String result = shop.listAllProducts();
        // THEN
        assertEquals("Produktnummer: 1\n" +
                "Produktbeschreibung: Apfel\n" +
                "Preis: 1.11\n" +
                "___________\n", result);
    }

    @Test
    public void testFindProduct(){
        // GIVEN
        ShopService shop = new ShopService();
        Product apfel = new Product(1, "Apfel", 1.11);
        Product birne = new Product(2, "Birne", 1.11);
        shop.addNewProduct(apfel);
        shop.addNewProduct(birne);
        // WHEN
        Product result = shop.findProduct(1);
        // THEN
        assertEquals(apfel, result);
    }

    @Test
    public void testListAllOrders(){
        // GIVEN
        ShopService shop = new ShopService();
        ProductRepo products = new ProductRepo();
        products.add(new Product(1, "Banane", 1.1));

        ProductRepo products2 = new ProductRepo();
        products2.add(new Product(1, "Banane", 1.1));
        products2.add(new Product(2, "Kartoffel", 1.1));


        shop.addOrder(products);
        shop.addOrder(products2);
        // WHEN
        String result = shop.listAllOrders();
        String expected = "Bestellnummer: 0\n" +
                "Produkte: \n" +
                "Produktnummer: 1\n" +
                "Produktbeschreibung: Banane\n" +
                "Preis: 1.1\n" +
                "___________\n" +
                "\n" +
                "Bestellnummer: 1\n" +
                "Produkte: \n" +
                "Produktnummer: 1\n" +
                "Produktbeschreibung: Banane\n" +
                "Preis: 1.1\n" +
                "___________\n" +
                "Produktnummer: 2\n" +
                "Produktbeschreibung: Kartoffel\n" +
                "Preis: 1.1\n" +
                "___________\n\n";
        // THEN
        assertEquals(expected, result);
    }

    @Test
    public void testGetOrderByID(){
        // GIVEN
        ShopService shop = new ShopService();
        ProductRepo products = new ProductRepo();
        products.add(new Product(1, "Banane", 1.1));

        ProductRepo products2 = new ProductRepo();
        products2.add(new Product(1, "Banane", 1.1));
        products2.add(new Product(2, "Kartoffel", 1.1));


        shop.addOrder(products);
        shop.addOrder(products2);
        // WHEN
        Order result = shop.getOrderByID(1);
        // THEN
        assertEquals(1, result.getOrderNumber());
    }
}