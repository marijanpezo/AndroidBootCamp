package com.app.mp.android.futurebucketapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ToDoItemAdapter extends RecyclerView.Adapter<ToDoItemAdapter.TodoItemHolder> {

    private TodoItem[] todoItems;
    private int viewChoice;

    public ToDoItemAdapter(TodoItem[] todoItems, int viewChoice) {
        this.todoItems = todoItems;
        this.viewChoice = viewChoice;
    }

    @NonNull
    @Override
    public TodoItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        int layoutChoice = 0;
        if(viewChoice == 0){
           layoutChoice = R.layout.item_wish;
        }
        else if (viewChoice == 1){
            layoutChoice = R.layout.places_wish;
        }

        View view = LayoutInflater.from(parent.getContext()).inflate(layoutChoice, parent, false);
        return new TodoItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoItemAdapter.TodoItemHolder holder, int position) {
        holder.bind(todoItems[position]);
    }

    @Override
    public int getItemCount() {
        return todoItems.length;
    }

    class TodoItemHolder extends RecyclerView.ViewHolder {
        private ImageView todoIcon;
        private TextView todoTitle;
        private TextView todoDescription;


        public TodoItemHolder(@NonNull View itemView) {
            super(itemView);

            if(viewChoice == 0){
                todoIcon = itemView.findViewById(R.id.image_view_todo_icon);
                todoTitle = itemView.findViewById(R.id.text_view_todo_title);
                todoDescription = itemView.findViewById(R.id.text_view_todo_description);
            }
            else if (viewChoice == 1) {
                todoIcon = itemView.findViewById(R.id.image_view_places_icon);
                todoTitle = itemView.findViewById(R.id.text_view_places_title);
                todoDescription = itemView.findViewById(R.id.text_view_places_description);
            }


        }

        public void bind(TodoItem todoItem) {
            todoTitle.setText(todoItem.title);
            todoDescription.setText(todoItem.description);
            todoIcon.setImageResource(todoItem.icon);
        }

    }
}
