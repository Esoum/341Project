package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateAcct extends AppCompatActivity {

    static final int REQUEST_IMAGE_GET = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acct);

        Button buttonLoadImage = findViewById(R.id.addphotobtn);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_GET && resultCode == RESULT_OK) {
            Bitmap thumbnail = data.getParcelableExtra("data");
            Uri fullPhotoUri = data.getData();

            ImageView imageView = findViewById(R.id.imageView3);
            imageView.setImageURI(fullPhotoUri);
        }
    }

        public void onClickBack (View view){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        public void onClickContinue (View view){
            Intent intent = new Intent(this, CreateAcct2.class);

            EditText fname = findViewById(R.id.editText);
            EditText lname = findViewById(R.id.editText2);
            String f = fname.getText().toString();
            String l = lname.getText().toString();

            if (f.isEmpty() || l.isEmpty()){
                Toast.makeText(getApplicationContext(),"Please enter a name",Toast.LENGTH_SHORT).show();
            }
            else
                startActivity(intent);
        }

        public void selectImage(View view) {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("image/*");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(intent, REQUEST_IMAGE_GET);
            }
        }

}
