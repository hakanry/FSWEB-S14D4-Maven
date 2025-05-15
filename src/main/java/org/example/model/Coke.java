package org.example.model;

public class Coke extends ProductForSale{
    private  double litre=2.5;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println(
                "Coke{ Type: "+getType()+
                        " Price: "+getPrice()+
                        " Description: "+getDescription()+
                        " Litre: "+this.litre);

    }
}
