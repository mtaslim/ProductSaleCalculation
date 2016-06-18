package com.example.mobileappdevelop.xam;

public class ProductPrice {
    private double price;
    private double vat;
    private double discount;

    public ProductPrice(double price1, double vat1, double discount1) {
        price = price1;
        this.vat = vat1;
        this.discount = discount1;
    }

    public double calculate()
    {
        double priceWithVat = price + (price*vat)/100;
        double totalDiscount = (priceWithVat*discount)/100;
        double finalPrice = priceWithVat-totalDiscount;
        return finalPrice;

    }
}
