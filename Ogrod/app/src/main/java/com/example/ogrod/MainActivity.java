package com.example.ogrod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] list = {"#FFC300", "#FF5733", "#C70039", "#900C3F", "#581845"};

        Random rand = new Random();

        final Button button = (Button) findViewById(R.id.button_id);
        final View view = (View) findViewById(R.id.view);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                int index = rand.nextInt(list.length);

                int color = Color.parseColor(list[index]);
                view.setBackgroundColor(color);
                //Intent activityChangeIntent = new Intent(MainActivity.this, NextActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                //MainActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
}