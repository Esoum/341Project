package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class Grad extends AppCompatActivity {
    Button homeBtn;
    Button backBtn;
    Button attendingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grad);
        homeBtn=findViewById(R.id.homeBtn);
        backBtn=findViewById(R.id.backBtn);
        attendingBtn=findViewById(R.id.attendingBtn);

        backBtn.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {finish(); }});

        homeBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(Grad.this, MainActivity.class);
                startActivity(new_intent);
            }
        });

        attendingBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"Thank you for letting us know you are attending!", Toast.LENGTH_SHORT).show();
                Intent new_intent= new Intent(Grad.this, MainActivity.class);
                startActivity(new_intent);            }
        });
    }
}
