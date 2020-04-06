package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class umbrella extends AppCompatActivity {

    Button homeBtn, backBtn, msgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umbrella);

        homeBtn=findViewById(R.id.homeBtn);
        backBtn=findViewById(R.id.backBtn);
        msgBtn=findViewById(R.id.msgBtn);

        backBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
               finish();        }
        });
        homeBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(umbrella.this, MainActivity.class);
                startActivity(new_intent);            }
        });
        msgBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Bundle bundle=new Bundle();
                bundle.putCharSequence("item","striped umbrella");
                Intent new_intent= new Intent(umbrella.this, messageSeller.class);
                new_intent.putExtras(bundle);
                startActivity(new_intent);            }
        });
    }

    }

