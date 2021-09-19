import interfaces.Product;
import model.Vegetables;
import repo.ProductRepo;
import service.ShopService;

public class AppMain {

    public static void main(String[] args) {
        ShopService shop = new ShopService(10);

        try{
            System.out.println(shop.findProduct(11));
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        //System.out.println(shop.listAllProducts());

        ProductRepo products = new ProductRepo();
        products.add(new Vegetables(1, "Banane", 1.1, "DE"));
        ProductRepo products2 = new ProductRepo();
        products2.add(new Vegetables(1, "Banane", 1.1,"DE"));
        products2.add(new Vegetables(2, "Kartoffel", 1.1,"DE"));


        shop.addOrder(products);
        shop.addOrder(products2);
        //System.out.println(shop.listAllOrders());

        //System.out.println(shop.getOrderByID(0));
    }
}
