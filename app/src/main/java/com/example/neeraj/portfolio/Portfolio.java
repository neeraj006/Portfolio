package com.example.neeraj.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Portfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        Button button= (Button) findViewById(R.id.spotify_streamer_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Portfolio.this,"This button will launch my Spotify Streamer App",Toast.LENGTH_SHORT);
                toast.show();

            }
        });
        Button button2= (Button) findViewById(R.id.scores_app_button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Portfolio.this,"This button will launch my Scores App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button button3= (Button) findViewById(R.id.library_app_button);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Portfolio.this,"This button will launch my Library App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button button4= (Button) findViewById(R.id.build_it_bigger_button);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Portfolio.this,"This button will launch my Gradle Project App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button button5= (Button) findViewById(R.id.xyz_reader_button);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Portfolio.this,"This button will launch my XYZ Reader App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button button6= (Button) findViewById(R.id.capstone_button);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(Portfolio.this,"This button will launch my Capstone App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}
