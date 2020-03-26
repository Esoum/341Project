package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CreateAcct2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acct2);
    }

    public void onClickConfirm(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        Toast.makeText(getApplicationContext(),"Thank you for registering",Toast.LENGTH_LONG).show();

    }
}
