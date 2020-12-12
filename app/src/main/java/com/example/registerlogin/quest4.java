package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quest4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest4);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, quest5.class);
        startActivity(intent);
    }
}