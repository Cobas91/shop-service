import service.ShopService;

public class AppMain {

    public static void main(String[] args) {
        ShopService shop = new ShopService(50);

        //System.out.println(shop.findProduct(3));
        System.out.println(shop.listAllProducts());
    }
}
