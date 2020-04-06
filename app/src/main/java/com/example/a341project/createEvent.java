package com.example.a341project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class createEvent extends AppCompatActivity {
    static final int REQUEST_IMAGE_GET = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        Button buttonLoadImage = findViewById(R.id.addphotobtn2);

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_GET && resultCode == RESULT_OK) {
            Bitmap thumbnail = data.getParcelableExtra("data");
            Uri fullPhotoUri = data.getData();

            ImageView imageView = findViewById(R.id.imageView9);
            imageView.setImageURI(fullPhotoUri);
        }
    }

    public void onClickCreatedEvent(View view){
        EditText editText12 = findViewById(R.id.editTextM12);
        EditText editText16 = findViewById(R.id.editTextM16);
        EditText editText17 = findViewById(R.id.editText17);
        if (editText12.length() > 0 && editText16.length() > 0 && editText17.length() > 0){
            Toast.makeText(this, "Your Event Has Been Created!", Toast.LENGTH_LONG).show();
            finish();
        }else{
            Toast.makeText(this, "Missing Event Data! Fill in all Entries!", Toast.LENGTH_LONG).show();
        }

    }

    public void onClickBack(View view){
        finish();
    }

    public void selectImage(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_GET);
        }
    }
}
