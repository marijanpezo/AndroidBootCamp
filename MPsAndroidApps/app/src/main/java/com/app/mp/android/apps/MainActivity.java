package com.app.mp.android.apps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycle_view_apps);

        Project[] projects = {
                new Project("Getting Started App", "My First project, the default 'Hello world' app", R.drawable.getting_started),
                new Project("FavouriteQuote", "My Second project, motivational quote application", R.drawable.quote),
                new Project("BMI Calculator", "My Third project, BMI calculator", R.drawable.calculator),
                new Project("Calculation App", "My Fourth project, Inches convert to meters", R.drawable.tape),
                new Project("Foody Developer", "My Fifth project, restaurant application", R.drawable.hungry_developer),

        };


        ProjectsAdapter projectsAdapter = new ProjectsAdapter(projects);

        list.setAdapter(projectsAdapter);

        
    }
}