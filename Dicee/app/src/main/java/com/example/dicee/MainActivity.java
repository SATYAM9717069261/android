package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton=(Button)findViewById(R.id.roll_button);

        final ImageView LeftDice=(ImageView)findViewById(R.id.image_leftDice);
        final ImageView RightDice=(ImageView)findViewById(R.id.image_RightDice);

        final int[] diceArray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6 };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Log.d("Dicee","Button Pessed");

                Random randomNumGen=new Random();
                int num=randomNumGen.nextInt(6);
                LeftDice.setImageResource(diceArray[num]);
                RightDice.setImageResource(diceArray[num]);
            }
        });

    }
}