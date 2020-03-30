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

public class search extends AppCompatActivity {

    EditText searchBox;
    Button backBtn;
    Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchBox=findViewById(R.id.searchBox);
        backBtn=findViewById(R.id.backBtn);
        searchBtn=findViewById(R.id.searchBtn);



        searchBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                verify_input();
            }
        });

        backBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                sendHome();
            }
        });

    }
    //Check that a search term has been entered then go to results page,
    // NOTE: we only set up the results page for the search term "summer" so although the text is passed onto the Results page, the results page will automatically be set to "summer"
    public void verify_input (){
        if(searchBox.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"You must enter a search term", Toast.LENGTH_SHORT).show();
            return;
        }
        //send to Results
        Bundle bundle=new Bundle();
        bundle.putCharSequence("search_term", searchBox.getText());
        Intent new_intent= new Intent(this, results.class);
        new_intent.putExtras(bundle);
        startActivity(new_intent);
    }
    //The back button will send the user home since we are only one page away from home
    public void sendHome(){
        Intent new_intent= new Intent(this, MainActivity.class);
        startActivity(new_intent);
    }
}
