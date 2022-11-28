package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Checkout Page ");
        }
    }
}