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

public class results extends AppCompatActivity {

    Button backBtn;
    Button eventBtn;
    Button shirtBtn;
    Button umbrellaBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        backBtn=findViewById(R.id.backBtn);
        eventBtn=findViewById(R.id.eventBtn);
        shirtBtn=findViewById(R.id.shirtBtn);
        umbrellaBtn=findViewById(R.id.umbrellaBtn);

        backBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(results.this, search.class);
                startActivity(new_intent);            }
        });

        eventBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(results.this, teletubbies.class);
                startActivity(new_intent);            }
        });

        /* Add these back in once we have postings created.
        shirtBtn.setOnClickListener(new AdapterView.OnClickListener(){
           @Override
          public void onClick(View view){
                Intent new_intent= new Intent(results.this, shirt.class);
                startActivity(new_intent);            }
        });

        umbrellaBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(results.this, umbrella.class);
                startActivity(new_intent);            }
        });
    */
    }
}
