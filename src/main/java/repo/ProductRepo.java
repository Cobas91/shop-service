package repo;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProductRepo {
    Map<Integer, Product> allProducts = new HashMap<>();

    public ProductRepo(){

    }
    public ProductRepo(int amount){
        this.allProducts = generateProduct(amount);
    }

    public ProductRepo(ArrayList<Product> products){
        for (Product product : products) {
            this.allProducts.put(product.getProductNumber(), product);
        }
    }

    public void add(Product toAdd){
        allProducts.put(toAdd.getProductNumber(), toAdd);
    }

    public void remove(Product toRemove){
        allProducts.remove(toRemove.getProductNumber());
    }

    public ArrayList<Product> list(){
        ArrayList<Product> allProductsArrayList = new ArrayList<>();
        this.allProducts.forEach((k,v) -> {
            allProductsArrayList.add(v);
        });
        return allProductsArrayList;
    }

    /*
        Hilfsfunktionen zum erstellen einer Produkt Datenbank.
     */
    public Map<Integer, Product> generateProduct(int amount){
        Map<Integer, Product> data = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            data.put(1 , new Product(i, getRandomProductName(), getRandomPrice()));
        }
        return data;
    }

    private String getRandomProductName(){
        String[] names = new String[19];
        names[0] = "Banane";
        names[1] = "Zitrone";
        names[2] = "Kirsche";
        names[3] = "Birne";
        names[4] = "Tomate";
        names[5] = "Gurke";
        names[6] = "Zuchini";
        names[7] = "Knoblauch";
        names[8] = "Eisbergsalat";
        names[9] = "Feldsalat";
        names[10] = "Weis Kohl";
        names[11] = "Rot Kohl";
        names[12] = "Ingwer";
        names[13] = "Lauch";
        names[14] = "Zwiebeln";
        names[15] = "Kartoffeln";
        names[16] = "Schnittlauch";
        names[17] = "Porree";
        names[18] = "Paprika";
        return names[(int)(Math.random()*19)];
    }

    private double getRandomPrice(){
        double min = 0.50;
        double max = 2.90;
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }


}
