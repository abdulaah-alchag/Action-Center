package com.example.abdallah.finalassignment;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Abdallah on 14/5/2015.
 */
public class Media extends Activity {

    ImageView play1,pause1;
    ImageView play2,pause2;
    ImageView play3,pause3;
    ImageView play4,pause4;

    MediaPlayer player = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_layout);

        play1 =  (ImageView)findViewById(R.id.btn_play1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player == null) {
                    player = MediaPlayer.create(Media.this, R.raw.lets_heal_the_world);
                    player.start();
                } else {
                    player.stop();
                    player.release();
                    player = MediaPlayer.create(Media.this, R.raw.lets_heal_the_world);
                    player.start();
                }
                Toast.makeText(Media.this,"Let's Heal The World",Toast.LENGTH_SHORT).show();
            }
        });

        pause1 =  (ImageView)findViewById(R.id.btn_pause1);
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player != null && player.isPlaying()){
                    player.pause();
                    Toast.makeText(Media.this,"Paused",Toast.LENGTH_SHORT).show();
                }
            }
        });

        play2 =  (ImageView)findViewById(R.id.btn_play2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player == null) {
                    player = MediaPlayer.create(Media.this, R.raw.my_only_one);
                    player.start();
                }else{
                    player.stop();
                    player.release();
                    player = MediaPlayer.create(Media.this, R.raw.my_only_one);
                    player.start();
                }
                Toast.makeText(Media.this,"My Only One",Toast.LENGTH_SHORT).show();
            }
        });

        pause2 =  (ImageView)findViewById(R.id.btn_pause2);
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player != null && player.isPlaying()){
                    player.pause();
                    Toast.makeText(Media.this,"Paused",Toast.LENGTH_SHORT).show();
                }
            }
        });

        play3 =  (ImageView)findViewById(R.id.btn_play3);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player == null) {
                    player = MediaPlayer.create(Media.this, R.raw.satu01);
                    player.start();
                } else {
                    player.stop();
                    player.release();
                    player = MediaPlayer.create(Media.this, R.raw.satu01);
                    player.start();
                }
                Toast.makeText(Media.this,"Satu Malaysia",Toast.LENGTH_SHORT).show();
            }
        });
        pause3 =  (ImageView)findViewById(R.id.btn_pause3);
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player != null && player.isPlaying()){
                    player.pause();
                    Toast.makeText(Media.this,"Paused",Toast.LENGTH_SHORT).show();
                }
            }
        });

        play4 =  (ImageView)findViewById(R.id.btn_play4);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player == null) {
                    player = MediaPlayer.create(Media.this, R.raw.voices_of_the_future);
                    player.start();
                }else{
                    player.stop();
                    player.release();
                    player = MediaPlayer.create(Media.this, R.raw.voices_of_the_future);
                    player.start();
                }
                Toast.makeText(Media.this,"Voices of the Future",Toast.LENGTH_SHORT).show();
            }
        });
        pause4 =  (ImageView)findViewById(R.id.btn_pause4);
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player != null && player.isPlaying()){
                    player.pause();
                    Toast.makeText(Media.this,"Paused",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.stop();
        player.release();
        player = null;
    }
}
