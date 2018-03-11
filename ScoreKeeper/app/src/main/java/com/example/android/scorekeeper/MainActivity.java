package com.example.android.scorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Saves the score for each team
    private int a;
    private int b;
    TextView scoreA;
    TextView scoreB;
    Button pointA;
    Button pointB;
    Button sweepA;
    Button sweepB;
    Button euchreA;
    Button euchreB;
    Button easA;
    Button easB;
    Button soloA;
    Button soloB;
    Button renegeA;
    Button renegeB;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sets the default score to zero
        a = 0;
        b = 0;

        scoreA = findViewById(R.id.scoreA);
        scoreB = findViewById(R.id.scoreB);
        pointA = findViewById(R.id.pointA);
        pointB = findViewById(R.id.pointB);
        sweepA = findViewById(R.id.sweepA);
        sweepB = findViewById(R.id.sweepB);
        euchreA = findViewById(R.id.euchreA);
        euchreB = findViewById(R.id.euchreB);
        easA = findViewById(R.id.easA);
        easB = findViewById(R.id.easB);
        soloA = findViewById(R.id.soloA);
        soloB = findViewById(R.id.soloB);
        renegeA = findViewById(R.id.renegeA);
        renegeB = findViewById(R.id.renegeB);
        reset = findViewById(R.id.reset);

        scoreA.setText("Score: " + a);
        scoreB.setText("Score: " + b);

        pointA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addA(1);
            }
        });

        pointB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addB(1);
            }
        });

        sweepA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addA(2);
            }
        });

        sweepB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addB(2);
            }
        });

        euchreA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addA(2);
            }
        });

        euchreB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addB(2);
            }
        });

        easA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addA(3);
            }
        });

        easB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addB(3);
            }
        });

        soloA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addA(4);
            }
        });

        soloB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addB(4);
            }
        });

        renegeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addA(2);
            }
        });

        renegeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addB(2);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

    }

    private void addA(int amount) {
        a += amount;
        scoreA.setText("Score: " + a);
    }

    private void addB(int amount) {
        b += amount;
        scoreB.setText("Score: " + b);
    }

    private void reset() {
        a = 0;
        b = 0;
        scoreA.setText("Score: " + a);
        scoreB.setText("Score: " + b);
    }


}
