package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSearch(View view){

    }

    public void onClickEvents(View view){
        Intent intent = new Intent(this, eventMain.class);
        startActivity(intent);
    }

    public void onClickMarket(View view){

    }

    public void onClickLogIn(View view){
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }

    public void onClickCreateAcct(View view){
        Intent intent = new Intent(this, CreateAcct.class);
        startActivity(intent);
    }
}
