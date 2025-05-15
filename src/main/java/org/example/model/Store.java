package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] product = new ProductForSale[3];
        product[0] = new Bread("Çavdar",25.2,"Çavdarlı");
        product[1] = new Coke("Siyah",60.6,"Gazlı");
        product[2] = new Chocolate("Bitter",40.4,"Çikolata");
        listProducts(product);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}