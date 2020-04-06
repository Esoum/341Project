package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LogIn extends AppCompatActivity {
    ArrayList<String[]> up = new ArrayList<String[]>();
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        String file = "users.txt";

        try {
            FileInputStream fis = openFileInput(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] l = line.split(",");
                up.add(l);
            }

        }catch (FileNotFoundException e){
            Toast.makeText(getApplicationContext(),"Please create an account",Toast.LENGTH_LONG).show();
            finish();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    protected void onResume(Bundle saveInstanceState){
        flag = false;
    }

    public void onClickLogIn(View view) {
       // Intent intent = new Intent(this, MainActivity.class);

        EditText user;
        EditText pword;
        user = findViewById(R.id.editText8);
        pword = findViewById(R.id.editText9);
        String username = user.getText().toString();
        String password = pword.getText().toString();

        for (int i = 0; i < up.size(); i++){
            if (up.get(i)[0].equals(username)){
                if(up.get(i)[1].equals(password)){
                    Toast.makeText(getApplicationContext(),"Thank you for logging in",Toast.LENGTH_LONG).show();
                    flag = true;
                    finish();
                }
                else
                    Toast.makeText(getApplicationContext(),"Your password is incorrect",Toast.LENGTH_SHORT).show();
            }
        }
        if (flag == false)
            Toast.makeText(getApplicationContext(),"Please enter a valid username and password",Toast.LENGTH_SHORT).show();
    }

    public void onClickBack(View view){
        finish();
    }

}
