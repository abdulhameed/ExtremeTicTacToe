package com.example.android.completetictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button single3Btn;
    Button multi3Btn;
    Button single5Btn;
    Button multi5Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        single3Btn = findViewById(R.id.singlePlayer);
        multi3Btn = findViewById(R.id.multiPlayer);
        single5Btn = findViewById(R.id.singlePlayer5);
        multi5Btn = findViewById(R.id.multiPlayer5);

        single3Btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent singlePlayerIntent = new Intent(MainActivity.this, singlePlayer3.class);
                startActivity(singlePlayerIntent);

            }
        });

        multi3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent multiPlayerIntent = new Intent(MainActivity.this, multiPlayer3.class);
                startActivity(multiPlayerIntent);

            }
        });

        single5Btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent singlePlayer5Intent = new Intent(MainActivity.this, singlePlayer5.class);
                startActivity(singlePlayer5Intent);

            }
        });

        multi5Btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent multiPlayer5Intent = new Intent(MainActivity.this, multiPlayer5.class);
                startActivity(multiPlayer5Intent);

            }
        });


    }
}
