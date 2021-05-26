package com.app.mp.android.futurebucketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardViewThingsTodo = findViewById(R.id.card_view_todo_things);
        CardView cardViewPlacesToVisit = findViewById(R.id.card_view_todo_places);


        cardViewThingsTodo.setOnClickListener(view -> {
            Intent intentThingsToDo = new Intent(MainActivity.this, ThingsToDo.class);
            startActivity(intentThingsToDo);
        });


        cardViewPlacesToVisit.setOnClickListener(view -> {
            Intent intentPlacesToVisit = new Intent(MainActivity.this, PlacesToVisit.class);
            startActivity(intentPlacesToVisit);
        });

    }
}