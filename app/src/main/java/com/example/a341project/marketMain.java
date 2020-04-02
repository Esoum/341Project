package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class marketMain extends AppCompatActivity {

    Button backBtn, sellBtn, shirtBtn, umbrellaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_main);

        sellBtn = findViewById(R.id.sellBtn);
        shirtBtn = findViewById(R.id.shirtBtn);
        umbrellaBtn = findViewById(R.id.umbrellaBtn);
        backBtn=findViewById(R.id.backBtn);

        shirtBtn.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent new_intent = new Intent(marketMain.this, shirt.class);
                startActivity(new_intent);
            }
        });

        umbrellaBtn.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent new_intent = new Intent(marketMain.this, umbrella.class);
                startActivity(new_intent);
            }
        });

        sellBtn.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent new_intent = new Intent(marketMain.this, marketSellOnItem.class);
                startActivity(new_intent);
            }
        });

        backBtn.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent new_intent = new Intent(marketMain.this, MainActivity.class);
                startActivity(new_intent);
            }
        });
    }
}
