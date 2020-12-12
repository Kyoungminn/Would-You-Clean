package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HostActivity extends AppCompatActivity {
    private Button btn_yes, btn_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        btn_yes = findViewById(R.id.btn_yes);

        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent( HostActivity.this, Host_CrewActivity.class);
                startActivity(intent);
            }
        });

    }
}