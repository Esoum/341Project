package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class marketMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_main);
    }
    public void onClickMarketSellOnItem(View view){
        Intent intent = new Intent(this, marketSellOnItem.class);
        startActivity(intent);
    }

}
