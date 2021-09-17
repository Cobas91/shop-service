package interfaces;

public interface Product {
    String getDescription();
    void setDescription(String description);

    int getProductNumber();

    double getPrice();
    void setPrice(double price);

    String toString();

    boolean equals(Object o);

    int hashCode();


}
