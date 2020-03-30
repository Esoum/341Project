package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class teletubbies extends AppCompatActivity {

    Button homeBtn;
    Button backBtn;
    Button attendingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teletubbies);

        homeBtn=findViewById(R.id.homeBtn);
        backBtn=findViewById(R.id.backBtn);
        attendingBtn=findViewById(R.id.attendingBtn);

        backBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(teletubbies.this, results.class);
                startActivity(new_intent);            }
        });
        homeBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(teletubbies.this, MainActivity.class);
                startActivity(new_intent);            }
        });
        attendingBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"Thank you for letting us know you are attending!", Toast.LENGTH_SHORT).show();
                Intent new_intent= new Intent(teletubbies.this, MainActivity.class);
                startActivity(new_intent);            }
        });
    }
}

