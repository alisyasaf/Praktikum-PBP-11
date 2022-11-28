package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("iPhone 14 Pro");
        }
        Button btnBuy = findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_buy:
                Intent moveIntent = new Intent(MainActivity.this, Checkout.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_dial:
            String phoneNumber = "08123456789";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
            startActivity(dialPhoneIntent);
        }

    }
}