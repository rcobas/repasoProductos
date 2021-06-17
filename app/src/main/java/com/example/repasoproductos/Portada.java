package com.example.repasoproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Portada extends AppCompatActivity {
    ImageView ivportada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);

        ivportada=(ImageView)findViewById(R.id.ivPortada);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent().setClass(Portada.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        };
        Timer timer= new Timer();
        timer.schedule(task, 2000);
    }
}