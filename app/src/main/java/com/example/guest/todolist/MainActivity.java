package com.example.guest.todolist;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ListActivity {

    private ArrayList<String> mTasks;
    private Button mNewTaskButton;
    private EditText mNewTaskText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNewTaskButton = (Button) findViewById(R.id.taskSubmitButton);
        mNewTaskText = (EditText) findViewById(R.id.newTaskText);
        mTasks = new ArrayList<>();

        mNewTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask();
            }
        });
    }

    private void addTask() {
        String newTask = mNewTaskText.getText().toString();
        mTasks.add(newTask);
    }

}
