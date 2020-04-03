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
    public void onClickItem1(View view){
        Intent intent = new Intent(this, item1.class);
        startActivity(intent);
    }
    public void onClickItem2(View view){
        Intent intent = new Intent(this, item2.class);
        startActivity(intent);
    }
    public void onClickItem3(View view){
        Intent intent = new Intent(this, item3.class);
        startActivity(intent);
    }
    public void onClickItem4(View view){
        Intent intent = new Intent(this, item4.class);
        startActivity(intent);
    }
    public void onClickItem5(View view){
        Intent intent = new Intent(this, item5.class);
        startActivity(intent);
    }
    public void onClickItem6(View view){
        Intent intent = new Intent(this, item6.class);
        startActivity(intent);
    }

}
