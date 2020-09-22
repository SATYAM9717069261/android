package com.example.skeleton_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button=(Button)findViewById(R.id.askButton);
        final ImageView img=(ImageView)findViewById(R.id.image_eightBall);
        final int[] img_arr={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ren=new Random();
                int num=ren.nextInt(5);
                img.setImageResource(img_arr[num]);
            }
        });

    }
}