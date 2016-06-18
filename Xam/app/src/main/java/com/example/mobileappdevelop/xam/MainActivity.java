package com.example.mobileappdevelop.xam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText EditTextProductPrice,EditTextVat,EditTextDiscount;
    TextView TextViewFinalPrice;

    double productPrice, vat, discount;
    double priceWithVat, totalDiscount, finalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextProductPrice = (EditText) findViewById(R.id.EditTextProductPrice);
        EditTextVat = (EditText) findViewById(R.id.EditTextVat);
        EditTextDiscount = (EditText) findViewById(R.id.EditTextDiscount);
        TextViewFinalPrice = (TextView) findViewById(R.id.TextViewFinalPrice);
    }

    public void FinalPrice(View view) {
        productPrice = Double.parseDouble(EditTextProductPrice.getText().toString());
        vat = Double.parseDouble(EditTextVat.getText().toString());
        discount=Double.parseDouble(EditTextDiscount.getText().toString());

        // /* without Object Oriented
        priceWithVat = productPrice + (productPrice*vat)/100;
        totalDiscount = (priceWithVat*discount)/100;
        finalPrice = priceWithVat-totalDiscount;
        //*/

        /*//  With Construction
        ProductPrice productPriceObject = new ProductPrice(productPrice,vat,discount);
        finalPrice=productPriceObject.calculate();
        //*/

        /*//with getter setter
        Price priceObject = new Price();
        priceObject.setProductPrice(productPrice);
        priceObject.setVat(vat);
        priceObject.setDiscount(discount);
        finalPrice=priceObject.calculate();
        //*/

        TextViewFinalPrice.setText(Double.toString(finalPrice));
    }
}
