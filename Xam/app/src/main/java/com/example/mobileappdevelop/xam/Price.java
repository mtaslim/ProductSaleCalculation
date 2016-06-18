package com.example.mobileappdevelop.xam;

/**
 * Created by Mobile App Develop on 18-6-16.
 */
public class Price {
    private double productPrice;
    private double vat;
    private double discount;

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculate()
    {
        double priceWithVat = productPrice + (productPrice*vat)/100;
        double totalDiscount = (priceWithVat*discount)/100;
        double finalPrice = priceWithVat-totalDiscount;
        return finalPrice;

    }
}
