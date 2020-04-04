package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class eventMain extends AppCompatActivity {

    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_main);

        backBtn=findViewById(R.id.button7);

        backBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                sendHome();
            }
        });
    }

    public void onClickCreateEvent(View view){
        Intent intent = new Intent(this, createEvent.class);
        startActivity(intent);
    }

    public void sendHome(){
        Intent new_intent= new Intent(this, MainActivity.class);
        startActivity(new_intent);
    }

}
