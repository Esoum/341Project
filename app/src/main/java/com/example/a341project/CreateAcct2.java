package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class CreateAcct2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acct2);
    }

    public void onClickConfirm(View view){
        Intent intent = new Intent(this, MainActivity.class);


        EditText user = findViewById(R.id.editText7);
        EditText pword = findViewById(R.id.editText10);
        EditText cpword = findViewById(R.id.editText11);

        String u = user.getText().toString();
        String p = pword.getText().toString();
        String cp = cpword.getText().toString();

        if (u.isEmpty() || p.isEmpty() || cp.isEmpty()){
            Toast.makeText(getApplicationContext(),"Please enter a username and password",Toast.LENGTH_SHORT).show();
        }
        else if (!(p.equals(cp))){
            Toast.makeText(getApplicationContext(),"Password does not match",Toast.LENGTH_SHORT).show();
        }
        else{
            String filename = "users.txt";
            File f = new File(filename);
            String fileContents = u + "," + p + "\n";
            FileOutputStream outputStream;

            try {
                outputStream = openFileOutput(filename, Context.MODE_APPEND);
                outputStream.write(fileContents.getBytes());
                outputStream.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Thank you for registering",Toast.LENGTH_LONG).show();
        }




    }
}
