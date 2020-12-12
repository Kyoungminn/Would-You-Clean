package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class check_todolist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_todolist);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, init_screen.class);
        startActivity(intent);
    }

}