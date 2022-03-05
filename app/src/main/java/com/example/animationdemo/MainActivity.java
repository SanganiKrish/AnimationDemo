package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button buttonBlink,buttonFade,buttonMove,buttonRotate,buttonSlide,buttonZoom,buttonStop;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBlink = findViewById(R.id.buttonBlink);
        buttonFade = findViewById(R.id.buttonFade);
        buttonMove = findViewById(R.id.buttonMove);
        buttonRotate = findViewById(R.id.buttonRotate);
        buttonSlide = findViewById(R.id.buttonSlide);
        buttonZoom = findViewById(R.id.buttonZoom);
        buttonStop = findViewById(R.id.buttonStop);

        imageView = findViewById(R.id.imageView);

        getSupportActionBar().hide();

        buttonClick();

    }

    public void buttonClick() {

        buttonBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_animation);
                imageView.startAnimation(animation);

            }
        });

        buttonFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_animation);
                imageView.startAnimation(animation);

            }
        });

        buttonMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move_animation);
                imageView.startAnimation(animation);

            }
        });

        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_animation);
                imageView.startAnimation(animation);

            }
        });

        buttonSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_animation);
                imageView.startAnimation(animation);

            }
        });

        buttonZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_animation);
                imageView.startAnimation(animation);

            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.clearAnimation();
            }
        });
    }

}