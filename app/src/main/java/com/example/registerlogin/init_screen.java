package com.example.registerlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class init_screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init_screen);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, quest1.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(this, todo_list.class);
        startActivity(intent);
    }
}