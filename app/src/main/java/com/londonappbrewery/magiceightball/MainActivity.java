package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1,
                           R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5,
                            R.drawable.ball6,
                            R.drawable.ball7,
                            R.drawable.ball8,
                            R.drawable.ball9,
                            R.drawable.ball10,
                            R.drawable.ball11,
                            R.drawable.ball12,
                            R.drawable.ball13,};

        Button mybutton = (Button) findViewById(R.id.btn_KI100);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberMaker = new Random();
                int number = randomNumberMaker.nextInt(12);
                Log.d("My App","This is the number " + number);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
