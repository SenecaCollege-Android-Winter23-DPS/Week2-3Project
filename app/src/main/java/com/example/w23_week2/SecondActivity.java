package com.example.w23_week2;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

// R.java
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView myImage = findViewById(R.id.image1);
        myImage.setImageResource(R.drawable.image2);

        Log.d("SecondActivity",R.drawable.image2 + "");
        Log.d("SecondActivity",R.id.buttonLayout + "");

    }
}
