package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class messageSeller extends AppCompatActivity {

    Button homeBtn,backBtn, sendmsgBtn;
    TextView msgTitle;
    EditText msgBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_seller);

        homeBtn=findViewById(R.id.homeBtn);
        backBtn=findViewById(R.id.backBtn);
        sendmsgBtn=findViewById(R.id.sendmsgBtn);
        msgTitle=findViewById(R.id.msgTitle);
        msgBox=findViewById(R.id.msgBox);

        //Get what item you are messaging about
        msgTitle.setText("Message seller of " +getIntent().getCharSequenceExtra("item"));

        backBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(messageSeller.this, marketMain.class);
                startActivity(new_intent);            }
        });
        homeBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent new_intent= new Intent(messageSeller.this, MainActivity.class);
                startActivity(new_intent);            }
        });
        sendmsgBtn.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onClick(View view){
                verify_input();

                       }
        });
    }
    public void verify_input () {
        if (msgBox.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "You must enter a message", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "Message sent!", Toast.LENGTH_SHORT).show();
        Intent new_intent = new Intent(messageSeller.this, MainActivity.class);
        startActivity(new_intent);
    }
}


