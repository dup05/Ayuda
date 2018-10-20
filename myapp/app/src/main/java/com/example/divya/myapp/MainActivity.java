package com.example.divya.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView card_view = (CardView) findViewById(R.id.cardView);

        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // do whatever you want to do on click (to launch any fragment or activity you need to put intent here.)

                Intent intent = new Intent(MainActivity.this, Services.class);
                startActivity(intent);
            }
        });


    }

}
