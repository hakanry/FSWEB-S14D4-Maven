package org.example.model;

public class Bread extends ProductForSale{
    private double weight = 0.22;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
     public void showDetails() {
        System.out.println(
                "Bread{ Type: "+getType()+
                " Price: "+getPrice()+
                " Description: "+getDescription()+
                " Weight: "+this.weight);
    }


}
