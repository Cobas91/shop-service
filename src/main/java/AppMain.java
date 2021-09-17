import model.Product;
import repo.ProductRepo;
import service.ShopService;

public class AppMain {

    public static void main(String[] args) {
        ShopService shop = new ShopService(10);

        //System.out.println(shop.findProduct(3));
        System.out.println(shop.listAllProducts());

        ProductRepo products = new ProductRepo();
        products.add(new Product(1, "Banane", 1.1));
        ProductRepo products2 = new ProductRepo();
        products2.add(new Product(1, "Banane", 1.1));
        products2.add(new Product(2, "Kartoffel", 1.1));


        shop.addOrder(products);
        shop.addOrder(products2);
        //System.out.println(shop.listAllOrders());

        //System.out.println(shop.getOrderByID(0));
    }
}
