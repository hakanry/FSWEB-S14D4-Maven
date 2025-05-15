package org.example.model;

public class Chocolate extends ProductForSale{

    private String mensei = "Belçika";
    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    void showDetails() {
        System.out.println(
                "Chocolate{ Type: "+getType()+
                        " Price: "+getPrice()+
                        " Description: "+getDescription()+
                        " Menşei: "+this.mensei);

    }
}
