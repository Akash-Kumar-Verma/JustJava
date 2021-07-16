package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(int number){
        TextView quantitytextView=(TextView) findViewById(R.id.quantity_text_view);
                quantitytextView.setText(" "+number);
    }
    public void submitOrder(View view) {
        int price=quantity*5;
        String message="Total:$ "+price+" \nThank You!";
        displayMessage(message);

    }

    private void displayMessage(String price) {
        TextView messageTextView =(TextView) findViewById(R.id.price_text_view);
        messageTextView.setText(price);
    }

    private void calculatePrice(int quantity) {
       int price= quantity*5;
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    int quantity=0;
    public void Increment(View view) {
        quantity++;
        display(quantity);
    }

    public void Decrement(View view) {
        quantity--;
        display(quantity);
    }
}