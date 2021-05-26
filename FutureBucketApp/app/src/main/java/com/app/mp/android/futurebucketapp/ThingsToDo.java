package com.app.mp.android.futurebucketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView recyclerViewItems = findViewById(R.id.recycle_view_things_todo);

        TodoItem[] items = {
                new TodoItem("Mountain", "Climb to mountain", R.drawable.things),
                new TodoItem("Grandma", "Visit grandma", R.drawable.things),
                new TodoItem("Wind Turbine", "Learn all about wind turbines", R.drawable.things),
                new TodoItem("Desk", "Organize desk table", R.drawable.things),
                new TodoItem("Art", "Learn about japanese art", R.drawable.things),
                new TodoItem("Mountain", "Climb to mountain", R.drawable.things),
                new TodoItem("Grandma", "Visit grandma", R.drawable.things),
                new TodoItem("Wind Turbine", "Learn all about wind turbines", R.drawable.things),
                new TodoItem("Desk", "Organize desk table", R.drawable.things),
                new TodoItem("Art", "Learn about japanese art", R.drawable.things),
                new TodoItem("Mountain", "Climb to mountain", R.drawable.things),
                new TodoItem("Grandma", "Visit grandma", R.drawable.things),
                new TodoItem("Wind Turbine", "Learn all about wind turbines", R.drawable.things),
                new TodoItem("Desk", "Organize desk table", R.drawable.things),
                new TodoItem("Art", "Learn about japanese art", R.drawable.things)
        };

        ToDoItemAdapter adapter = new ToDoItemAdapter(items, 0);

        recyclerViewItems.setAdapter(adapter);
    }
}