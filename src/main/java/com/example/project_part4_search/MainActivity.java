package com.example.project_part4_search;

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

public class MainActivity extends AppCompatActivity {
//This is a fake home page just for testing
    Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBtn=findViewById(R.id.searchBtn);


        searchBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                verify_input();
            }
        });


    }
    //Check that a search term has been entered then go to results page,
    // NOTE: we only set up the results page for the search term "summer" so although the text is passed onto the Results page, the results page will automatically be set to "summer"
    public void verify_input (){
        //send to Results
        Intent new_intent= new Intent(this, results.class);
        startActivity(new_intent);
    }
}
