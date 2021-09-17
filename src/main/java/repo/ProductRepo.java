package repo;

import model.Product;

import java.text.DecimalFormat;
import java.util.*;

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

    public Optional<Product> getProduct(int id){
        return Optional.ofNullable(this.allProducts.get(id));
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        this.allProducts.forEach((k,v) -> {
            list.append(v);
        });
        return list.toString();
    }

        /*
            Hilfsfunktionen zum erstellen einer Produkt Datenbank.
        */
    public Map<Integer, Product> generateProduct(int amount){
        Map<Integer, Product> data = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            data.put(i , new Product(i, getRandomProductName(), getRandomPrice()));
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
        DecimalFormat df = new DecimalFormat("0,00");
        double min = 1;
        double max = 100;
        Random r = new Random();
        return Double.parseDouble(df.format(min + (max - min) * r.nextDouble()));
    }


}
