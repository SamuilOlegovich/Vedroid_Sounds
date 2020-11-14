package com.samuilolegovich.vedroid_sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    private MediaPlayer catSound;
    private MediaPlayer dogSound;
    private ImageView cat;
    private ImageView dog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // крепим звук
        catSound = MediaPlayer.create(this, R.raw.cv1);
        dogSound = MediaPlayer.create(this, R.raw.dv1);

        cat = (ImageView) findViewById(R.id.cat);
        dog = (ImageView) findViewById(R.id.dog);


        imageClick();
    }

    public void imageClick() {
        cat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay(catSound);

                    }
                }
        );
        dog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        soundPlay(dogSound);
                    }
                }
        );
    }



    private void soundPlay(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}