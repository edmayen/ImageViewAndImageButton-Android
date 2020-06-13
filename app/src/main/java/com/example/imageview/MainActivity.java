package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView2);
    }

    public void image(View view) {
        imageView.setImageResource(R.drawable.ic_launcher_background);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

    }
}