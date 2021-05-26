package com.app.mp.android.futurebucketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToVisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_visit);

        RecyclerView recyclerViewPlaces = findViewById(R.id.recycle_view_places_to_visit);

        TodoItem[] items = {
                new TodoItem("Mountain", "Climb to mountain", R.drawable.places),
                new TodoItem("Grandma", "Visit grandma", R.drawable.places),
                new TodoItem("Wind Turbine", "Learn all about wind turbines", R.drawable.places),
                new TodoItem("Desk", "Organize desk table", R.drawable.places),
                new TodoItem("Art", "Learn about japanese art", R.drawable.places),
                new TodoItem("Mountain", "Climb to mountain", R.drawable.places)
        };

        ToDoItemAdapter adapter = new ToDoItemAdapter(items, 1);

        recyclerViewPlaces.setAdapter(adapter);
    }
}