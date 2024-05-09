package com.example.mymediaplayer;

import static com.example.mymediaplayer.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        VideoView shri_ram=findViewById(id.shri_ram);
        shri_ram.setVideoPath("android.resource://" + getPackageName()+"/"+ raw.shri_ram);
        MediaController mediaController=new MediaController(this);
        shri_ram.setMediaController(mediaController);
        mediaController.setAnchorView(shri_ram);
        shri_ram.start();
    }
}