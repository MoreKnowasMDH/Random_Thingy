package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button);

        Drawable Array_Images[] = new Drawable[10];
        Resources res = getResources();
        Array_Images[0] = res.getDrawable(R.drawable.biking_or_walking);
        Array_Images[1] = res.getDrawable(R.drawable.employee_traning);
        Array_Images[2] = res.getDrawable(R.drawable.hero_image_first);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();

                int numberGenerated = randomNumber.nextInt(3-0) + 0;
                imageView.setImageDrawable(Array_Images[numberGenerated]);

            }
        });

    }
}